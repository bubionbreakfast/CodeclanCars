import org.junit.Before;
import org.junit.Test;
import racetrack.IDrive;
import racetrack.RaceTrack;
import racetrack.person.Driver;
import racetrack.vehicles.Car;
import racetrack.vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class RaceTrackTest {

    RaceTrack raceTrack;
    Car car1;
    Driver driver1;


    @Before
    public void before(){
        raceTrack = new RaceTrack("Monza", 150);
        car1 = new Car("Ford", "Mondeo", 76);
        driver1 = new Driver("Terance", 75, 63);
    }

    @Test
    public void canGetName(){
        assertEquals("Monza", raceTrack.getName());
    }

    @Test
    public void canGetDistance(){
        assertEquals(150, raceTrack.getDistance());
    }

    @Test
    public void canAddVehicle(){
        raceTrack.addVehicleToRaceTrack(car1);
        assertEquals(1, raceTrack.getVehicleCount());
    }

    @Test
    public void canAddDriver(){
        raceTrack.addDriverToRaceTrack(driver1);
        assertEquals(1, raceTrack.getDriverCount());

    }
}
