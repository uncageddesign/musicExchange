package paraphenaliaTests;

import Paraphenalia.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Music Sales", 4.00, 14.99, "Books", "Various", "The Buskers Songbook", "Acoustic");
    }

    @Test
    public void canGetCategory(){
        assertEquals("Books", sheetMusic.getCategory());
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Buskers Songbook", sheetMusic.getTitle());
    }
}
