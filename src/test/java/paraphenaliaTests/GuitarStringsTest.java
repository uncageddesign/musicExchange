package paraphenaliaTests;

import Paraphenalia.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Ernie Ball", 3.00, 5.99, "replacement strings", "Nickle", "11 -48");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Ernie Ball", guitarStrings.getBrand());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Nickle", guitarStrings.getMaterial());
    }
}
