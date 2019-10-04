package instrumentTests;

import instruments.Brass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;

    @Before
    public void setUp(){
        brass = new Brass("Jupiter", "JTR-500-Q", 250.00, 300.00, "Trumpet", "Brass", "Yellow", false, 12, "B");
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(250.00, brass.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetBoreSize(){
        assertEquals(12, brass.getBore());
    }
}
