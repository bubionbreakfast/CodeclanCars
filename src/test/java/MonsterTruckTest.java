import org.junit.Before;
import org.junit.Test;
import racetrack.vehicles.MonsterTruck;

import static org.junit.Assert.assertEquals;

public class MonsterTruckTest {

    MonsterTruck monsterTruck;

    @Before
    public void before(){
        monsterTruck = new MonsterTruck("Ford", "F150", 80);
    }


    @Test
    public void canGetMake(){
        assertEquals("Ford", monsterTruck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("F150", monsterTruck.getModel());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(80, monsterTruck.getSpeed());
    }

    @Test
    public void canDrive(){
        assertEquals(1, monsterTruck.drive());
    }
}
