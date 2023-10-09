package entidades;

/**
 * Subclasse de Reptil
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class ReptilAquatico extends Reptil {
    //public final int PACIENCIA_MAXIMA = 15;

    /**
     * Construtor de reptil aquático. 
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     */
    public ReptilAquatico(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    /**
     * Indica que o reptil aquático está nadando.
     * O método retorna uma String informando que o reptil aquático está nadando.
     * @return "nadando"
     */
    public String nadar(){
        return "nadando";
    }

    /**
     * Indica se um objeto é igual a outro objeto.
     * O método compara os conteúdos que estão dentro de dois objetos e verifica se eles são iguais.
     * @param o
     * @return true ou false 
     */
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof ReptilAquatico)){
            return false;
        }
        ReptilAquatico outroReptilAquatico = (ReptilAquatico)o;
        if((getId() == outroReptilAquatico.getId()) && (getNome().equals(outroReptilAquatico.getNome())) &&
        (getEspecie().equals(outroReptilAquatico.getEspecie())) && (getPeso() == outroReptilAquatico.getPeso()) &&
        (getAndarDesejado() == outroReptilAquatico.getAndarDesejado()) && (getTempoDeEspera() == outroReptilAquatico.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outroReptilAquatico.getTemperaturaIdeal())){
            return true;
        } else {
            return false;
        }
    }
}
