package entidades;

public class Anfibio extends Animal {
    //public final int PACIENCIA_MAXIMA = 45;

    public Anfibio(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }  

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof Anfibio)){
            return false;
        }
        Anfibio outroAnfibio = (Anfibio)o;
        if(getId() == outroAnfibio.getId() && getNome() == outroAnfibio.getNome() &&
        getEspecie() == outroAnfibio.getEspecie() && getPeso() == outroAnfibio.getPeso() &&
        getAndarDesejado() == outroAnfibio.getAndarDesejado() && getTempoDeEspera() == outroAnfibio.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroAnfibio.getTemperaturaIdeal()){
            return true;
        } else {
            return false;
        }
    }

    public String andar(){
        return "andando";
    }

    public String nadar(){
        return "nadando";
    }
}
