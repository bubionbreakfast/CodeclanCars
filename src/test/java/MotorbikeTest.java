import org.junit.Before;
import org.junit.Test;
import racetrack.person.Driver;
import racetrack.vehicles.Motorbike;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike;
    Driver driver1;

    @Before
    public void before(){
        driver1 = new Driver("Bob Jane", 25, 76);
        motorbike = new Motorbike("Yamaha", "YZR750", 280, driver1);
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

    @Test
    public void canDrive(){
        assertEquals(3, motorbike.drive());
    }
}
