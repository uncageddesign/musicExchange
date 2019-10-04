package paraphenaliaTests;

import Paraphenalia.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void setUp(){
        amplifier = new Amplifier("Marshall", 120.00, 170.00, "Amplifiers", "MG30FX", "Combo", 10);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(170.00, amplifier.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetAmpSize(){
        assertEquals(10, amplifier.getSize());
    }
}
