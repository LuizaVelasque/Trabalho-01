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
public class Reptil extends Animal {
    //public final int PACIENCIA_MAXIMA = 10;

    /**
     * Construtor de reptil.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     */
    public Reptil(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }
    
    /**
     * Indica que o reptil está andando.
     * O método retorna uma String informando que o reptil está andando.
     * @return "andando"
     */
    public String andar(){
        return "andando";
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
        if(!(o instanceof Reptil)){
            return false;
        }
        Reptil outroReptil = (Reptil)o;
        if(getId() == outroReptil.getId() && getNome() == outroReptil.getNome() &&
        getEspecie() == outroReptil.getEspecie() && getPeso() == outroReptil.getPeso() &&
        getAndarDesejado() == outroReptil.getAndarDesejado() && getTempoDeEspera() == outroReptil.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroReptil.getTemperaturaIdeal()){
            return true;
        } else {
            return false;
        }
    }
}
