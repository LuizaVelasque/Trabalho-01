package entidades;

public class MamiferoVoador extends Mamifero{
    public final int PACIENCIA_MAXIMA = 15;

    public MamiferoVoador(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
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
        if(!(o instanceof MamiferoVoador)){
            return false;
        }
        MamiferoVoador outroMamiferoVoador = (MamiferoVoador)o;
        if(getId() == outroMamiferoVoador.getId() && getNome() == outroMamiferoVoador.getNome() &&
        getEspecie() == outroMamiferoVoador.getEspecie() && getPeso() == outroMamiferoVoador.getPeso() &&
        getAndarDesejado() == outroMamiferoVoador.getAndarDesejado() && getTempoDeEspera() == outroMamiferoVoador.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroMamiferoVoador.getTemperaturaIdeal() && isPeludo() == outroMamiferoVoador.isPeludo()){
            return true;
        } else {
            return false;
        }
    }

    /*public String voar(){
    }*/
}
