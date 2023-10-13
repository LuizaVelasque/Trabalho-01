package testes;

import entidades.Anfibio;
import entidades.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class AnfibioTest {

    @Test
    void testEquals() {
        Anfibio anf = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf2 = new Anfibio(450, "Linda", "lindus queridus", 3, 8, 10);
        Anfibio anf3 = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf4 =  new Anfibio(6321, "Webt", "sapus gosmentus", 1, 4, 11);
        Assertions.assertFalse(anf.equals(anf2));
        Assertions.assertFalse(anf2.equals(anf3));
        Assertions.assertFalse(anf3.equals(anf4));
        Assertions.assertTrue(anf3.equals(anf));
        Assertions.assertTrue(anf4.equals(anf4));
    }

    @Test
    void testAndar() {
        Anfibio anf = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf2 = new Anfibio(450, "Linda", "lindus queridus", 3, 8, 10);
        Anfibio anf3 = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf4 =  new Anfibio(6321, "Webt", "sapus gosmentus", 1, 4, 11);
        Assertions.assertTrue(anf.andar() == "andando");
        Assertions.assertTrue(anf2.andar() == "andando");
        Assertions.assertTrue(anf3.andar() == "andando");
        Assertions.assertTrue(anf4.andar() == "andando");
        Assertions.assertFalse(anf4.andar() == "nadando");
    }

    @Test
    void testNadar() {
        Anfibio anf = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf2 = new Anfibio(450, "Linda", "lindus queridus", 3, 8, 10);
        Anfibio anf3 = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        Anfibio anf4 =  new Anfibio(6321, "Webt", "sapus gosmentus", 1, 4, 11);
        Assertions.assertTrue(anf.nadar() == "nadando");
        Assertions.assertTrue(anf2.nadar() == "nadando");
        Assertions.assertTrue(anf3.nadar() == "nadando");
        Assertions.assertTrue(anf4.nadar() == "nadando");
        Assertions.assertFalse(anf4.nadar() == "andando");
    }

    @Test
    void testToString() {
        Anfibio anf = new Anfibio(235, "Anfibiozinho", "lindus queridus", 2, 5, 10);
        int id = 235;
        String nome = "Anfibiozinho";
        String especie = "lindus queridus";
        int peso = 5;
        int andarDesejado = 2;
        int tempoDeEspera = 0;
        int temperaturaIdeal = 10;
        String resultadoEsperado = "ID: " + id + ", nome = " + nome + ", especie = " + especie + ", peso = " + peso +
                ", andarDesejado = " + andarDesejado + ", tempoDeEspera = " + tempoDeEspera + ", temperaturaIdeal = " +
                temperaturaIdeal;
        Assertions.assertEquals(resultadoEsperado, anf.toString());
    }

    @Test
    void testAumentaEspera() {
        Anfibio anf2 = new Anfibio(450, "Linda", "lindus queridus", 3, 8, 10);
        Anfibio anf4 =  new Anfibio(6321, "Webt", "sapus gosmentus", 1, 4, 11);
        Assertions.assertEquals(0, anf2.getTempoDeEspera());
        anf2.aumentaEspera();
        Assertions.assertEquals(1, anf2.getTempoDeEspera());

        /*Assertions.assertEquals(0, anf4.getTempoDeEspera());
        for(int i = 0; i < 40; i++){
            anf2.aumentaEspera();
        }
        Assertions.assertSame(RuntimeException.class, anf2.getTempoDeEspera());*/
    }
}