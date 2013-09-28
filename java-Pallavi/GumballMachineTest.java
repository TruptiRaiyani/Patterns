

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

    
    // Test case 1: insert 1 quarter, insert 1 dime and 3 nickel = 50Cents : +ve test case
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
    
    
    // Test case 2 : Checking to dispence gumball by inserting different coins 
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
    
  
    //Test case 3 : Checking whether gumball will be dispensed before inserting any coin
    @Test
    public void testCrankWithoutInsertingAnyCoin()
    {
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    
    //Test case 4 :Try to take a dispensed gumball and crank the machine again without inserting any coin
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
    
   // Test case 5 : Inserting more then 50 cents and checking for change and Gumball in slot
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

    
    // Test case 6 : Insert 2 quarters and turn crank and Insert 2 quarters again and turn crank 
    // Chenking to see if multiple time inserting 50 cents dispences the gumball
    @Test
    public void testCountOfGumballsInSlot()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

   
    // Test Case 7 : Negative test case : No gumball should return when less then 50 cents inserted and turned crank
    @Test 
    public void testAddOneQuarterNeg()
    {
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    
    // Test case 8 : Testing eject method and get cents back method
    @Test 
    public void testEjectAndCentsBackCheck()
    {
        gumballM1.insertQuarter();
        gumballM1.ejectNickel();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
       // assertEquals(15, gumballM1.getChange());
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }
    
    // Test Case 9: Insert 50 cents first but remove some amount before
    //turning crank then check to see if gumball is dispenced or not : -ve test case
    @Test
    public void TestQDDDDEjectQNegative()
    {
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.ejectQuarter();
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

     
     // Test case 10 : Checking whether the machine slot already has a gumball in the beginning
    @Test
    public void testGumballInSlotInTheBeginning()
    {
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    
    
    /**********LOCAL TEST CASES : FOR OUR REFERENCE ONLY*******************
     * 
     * 
    
     // Check for has fiftycents states 
    @Test
    public void testNoFiftyCentsToHasFiftyCentsStateTransition(){
    
        System.out.println("NoFiftyCentsState");
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        assertEquals(true, gumballM1.getState() instanceof HasFiftyCentsState);
        System.out.println("HasFiftyCentsState");
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
    public void testGetDNQNoFiftyCentsState()
    {
        gumballM1.insertNickel();
        gumballM1.insertDime();
        gumballM1.insertQuarter();
         boolean isNoFiftyCentsState = false;
        if (gumballM1.getState() instanceof NoFiftyCentsState)
            isNoFiftyCentsState = true;
        
        assertEquals(true, isNoFiftyCentsState);
      
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
    
     @Test // checks to see after inseting 2 quarters and dime : shud not let add dime and gumball comes out
    public void testAddQQDneg()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertDime();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }

    
   // Checks too see if gumball count reduces after each gumball taken out
    @Test 
    public void testGumballCount()
    {
        
        assertEquals(10, gumballM1.getCount());
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
        assertEquals(9, gumballM1.getCount());
    }

   

    @Test // test release ball method before inserting coin
    public void testReleaseBallMethod()
    {
        gumballM1.releaseBall();
        assertEquals(false, gumballM1.isGumballInSlot());
        gumballM1.turnCrank();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
    
    
     * 
     * 
     * 
     */
}














