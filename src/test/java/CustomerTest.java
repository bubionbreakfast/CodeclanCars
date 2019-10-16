import org.junit.Before;
import org.junit.Test;
import racetrack.person.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


        Customer customer;

        @Before
        public void before(){
            customer = new Customer("Tony", 100);
        }

        @Test
        public void canGetName(){
            assertEquals("Tony", customer.getName());
        }

        @Test
        public void canGetWallet(){
            assertEquals(100, customer.getWallet());
        }



    }
