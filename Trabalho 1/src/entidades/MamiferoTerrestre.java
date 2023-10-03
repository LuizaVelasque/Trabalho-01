package entidades;

public class MamiferoTerrestre extends Mamifero {
    public final int PACIENCIA_MAXIMA = 35;

    public MamiferoTerrestre(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    @Override
    public String toString(){
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", é peludo = " + isPeludo();
    }

    /*@Override
    public int hashCode(){
    }*/

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof MamiferoTerrestre)){
            return false;
        }
        MamiferoTerrestre outroMamiferoTerrestre = (MamiferoTerrestre)o;
        if(getId() == outroMamiferoTerrestre.getId() && getNome() == outroMamiferoTerrestre.getNome() &&
        getEspecie() == outroMamiferoTerrestre.getEspecie() && getPeso() == outroMamiferoTerrestre.getPeso() &&
        getAndarDesejado() == outroMamiferoTerrestre.getAndarDesejado() && getTempoDeEspera() == outroMamiferoTerrestre.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroMamiferoTerrestre.getTemperaturaIdeal() && isPeludo() == outroMamiferoTerrestre.isPeludo()){
            return true;
        } else {
            return false;
        }
    }
    
    /*public String andar(){
    }*/
}
