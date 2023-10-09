package entidades;

/**
 * Subclasse de Animal
 * <br><br>
 * Essa classe pode ser estendida.
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class Ave extends Animal {
    //public final int PACIENCIA_MAXIMA = 30;
    
    private String corDasPenas;

    /**
     * Construtor da ave.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param corDasPenas 
     */
    public Ave(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasPenas = corDasPenas;
    }

    /**
     * Retorna um valor de código hash para a ave.  
     * O método mostra todos os atributos da ave em formato numérico.
     * @return número inteiro que representa a ave 
     */
    @Override
    public int hashCode(){
        return Objects.hash(id, nome, especie, peso, andarDesejado, tempoDeEspera, temperaturaIdeal, corDasPenas);
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
        if(!(o instanceof Ave)){
            return false;
        }
        Ave outraAve = (Ave)o;
        if(getId() == outraAve.getId() && getNome() == outraAve.getNome() &&
        getEspecie() == outraAve.getEspecie() && getPeso() == outraAve.getPeso() &&
        getAndarDesejado() == outraAve.getAndarDesejado() && getTempoDeEspera() == outraAve.getTempoDeEspera() &&
        getTemperaturaIdeal() == outraAve.getTemperaturaIdeal() && this.corDasPenas == outraAve.corDasPenas){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma String que representa textualmente a ave.
     * O método mostra todos os atributos da ave de maneira textual.
     * @return atributos da ave 
     */
    @Override
    public String toString() {
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", cor das penas = " + this.corDasPenas;
    }

    /**
     * Retorna a cor das penas da ave.
     * Método que retorna uma String da cor das penas da ave
     * @return cor das penas da ave
     */
    public String getCorDasPenas() {
        return corDasPenas;
    }   
    
    /**
     * Indica que a ave está andando.
     * O método retorna uma String informando que a ave está andando.
     * @return "andando"
     */
    public String andar(){
        return "andando";
    }
}
