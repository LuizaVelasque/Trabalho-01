package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entidades.ReptilAquatico;

public class ReptilAquaticoTest {
    @Test
    void testEquals() {
        ReptilAquatico reptilAquatico = new ReptilAquatico(960, "Rainha Elizabeth", "perigosus rainhus", 2, 20, 10);
        ReptilAquatico reptilAquatico2 = new ReptilAquatico(1800, "Beyonce", "lindus divus", 5, 15, 9);
        ReptilAquatico reptilAquatico3 = new ReptilAquatico(960, "Rainha Elizabeth", "perigosus rainhus", 2, 20, 10);
        ReptilAquatico reptilAquatico4 = new ReptilAquatico(450, "Lady Gaga", "divus lgbtus", 4, 10, 8);
        Assertions.assertFalse(reptilAquatico.equals(reptilAquatico2));
        Assertions.assertFalse(reptilAquatico2.equals(reptilAquatico3));
        Assertions.assertFalse(reptilAquatico3.equals(reptilAquatico4));
        Assertions.assertTrue(reptilAquatico.equals(reptilAquatico3));
        Assertions.assertTrue(reptilAquatico4.equals(reptilAquatico4));
    }
}
