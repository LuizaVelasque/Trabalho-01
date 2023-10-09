package entidades;

/**
 * Subclasse de Mamifero
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class MamiferoVoador extends Mamifero{
    //public final int PACIENCIA_MAXIMA = 15;

    /**
     * Construtor de mamífero voador.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param peludo
     */
    public MamiferoVoador(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    /**
     * Retorna uma String que representa textualmente o mamífero voador.
     * O método mostra todos os atributos do mamífero voador de maneira textual.
     * @return atributos do mamífero voador 
     */
    @Override
    public String toString(){
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", é peludo = " + isPeludo();
    }

    /**
     * Retorna um valor de código hash para o mamífero voador.  
     * O método mostra todos os atributos do mamífero voador em formato numérico.
     * @return número inteiro que representa o mamífero voador 
     */
    @Override
    public int hashCode(){
        return Objects.hash(id, nome, especie, peso, andarDesejado, tempoDeEspera, temperaturaIdeal, peludo);
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
        if(!(o instanceof MamiferoVoador)){
            return false;
        }
        MamiferoVoador outroMamiferoVoador = (MamiferoVoador)o;
        if((getId() == outroMamiferoVoador.getId()) && (getNome().equals(outroMamiferoVoador.getNome())) &&
        (getEspecie().equals(outroMamiferoVoador.getEspecie())) && (getPeso() == outroMamiferoVoador.getPeso()) &&
        (getAndarDesejado() == outroMamiferoVoador.getAndarDesejado()) && (getTempoDeEspera() == outroMamiferoVoador.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outroMamiferoVoador.getTemperaturaIdeal()) && (isPeludo() == outroMamiferoVoador.isPeludo())){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Indica que o mamífero voador está voando.
     * O método retorna uma String informando que o mamífero voador está voando.
     * @return "voando"
     */
    public String voar(){
        return "voando";
    }
}
