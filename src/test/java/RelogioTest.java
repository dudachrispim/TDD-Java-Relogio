package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RelogioTest {
	@Test
    public void testCriacaoRelogio() {
        Relogio relogio = new Relogio();
        assertEquals("00:00:00", relogio.obterHora());
    }
    
    @Test
    public void testReiniciarParaMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.reiniciarParaMeiaNoite();
        assertEquals("00:00:00", relogio.obterHora());
    }
    
    @Test
    public void testObterHoraFormato24h() {
        Relogio relogio = new Relogio();
        relogio.setHora(13);
        relogio.setMinuto(30);
        relogio.setSegundo(45);
        assertEquals("13:30:45", relogio.obterHoraFormato24h());
    }

    @Test
    public void testObterHoraFormatoAMPM() {
        Relogio relogio = new Relogio();
        relogio.setHora(13);
        relogio.setMinuto(30);
        relogio.setSegundo(45);
        assertEquals("01:30:45 PM", relogio.obterHoraFormatoAMPM());
    }
}
