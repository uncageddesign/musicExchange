package instrumentTests;

import instruments.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind woodwind;

    @Before
    public void setUp(){

        woodwind = new Woodwind("Yamaha", "YFL212", 440.00, 590.00, "Flute", "Silver Plated", "Silver", false, "None", "C");

    }

    @Test
    public void canGetModel(){
        assertEquals("YFL212", woodwind.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("C", woodwind.getType());
    }
}
