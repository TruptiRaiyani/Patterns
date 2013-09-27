public class SampleClient
{

    public static void main (String[] args)
    {
        GumballMachine m = new GumballMachine(5) ;
        m.insertQuarter(25);
        m.turnCrank();
    }

}
