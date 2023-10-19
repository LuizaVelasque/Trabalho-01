package entidades;

import java.util.Objects;

/**
 * Subclasse de Mamifero
 * <br><br>
 * 
 * @author Lívia Barbosa e Luiza Velasque
 * @version 1.0
 */
public class MamiferoTerrestre extends Mamifero {
    public final int PACIENCIA_MAXIMA = 35;

    /**
     * Construtor de mamífero terrestre.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param peludo
     */
    public MamiferoTerrestre(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal, boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    /**
     * Retorna uma String que representa textualmente o mamífero terrestre.
     * O método mostra todos os atributos do mamífero terrestre de maneira textual.
     * @return atributos do mamífero terrestre 
     */
    @Override
    public String toString(){
        return  "ID = " + getId() + ", nome = " + getNome() + ", especie = " + getEspecie() + ", andar desejado = "
                + getAndarDesejado() + ", peso = " + getPeso() + ", tempo de espera = " + getTempoDeEspera() + 
                ", temperatura ideal = " + getTemperaturaIdeal() + ", é peludo = " + isPeludo();
    }

    /**
     * Retorna um valor de código hash para o mamífero terrestre.  
     * O método mostra todos os atributos do mamífero terrestre em formato numérico.
     * @return número inteiro que representa o mamífero terrestre 
     */
    @Override
    public int hashCode(){
        return Objects.hash(getId(), getNome(), getEspecie(), getPeso(), getAndarDesejado(), getTempoDeEspera(), getTemperaturaIdeal(), isPeludo());
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
        if(!(o instanceof MamiferoTerrestre)){
            return false;
        }
        MamiferoTerrestre outroMamiferoTerrestre = (MamiferoTerrestre)o;
        if((getId() == outroMamiferoTerrestre.getId()) && (getNome().equals(outroMamiferoTerrestre.getNome())) &&
        (getEspecie().equals(outroMamiferoTerrestre.getEspecie())) && (getPeso() == outroMamiferoTerrestre.getPeso()) &&
        (getAndarDesejado() == outroMamiferoTerrestre.getAndarDesejado()) && (getTempoDeEspera() == outroMamiferoTerrestre.getTempoDeEspera()) &&
        (getTemperaturaIdeal() == outroMamiferoTerrestre.getTemperaturaIdeal()) && (isPeludo() == outroMamiferoTerrestre.isPeludo())){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Indica que o mamífero terrestre está andando.
     * O método retorna uma String informando que o mamífero terrestre está andando.
     * @return "andando"
     */
    public String andar(){
        return "andando";
    }
}
