package instrumentTests;

import instruments.Brass;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("Jupiter", "JTR-500-Q", 250.00, 300.00, "Trumpet", "Brass", "Yellow", false, 12, "B", "Intermediate");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(250.00, trumpet.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetBoreSize(){
        assertEquals(12, trumpet.getBore());
    }

    @Test
    public void canGetExperienceLevel(){
        assertEquals("Intermediate", trumpet.getExperienceLevel());
    }
}
