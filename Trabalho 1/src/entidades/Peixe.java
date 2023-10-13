package entidades;

/**
 * Subclasse de Animal
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class Peixe extends Animal {
    public final int PACIENCIA_MAXIMA = 60;

    private String corDasEscamas;

    /**
     * Construtor de peixe.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param corDasEscamas 
     */
    public Peixe(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasEscamas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    /**
     * Retorna um valor de código hash para o peixe.  
     * O método mostra todos os atributos do peixe em formato numérico.
     * @return número inteiro que representa o peixe 
     */
    @Override
    public int hashCode(){
        return Objects.hash(getId(), getNome(), getEspecie(), getPeso(), getAndarDesejado(), getTempoDeEspera(), getTemperaturaIdeal(), corDasEscamas);
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
        if(!(o instanceof Peixe)){
            return false;
        }
        Peixe outroPeixe = (Peixe)o;
        if((getId() == outroPeixe.getId()) && (getNome().equals(outroPeixe.getNome())) &&
        (getEspecie().equals(outroPeixe.getEspecie())) && (getPeso() == outroPeixe.getPeso()) &&
        (getAndarDesejado() == outroPeixe.getAndarDesejado()) && (getTempoDeEspera() == outroPeixe.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outroPeixe.getTemperaturaIdeal()) && (this.corDasEscamas.equals(outroPeixe.corDasEscamas))){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma String que representa textualmente o peixe.
     * O método mostra todos os atributos do peixe de maneira textual.
     * @return atributos do peixe
     */
    @Override
    public String toString() {
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", cor das escamas = " + this.corDasEscamas;
    }

    /**
     * Retorna a cor das escamas do peixe.
     * Método que retorna uma String da cor das escamas do peixe
     * @return cor das escamas do peixe
     */
    public String getCorDasEscamas() {
        return corDasEscamas;
    }

    /**
     * Indica que o peixe está nadando.
     * O método retorna uma String informando que o peixe está nadando.
     * @return "nadando"
     */
    public String nadar(){
        return "nadando";
    }
}
