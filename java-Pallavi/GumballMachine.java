

public class GumballMachine implements IGumballMachine{
 
    State soldOutState;
    State noFiftyCentsState;
    State hasFiftyCentsState;
    State soldState;
    
    State state = soldOutState;
    int count = 0;
    private boolean gumball_in_slot;
    int totalCoinValue = 0;
    private int change;
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noFiftyCentsState = new NoFiftyCentsState(this);
        hasFiftyCentsState = new HasFiftyCentsState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        this.gumball_in_slot = false;
        this.totalCoinValue = 0;
        this.change=0;//
        if (numberGumballs > 0) {
            state = noFiftyCentsState;
        } 
    }
 
    public void insertQuarter() {
        state.insertQuarter();
    }
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    //**********Lab2 changes********
    public void insertDime( ) {
    state.insertDime();
    };
    public void insertNickel( ) {
        state.insertNickel();
    };
    public boolean isGumballInSlot( ) {
        if(gumball_in_slot) {
            System.out.println("Gumball is in slot...");
        }
        else {
            System.out.println("No Gumball in slot!!!");
        }
        return gumball_in_slot;
    }
    public void takeGumballFromSlot( ) {
        if(gumball_in_slot == true)
        {
            System.out.println("Please take gumball from slot...");
            gumball_in_slot = false;
        }
    };
    //**********End Lab2 changes********
        

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        gumball_in_slot = true;
        if (count != 0) {
            count = count - 1;
        }
        if(getChange() > 0)
        System.out.println("Please take the change: " + getChange());
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noFiftyCentsState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoFiftyCentsState() {
        return noFiftyCentsState;
    }

    public State getHasFiftyCentsState() {
        return hasFiftyCentsState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public void setTotalCoinValue(int value ){
        totalCoinValue = value;
    }
    
    public int getTotalCoinValue()
    {
        return totalCoinValue;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    //Added to get the return change if any
     public int getChange()
    {
        return change;
    }
    
    public void setChange(int change)
    {
        this.change=change;
    }
}
