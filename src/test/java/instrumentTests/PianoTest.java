package instrumentTests;

import instruments.Percussion;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Roland", "GP609-PE", 9000.00, 9999.00, "Piano", "Wood/Moulded", "Gloss Black", true, "Digital Grand", 2);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(9999.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Digital Grand", piano.getType());
    }

    @Test
    public void canGetNoOfPorts(){
        assertEquals(2, piano.getPorts());
    }
}

