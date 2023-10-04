package entidades;

public class Reptil extends Animal {
    //public final int PACIENCIA_MAXIMA = 10;

    public Reptil(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }
    
    public String andar(){
        return "andando";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof Reptil)){
            return false;
        }
        Reptil outroReptil = (Reptil)o;
        if(getId() == outroReptil.getId() && getNome() == outroReptil.getNome() &&
        getEspecie() == outroReptil.getEspecie() && getPeso() == outroReptil.getPeso() &&
        getAndarDesejado() == outroReptil.getAndarDesejado() && getTempoDeEspera() == outroReptil.getTempoDeEspera() &&
        getTemperaturaIdeal() == outroReptil.getTemperaturaIdeal()){
            return true;
        } else {
            return false;
        }
    }
}
