

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
    public void testQQHappy()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void testQDDNHappy()
    {
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void testQDNNNHappy()
    {
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void testQNNNNNHappy()
    {
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    

    @Test
    public void testNoFiftyCentsToHasFiftyCentsStateTransition()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        boolean isHasFiftyCentsState = false;
        if (gumballM1.getState() instanceof HasFiftyCentsState)
            isHasFiftyCentsState = true;
        
        assertEquals(true, isHasFiftyCentsState);
    }
    
    @Test
    public void testHasFiftyCentsToSoldState()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        boolean isSoldState = false;
        if (gumballM1.getState() instanceof SoldState)
            isSoldState = true;
        
        assertEquals(true, isSoldState);
    
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
    public void testTakeGumballAndCrankAgainWithoutInsertingAnyCoinQQ()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        soldState.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
    
    @Test
    public void testTakeGumballAndCrankAgainWithoutInsertingAnyCoinQDDN()
    {
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        soldState.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
    
    @Test
    public void testTakeGumballAndCrankAgainWithoutInsertingAnyCoinQDNNN()
    {
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        soldState.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
    
    @Test
    public void testTakeGumballAndCrankAgainWithoutInsertingAnyCoinQNNNNN()
    {
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.insertNickel();
        gumballM1.turnCrank();
        gumballM1.takeGumballFromSlot();
        soldState.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
    
   

    @Test
    public void testFiftyPlusFirst()
    {
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    

    @Test
    public void testFiftyPlusSecond()
    {
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void testFinalCoinValue()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        assertEquals(0, gumballM1.getTotalCoinValue());
    }
}











