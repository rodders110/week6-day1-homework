import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBottle {
    private Bottle bottle;

    @Before
    public void Before(){
         bottle = new Bottle(100);
    }

    @Test
    public void bottleHasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void bottleCanDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void bottleCanEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottleCanFill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
