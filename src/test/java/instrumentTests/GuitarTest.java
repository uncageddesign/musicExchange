package instrumentTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Gretsch", "Streamliner", 400.00, 480.00, "guitar", "Maple", "black", false, 6, "Electric", "Ebony", "f shaped");
    }

    @Test
    public void canGetMake(){
        assertEquals("Gretsch", guitar.getMake());
    }

    @Test public void canGetStringNo(){
        assertEquals(6, guitar.getStringNo());
    }

    @Test
    public void canGetFretMaterial(){
        assertEquals("Ebony", guitar.getFretMaterial());
    }

    @Test public void canGetSoundHoleShape(){
        assertEquals("f shaped", guitar.getSoundHole());
    }

    @Test
    public void canGetToPlay(){
        assertEquals("*gently weeps*", guitar.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(80, guitar.calculateMarkUp(), 0.01);
    }
}
