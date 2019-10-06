package paraphenaliaTests;

import Paraphenalia.GuitarStrings;
import Paraphenalia.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Ernie Ball", 3.00, 5.99, "replacement strings", "Nickle", "11 -48", InstrumentType.GUITAR);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Ernie Ball", guitarStrings.getBrand());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Nickle", guitarStrings.getMaterial());
    }

    @Test
    public void canGetAccessoryInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitarStrings.getInstrumentType());
    }
}
