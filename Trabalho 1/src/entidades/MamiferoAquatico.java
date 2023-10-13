package entidades;

/**
 * Subclasse de Mamifero
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class MamiferoAquatico extends Mamifero {
    public final int PACIENCIA_MAXIMA = 40;

    /**
     * Construtor de mamífero aquático.
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
    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    /**
     * Retorna uma String que representa textualmente o mamífero aquático.
     * O método mostra todos os atributos do mamífero aquático de maneira textual.
     * @return atributos do mamífero aquático 
     */
    @Override
    public String toString(){
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() +
                ", temperatura ideal = " + getTemperaturaIdeal() + ", é peludo = " + isPeludo();
    }

    /**
     * Retorna um valor de código hash para o mamífero aquático.  
     * O método mostra todos os atributos do mamífero aquático em formato numérico.
     * @return número inteiro que representa o mamífero aquático 
     */
    @Override
    public int hashCode(){
        return Objects.hash(getId(), getNome(), getEspecie(), getPeso(), getAndarDesejado(), getTempoDeEspera(), getTemperaturaIdeal(), isPeludo());
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
        if(!(o instanceof MamiferoAquatico)){
            return false;
        }
        MamiferoAquatico outroMamiferoAquatico = (MamiferoAquatico)o;
        if((getId() == outroMamiferoAquatico.getId()) && (getNome().equals(outroMamiferoAquatico.getNome())) &&
        (getEspecie().equals(outroMamiferoAquatico.getEspecie())) && (getPeso() == outroMamiferoAquatico.getPeso()) &&
        (getAndarDesejado() == outroMamiferoAquatico.getAndarDesejado()) && (getTempoDeEspera() == outroMamiferoAquatico.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outroMamiferoAquatico.getTemperaturaIdeal()) && (isPeludo() == outroMamiferoAquatico.isPeludo())){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Indica que o mamífero aquático está nadando.
     * O método retorna uma String informando que o mamífero aquático está nadando.
     * @return "nadando"
     */
    public String nadar(){
        return "nadando";
    } 
}
