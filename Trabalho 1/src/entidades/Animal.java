package entidades;

/**
 * Classe que define um animal da arca.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) deve implementar o método <i>aumentaEspera</i> conforme indicado na
 * documentação.
 * <br><br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Animal {
    
    /**
     * Limite da paciência de um animal esperando na fila antes de ir embora.
     */
    //public final int PACIENCIA_MAXIMA = 25; //em segundos (ciclos de espera)
    
    private int id;
    private String nome;
    private String especie;
    private int peso; //em quilos
    private int andarDesejado; //0 é o térreo
    private int tempoDeEspera;
    private int temperaturaIdeal; //em graus Celsius
    
    /**
     * Construtor do animal.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal 
     */
    public Animal(int id, String nome, String especie, int andarDesejado, 
            int peso, int temperaturaIdeal){
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.andarDesejado = andarDesejado;
        this.peso = peso;
        this.temperaturaIdeal = temperaturaIdeal;
    }
    
    @Override
    public String toString() {
        return  "ID: " + this.id + ", nome = " + this.nome + ", especie = " + this.especie + ", peso = " + this.peso + 
        ", andarDesejado = " + this.andarDesejado + ", tempoDeEspera = " + this.tempoDeEspera + ", temperaturaIdeal = " + 
        this.temperaturaIdeal;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAndarDesejado() {
        return andarDesejado;
    }

    public int getTempoDeEspera() {
        return tempoDeEspera;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    /**
     * Retorna o número de identificaçao do animal.
     * O valor é gerado aleatoriamente e está entre 0 e 999999.
     * @return número da identificação do animal
     */
    public int getId(){
        return id;
    }
    
    /**
     * Retorna o peso do animal.
     * O peso é gerado aleatoriamente e está entre 1 e 1.000 quilos.
     * @return peso do animal em quilos
     */
    public int getPeso(){
        return peso;
    }
    
    /**
     * Aumenta o tempo de espera um animal na fila quando passa um ciclo.
     * Esse é o tempo de espera na fila de um andar para embarcar no elevador.
     * Um ciclo ocorre sempre que o método de simular vida na arca é invocado.
     * Esse método não deve ser chamado fora da classe Arca.
     * <br><br>
     * A implementação desse método deve comparar a paciência do animal com
     * o tempo de espera depois de incrementado. Se ela for menor, uma exceção
     * deve ser lançada.
     * <br><br>
     * @throws RuntimeException se o animal está esperando a mais tempo que a paciência
     * @see professor.entidades.Arca#simularVida
     */
    /*public void aumentaEspera(){
    }*/

    /*public void resetaTempoDeEspera(){
    }*/

    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((especie == null) ? 0 : especie.hashCode());
        result = prime * result + peso;
        result = prime * result + andarDesejado;
        result = prime * result + tempoDeEspera;
        result = prime * result + temperaturaIdeal;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(!(o instanceof Animal)){
            return false;
        }
        Animal outroAnimal = (Animal)o;
        if(this.id == outroAnimal.id && this.nome == outroAnimal.nome &&
        this.especie == outroAnimal.especie && this.peso == outroAnimal.peso &&
        this.andarDesejado == outroAnimal.andarDesejado && this.tempoDeEspera == outroAnimal.tempoDeEspera &&
        this.temperaturaIdeal == outroAnimal.temperaturaIdeal){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, nome, especie, peso, andarDesejado, tempoDeEspera, temperaturaIdeal);
    }
}
