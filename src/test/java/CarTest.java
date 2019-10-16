import org.junit.Before;
import org.junit.Test;
import racetrack.vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Porsche", "911", 180);
    }


    @Test
    public void canGetMake(){
        assertEquals("Porsche", car.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("911", car.getModel());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(180, car.getSpeed());
    }

    @Test
    public void canDrive(){
        assertEquals(2, car.drive());
    }
}
