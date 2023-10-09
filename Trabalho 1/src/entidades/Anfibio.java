package entidades;

/**
 * Subclasse de Animal
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class Anfibio extends Animal {
    //public final int PACIENCIA_MAXIMA = 45;

    /**
     * Construtor do anfíbio.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal 
     */
    public Anfibio(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
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
        if(!(o instanceof Anfibio)){
            return false;
        }
        Anfibio outroAnfibio = (Anfibio)o;
        if(getId() == outroAnfibio.getId() && getNome() == outroAnfibio.getNome() &&
        getEspecie() == outroAnfibio.getEspecie() && getPeso() == outroAnfibio.getPeso() &&
        getAndarDesejado() == outroAnfibio.getAndarDesejado() && getTempoDeEspera() == outroAnfibio.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroAnfibio.getTemperaturaIdeal()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Indica que o anfíbio está andando.
     * O método retorna uma String informando que o anfíbio está andando.
     * @return "andando"
     */
    public String andar(){
        return "andando";
    }

    /**
     * Indica que o anfíbio está nadando.
     * O método retorna uma String informando que o anfíbio está nadando.
     * @return "nadando"
     */
    public String nadar(){
        return "nadando";
    }
}
