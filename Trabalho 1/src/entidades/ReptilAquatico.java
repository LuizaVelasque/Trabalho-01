package entidades;

public class ReptilAquatico extends Reptil {
    //public final int PACIENCIA_MAXIMA = 15;

    public ReptilAquatico(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    public String nadar(){
        return "nadando";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof ReptilAquatico)){
            return false;
        }
        ReptilAquatico outroReptilAquatico = (ReptilAquatico)o;
        if(getId() == outroReptilAquatico.getId() && getNome() == outroReptilAquatico.getNome() &&
        getEspecie() == outroReptilAquatico.getEspecie() && getPeso() == outroReptilAquatico.getPeso() &&
        getAndarDesejado() == outroReptilAquatico.getAndarDesejado() && getTempoDeEspera() == outroReptilAquatico.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroReptilAquatico.getTemperaturaIdeal()){
            return true;
        } else {
            return false;
        }
    }
}
