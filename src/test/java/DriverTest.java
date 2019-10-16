import org.junit.Before;
import org.junit.Test;
import racetrack.person.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;

    @Before
    public void before(){
        driver = new Driver("Tony", 100, 58);
    }

    @Test
    public void canGetName(){
        assertEquals("Tony", driver.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(100, driver.getWallet());
    }

    @Test
    public void canGetSkill(){
        assertEquals(58, driver.getSkill());
    }


}
