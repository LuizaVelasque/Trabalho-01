package entidades;

public abstract class Mamifero extends Animal {
    private boolean peludo;

    public Mamifero(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.peludo = peludo;
    }

    public boolean isPeludo() {
        return peludo;
    }
}
