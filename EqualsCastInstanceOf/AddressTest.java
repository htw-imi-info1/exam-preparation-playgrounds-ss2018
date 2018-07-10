

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AddressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressTest
{
    private Address wh1;
    private Address wh2;
    private Address udl;

    /**
     * Default constructor for test class AddressTest
     */
    public AddressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        wh1 = new Address("Wilhelminenhofstr.", "Berlin");
        wh2 = new Address("Wilhelminenhofstr.", "Berlin");
        udl = new Address("Unter den Linden", "Berlin");
    }


    @Test
    public void testNotEqual()
    {
        assertEquals(false, wh1.equals(udl));
    }

    @Test
    public void testEqual()
    {
        assertEquals(true, wh1.equals(wh2));
    }
}



