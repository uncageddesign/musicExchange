import Paraphenalia.GuitarStrings;
import Paraphenalia.InstrumentType;
import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Gretsch", "Streamliner", 400.00, 480.00, "guitar", "Maple", "black", false, 6, "Electric", "Ebony", "f shaped");
        piano = new Piano("Roland", "GP609-PE", 9000.00, 9999.00, "Piano", "Wood/Moulded", "Gloss Black", true, "Digital Grand", 2);
        guitarStrings = new GuitarStrings("Ernie Ball", 3.00, 5.99, "replacement strings", "Nickle", "11 -48", InstrumentType.GUITAR);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.removeStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canGetTotalStockMarkUp(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(1079.00, shop.totalMarkUp(), 0.01);
    }

}
