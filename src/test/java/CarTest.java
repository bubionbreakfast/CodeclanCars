import org.junit.Before;
import org.junit.Test;
import racetrack.person.Driver;
import racetrack.vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Driver driver1;

    @Before

    public void before(){
        car = new Car("Porsche", "911", 180, driver1);
        driver1 = new Driver("Bob Jane", 25, 76);

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
