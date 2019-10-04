package instrumentTests;

import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion percussion;

    @Before
    public void setUp(){
        percussion = new Percussion("Mirage", "Raven", 150.00, 200.00, "Drum Kit", "6-ply", "Red", false, "Full Size");
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(200.00, percussion.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Full Size", percussion.getType());
    }
}
