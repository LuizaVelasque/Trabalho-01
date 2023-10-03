package entidades;

public class Ave extends Animal {
    public final int PACIENCIA_MAXIMA = 30;
    
    private String corDasPenas;

    public Ave(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasPenas = corDasPenas;
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

    @Override
    public String toString() {
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", cor das penas = " + this.corDasPenas;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }   
    
    /*public String andar(){
    }*/
}
