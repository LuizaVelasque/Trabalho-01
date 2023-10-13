package entidades;

/**
 * Subclasse de Ave
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class AveVoadora extends Ave {
    public final int PACIENCIA_MAXIMA = 20;

    /**
     * Construtor da ave voadora.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param corDasPenas 
     */
    public AveVoadora(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    /**
     * Indica que a ave voadora está voando.
     * O método retorna uma String informando que a ave voadora está voando.
     * @return "voando"
     */
    public String voar(){
        return "voando";
    }

    /**
     * Indica se um objeto é igual a outro objeto.
     * O método compara os conteúdos que estão dentro de dois objetos e verifica se eles são iguais.
     * @param o
     * @return true ou false 
     */
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
        if((getId() == outraAveVoadora.getId()) && (getNome().equals(outraAveVoadora.getNome())) &&
        (getEspecie().equals(outraAveVoadora.getEspecie())) && (getPeso() == outraAveVoadora.getPeso()) &&
        (getAndarDesejado() == outraAveVoadora.getAndarDesejado()) && (getTempoDeEspera() == outraAveVoadora.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outraAveVoadora.getTemperaturaIdeal()) && (getCorDasPenas().equals(outraAveVoadora.getCorDasPenas()))){
            return true;
        } else {
            return false;
        }
    }
}
