package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entidades.Ave;

public class AveTest {
    @Test
    void testAndar() {
        Ave ave = new Ave(700, "Barbie", "mundus coloridus", 5, 5, 5, "rosa");
        Ave ave2 = new Ave(560, "Joaozinho", "swiftie chatus", 3, 1, 10, "prata");
        Ave ave3 = new Ave(65412, "Blue", "ararinhus azulis", 0, 1, 25, "azul");
        Ave ave4 = new Ave(560, "Joaozinho", "swiftie chatus", 3, 1, 10, "prata"); 
        Assertions.assertTrue(ave.andar() == "andando");
        Assertions.assertTrue(ave2.andar() == "andando");
        Assertions.assertTrue(ave3.andar() == "andando");
        Assertions.assertTrue(ave4.andar() == "andando");
        Assertions.assertFalse(ave4.andar() == "nadando");
    }

    @Test
    void testEquals() {
        Ave ave = new Ave(700, "Barbie", "mundus coloridus", 5, 5, 5, "rosa");
        Ave ave2 = new Ave(560, "Joaozinho", "swiftie chatus", 3, 1, 10, "prata");
        Ave ave3 = new Ave(65412, "Blue", "ararinhus azulis", 0, 1, 25, "azul");
        Ave ave4 = new Ave(560, "Joaozinho", "swiftie chatus", 3, 1, 10, "prata");
        Assertions.assertFalse(ave.equals(ave2));
        Assertions.assertFalse(ave2.equals(ave3));
        Assertions.assertFalse(ave3.equals(ave4));
        Assertions.assertTrue(ave2.equals(ave4));
        Assertions.assertTrue(ave.equals(ave));
    }

    @Test
    void testToString() {
        Ave ave3 = new Ave(65412, "Blue", "ararinhus azulis", 0, 1, 25, "azul");
        int id = 65412;
        String nome = "Blue";
        String especie = "ararinhus azulis";
        int peso = 1;
        int andarDesejado = 0;
        int tempoDeEspera = 0;
        int temperaturaIdeal = 25;
        String corDasPenas = "azul";
        String resultadoEsperado = "ID = " + id + ", nome = " + nome + ", especie = " + especie + ", andar desejado = "
        + andarDesejado + ", peso = " + peso + ", tempo de espera = " + tempoDeEspera +
        ", temperatura ideal = " + temperaturaIdeal + ", cor das penas = " + corDasPenas;
        Assertions.assertEquals(resultadoEsperado, ave3.toString());
    }

    @Test
    void testAumentaEspera() {
        Ave ave2 = new Ave(560, "Joaozinho", "swiftie chatus", 3, 1, 10, "prata");
        Assertions.assertEquals(0, ave2.getTempoDeEspera());
        ave2.aumentaEspera();
        Assertions.assertEquals(1, ave2.getTempoDeEspera());
    }
}
