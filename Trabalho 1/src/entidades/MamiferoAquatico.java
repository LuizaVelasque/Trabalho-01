package entidades;

public class MamiferoAquatico extends Mamifero {
    //public final int PACIENCIA_MAXIMA = 40;

    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
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
        if(!(o instanceof MamiferoAquatico)){
            return false;
        }
        MamiferoAquatico outroMamiferoAquatico = (MamiferoAquatico)o;
        if(getId() == outroMamiferoAquatico.getId() && getNome() == outroMamiferoAquatico.getNome() &&
        getEspecie() == outroMamiferoAquatico.getEspecie() && getPeso() == outroMamiferoAquatico.getPeso() &&
        getAndarDesejado() == outroMamiferoAquatico.getAndarDesejado() && getTempoDeEspera() == outroMamiferoAquatico.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroMamiferoAquatico.getTemperaturaIdeal() && isPeludo() == outroMamiferoAquatico.isPeludo()){
            return true;
        } else {
            return false;
        }
    }

    public String nadar(){
        return "nadando";
    } 
}
