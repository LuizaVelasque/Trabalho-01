package entidades;

/**
 * Subclasse abstrata de Animal
 * <br><br>
 * Essa classe pode ser estendida.
 * <br><br>
 * Essa classe não pode ser instanciada.
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public abstract class Mamifero extends Animal {
    private boolean peludo;

    /**
     * Construtor de mamífero.
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
    public Mamifero(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.peludo = peludo;
    }

    /**
     * Indica se o mamífero é peludo ou não.
     * Retorna um valor booleano informando se um mamífero é peludo ou não.
     * @return true ou false
     */
    public boolean isPeludo() {
        return peludo;
    }
}
