

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
    private GumballMachine gumballM1;
    SoldState soldState = new SoldState(gumballM1);

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
        gumballM1 = new GumballMachine(10);
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
    public void testGumballInSlotAfterInsertingQuarterAndCranking()
    {
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    //Checking whether the machine slot already has a gumball in the beginning
    @Test
    public void testGumballInSlotInTheBeginning()
    {
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    //Checking whether gumball will be dispensed before inserting any coin
    @Test
    public void testCrankWithoutInsertingAnyCoin()
    {
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    //Try to take a dispensed gumball and crank the machine again without inserting any coin
    @Test
    public void testTakeGumballAndCrankAgainWithoutInsertingAnyCoin()
    {
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        soldState.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
}





