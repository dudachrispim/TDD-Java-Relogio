package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RelogioTest {
	@Test
    public void testCriacaoRelogio() {
        Relogio relogio = new Relogio();
        assertEquals("00:00:00", relogio.obterHora());
    }
}
