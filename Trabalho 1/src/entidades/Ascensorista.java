package entidades;
import entidades.Andar;
import entidades.Elevador;


/**
 * Classe que traz a lógica do algoritmo de uso do elevador.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento do uso do elevador, mas esses
 * <strong>atributos e métodos devem ser todos privados</strong>. O único
 * método público deve ser "agir".
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Ascensorista {
    
    /**
     * Construtor padrão de Ascensorista.
     * Esse construtor sem parâmetros que será usado pela Arca. Embora a
     * assinatura do construtor não deva ser mudada, o código interno pode
     * ser alterado conforme a necessidade.
     */
    public Ascensorista(){
        /* TODO: codificar */
    }
    
    /**
     * Executa a lógica de controle do elevador e dos animais.
     * Esse método é o único método de controle invocado durante a simulação 
     * de vida da arca.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os animais do elevador
     * e da fila de animais que estão esperando no andar. A partir desses
     * estados, você pode movimentar animais para dentro e para fora do
     * elevador usando os métodos "desembarcar" e "embarcar" por exemplo.
     * O estado do elevador também é importante para acionar os comandos do 
     * elevador como "drenar", "encher", "subir" e "descer".
     * <br><br>
     * <strong> Os métodos "subir" e "descer" só podem ser chamados uma vez por 
     * execução do método! </strong>
     * 
     * @param elevador o elevador controlado pelo ascensorista
     * @param andar o andar no qual o elevador está parado
     */
    public void agir(Elevador elevador, Andar andar) {
        Animal[] filaPorAndar = andar.checarFilaParaElevador();
        Animal[] animaisNoElevador = elevador.checarAnimaisNoElevador();
        Animal proximoDaFila = andar.chamarProximoDaFila();
        int pesoNoElevador = 0;
        boolean limiteDePesoAtingido = false;
        for (Animal animal : animaisNoElevador) {
            pesoNoElevador = pesoNoElevador +  animal.getPeso();
        }
        boolean animaisAquaticosNoElevador = false; 
        boolean animaisTerrestresNoElevador = false; 
        boolean animaisAnfibiosNoElevador = false; 

        for (Animal animal : animaisNoElevador) {
            if (animal instanceof Peixe || animal instanceof MamiferoAquatico) {
                animaisAquaticosNoElevador = true;
                break;
            } else if (animal instanceof Anfibio || animal instanceof ReptilAquatico) {
                animaisAnfibiosNoElevador = true;
            } else {
                animaisTerrestresNoElevador = true;
            }
        }
        if (elevador.isCheioDeAgua() && !animaisAquaticosNoElevador) {
            elevador.drenar();
        }
        for (Animal animal : animaisNoElevador) {
            if (animal.getAndarDesejado() == elevador.getAndar()) {
                elevador.desembarcar(animal, andar);
            }
        }
        for (Animal animal : filaPorAndar) {
            if (pesoNoElevador + animal.getPeso() <= elevador.LIMITE_DE_PESO) {
                if (Math.abs(elevador.getTemperaturaDoArCondicionado() - animal.getTemperaturaIdeal()) <= 15) {
                    if ((animal instanceof Peixe || animal instanceof MamiferoAquatico || animal instanceof ReptilAquatico ||
                            animal instanceof Anfibio) && !animaisTerrestresNoElevador) {
                        elevador.encher();
                        elevador.embarcar(animal);
                        andar.tirarDaFila(animal);
                        pesoNoElevador += animal.getPeso();
                    } else if ((animal instanceof MamiferoTerrestre || animal instanceof MamiferoVoador || animal instanceof Ave ||
                            animal instanceof Reptil || animal instanceof Anfibio) && !animaisAquaticosNoElevador) {
                        elevador.drenar();
                        elevador.embarcar(animal);
                        andar.tirarDaFila(animal);
                        pesoNoElevador += animal.getPeso();
                    }
                }
            } else {
                limiteDePesoAtingido = true;
                break; 
            }
        }
        if (!limiteDePesoAtingido) {
            mudarPosicaoDoElevador(elevador, andar);
        }
    }

    /**
     * Método responsável pela mudança da posição do elevador de acordo com o 
     * andar desejado dos animais no elevador e dos animais na fila do andar.
     * <br><br>
     * O método verifica o próximo andar de destino para o elevador com base na localização atual 
     * do elevador, na fila de animais esperando no andar e nos animais dentro do elevador. 
     * O elevador será movido para o andar desejado do animal no elevadorque está mais 
     * próximo do andar atual.
     * @param elevador o elevador controlado pelo ascensorista
     * @param andar o andar no qual o elevador está parado
     */
    private void mudarPosicaoDoElevador(Elevador elevador, Andar andar) {
        int andarAtual = elevador.getAndar();
        int proximoAndar = -1; 
        Animal[] filaPorAndar = andar.checarFilaParaElevador();
        Animal[] animaisNoElevador = elevador.checarAnimaisNoElevador();
        if (filaPorAndar.length > 0) {
            proximoAndar = andarAtual; 
        } else {
            int menorDiferenca = Integer.MAX_VALUE;
            for (Animal animal : animaisNoElevador) {
                int diferenca = Math.abs(animal.getAndarDesejado() - andarAtual);
                if (diferenca < menorDiferenca) {
                    menorDiferenca = diferenca;
                    proximoAndar = animal.getAndarDesejado();
                }
            }
        }
        if (proximoAndar != -1) {
            if (proximoAndar > andarAtual) {
                elevador.subir();
            } else if (proximoAndar < andarAtual) {
                elevador.descer();
            }
        }
    }
}
