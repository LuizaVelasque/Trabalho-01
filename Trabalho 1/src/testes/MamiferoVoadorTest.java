package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entidades.MamiferoVoador;

public class MamiferoVoadorTest {

    @Test
    void testEquals() {
        MamiferoVoador mamiferoVoador = new MamiferoVoador(856, "Fofuxo", "voadoris animalis", 5, 5, 21, true);
        MamiferoVoador mamiferoVoador2 = new MamiferoVoador(856, "Fofuxo", "voadoris animalis", 5, 5, 21, true);
        MamiferoVoador mamiferoVoador3 = new MamiferoVoador(600, "Bonituxo", "bonitus lindus", 2, 2, 20, false);
        MamiferoVoador mamiferoVoador4 = new MamiferoVoador(342, "Linduxo", "lindus queridus", 1, 3, 19, false);
        Assertions.assertTrue(mamiferoVoador.equals(mamiferoVoador2));
        Assertions.assertFalse(mamiferoVoador2.equals(mamiferoVoador3));
        Assertions.assertFalse(mamiferoVoador3.equals(mamiferoVoador4));
        Assertions.assertTrue(mamiferoVoador4.equals(mamiferoVoador4));
    }

    @Test
    void testToString() {
        MamiferoVoador mamiferoVoador = new MamiferoVoador(856, "Fofuxo", "voadoris animalis", 5, 5, 21, true);
        int id = 856;
        String nome = "Fofuxo";
        String especie = "voadoris animalis";
        int peso = 5;
        int andarDesejado = 5;
        int tempoDeEspera = 0;
        int temperaturaIdeal = 21;
        boolean peludo = true;
        String resultado = "ID = " + id + ", nome = " + nome + ", especie = " + especie + ", andar desejado = "
        + andarDesejado + ", peso = " + peso + ", tempo de espera = " + tempoDeEspera +
        ", temperatura ideal = " + temperaturaIdeal + ", é peludo = " + peludo;
        Assertions.assertEquals(resultado, mamiferoVoador.toString());
    }

    @Test
    void testVoar() {
        MamiferoVoador mamiferoVoador = new MamiferoVoador(856, "Fofuxo", "voadoris animalis", 5, 5, 21, true);
        MamiferoVoador mamiferoVoador2 = new MamiferoVoador(856, "Fofuxo", "voadoris animalis", 5, 5, 21, true);
        MamiferoVoador mamiferoVoador3 = new MamiferoVoador(600, "Bonituxo", "bonitus lindus", 2, 2, 20, false);
        MamiferoVoador mamiferoVoador4 = new MamiferoVoador(342, "Linduxo", "lindus queridus", 1, 3, 19, false);
        Assertions.assertTrue(mamiferoVoador.voar() == "voando");
        Assertions.assertTrue(mamiferoVoador2.voar() == "voando");
        Assertions.assertTrue(mamiferoVoador3.voar() == "voando");
        Assertions.assertTrue(mamiferoVoador4.voar() == "voando");
        Assertions.assertFalse(mamiferoVoador4.voar() == "nadando");
    }

    @Test
    void testAumentaEspera() {
        MamiferoVoador mamiferoVoador3 = new MamiferoVoador(600, "Bonituxo", "bonitus lindus", 2, 2, 20, false);
        Assertions.assertEquals(0, mamiferoVoador3.getTempoDeEspera());
        for(int i = 0; i < 10; i++){
            mamiferoVoador3.aumentaEspera();
        }
        Assertions.assertEquals(10, mamiferoVoador3.getTempoDeEspera());
    }
}
