package instrumentTests;

import instruments.Flute;
import instruments.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp(){

        flute = new Flute("Yamaha", "YFL212", 440.00, 590.00, "Flute", "Silver Plated", "Silver", false, "None", "C", "Intermediate");

    }

    @Test
    public void canGetModel(){
        assertEquals("YFL212", flute.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("C", flute.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("*Lizzo rocking out*", flute.play());
    }

    @Test
    public void canGetExperienceLevel(){
        assertEquals("Intermediate", flute.getExperienceLevel());
    }
}
