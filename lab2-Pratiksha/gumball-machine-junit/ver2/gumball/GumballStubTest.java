package gumball;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GumballStubTest
{
    private gumball.IGumball m;

    @Before
    public void setUp()
    {
        m = new gumball.GumballStub();
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testHappy()
    {
        m.insertQuarter();
        m.turnCrank();
        assertEquals(true, m.hasGumball());
    }

    @Test
    public void noQuarter()
    {
        m.turnCrank();
        assertEquals(false, m.hasGumball());
    }
}
