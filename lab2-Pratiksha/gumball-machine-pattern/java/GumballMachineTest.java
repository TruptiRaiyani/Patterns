

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine m1;

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
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
        // Gumball machine object
        m1 = new GumballMachine(10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestTwoQuarters()
    {
        m1.insertQuarter();
        m1.insertQuarter();
        assertEquals(50, m1.getTotalCoinValue());
        assertEquals(false, m1.isGumballInSlot());
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
        m1.takeGumballFromSlot();
        assertEquals(false, m1.isGumballInSlot());
    }


    @Test
    public void testAddOneQuarterNeg()
    {
        m1.insertQuarter();
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

 
    

    @Test
    public void testTurnCrank()
    {
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

    

    @Test
    public void testCoinValue()
    {
        m1.insertQuarter();
        assertEquals(25, m1.getTotalCoinValue());
    }

    @Test
    public void testGumballCount()
    {
        assertEquals(10, m1.getCount());
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        assertEquals(9, m1.getCount());
    }
}








