package entidades;

public class AveVoadora extends Ave {
    public final int PACIENCIA_MAXIMA = 20;

    public AveVoadora(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    /*public String voar(){
    }*/

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof AveVoadora)){
            return false;
        }
        AveVoadora outraAveVoadora = (AveVoadora)o;
        if(getId() == outraAveVoadora.getId() && getNome() == outraAveVoadora.getNome() &&
        getEspecie() == outraAveVoadora.getEspecie() && getPeso() == outraAveVoadora.getPeso() &&
        getAndarDesejado() == outraAveVoadora.getAndarDesejado() && getTempoDeEspera() == outraAveVoadora.getTempoDeEspera() &&
        getTemperaturaIdeal() == outraAveVoadora.getTemperaturaIdeal() && getCorDasPenas() == outraAveVoadora.getCorDasPenas()){
            return true;
        } else {
            return false;
        }
    }
}
