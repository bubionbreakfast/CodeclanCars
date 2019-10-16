import org.junit.Before;
import org.junit.Test;
import racetrack.vehicles.Motorbike;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike;

    @Before
    public void before(){
        motorbike = new Motorbike("Yamaha", "YZR750", 280);
    }


    @Test
    public void canGetMake(){
        assertEquals("Yamaha", motorbike.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("YZR750", motorbike.getModel());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(280, motorbike.getSpeed());
    }
}
