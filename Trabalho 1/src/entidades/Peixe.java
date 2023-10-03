package entidades;

public class Peixe extends Animal {
    public final int PACIENCIA_MAXIMA = 60;

    private String corDasEscamas;

    public Peixe(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasEscamas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    /*@Override
    public int hashCode() {
    }*/

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
        if(getId() == outroPeixe.getId() && getNome() == outroPeixe.getNome() &&
        getEspecie() == outroPeixe.getEspecie() && getPeso() == outroPeixe.getPeso() &&
        getAndarDesejado() == outroPeixe.getAndarDesejado() && getTempoDeEspera() == outroPeixe.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroPeixe.getTemperaturaIdeal() && this.corDasEscamas == outroPeixe.corDasEscamas){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", cor das escamas = " + this.corDasEscamas;
    }

    public String getCorDasEscamas() {
        return corDasEscamas;
    }

    /*public String nadar(){
    }*/
}
