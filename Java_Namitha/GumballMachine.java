

public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    State noFiftyCentsState;
    State hasFiftyCentsState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int gumballInSlot = 0;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noFiftyCentsState = new NoFiftyCentsState(this);
        hasFiftyCentsState = new HasFiftyCentsState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noFiftyCentsState;
        } 
    }
 
    //Before inserting any coin, check whether slot already has any gumball 
    public boolean isGumballInSlot( ) {
        if(gumballInSlot == 1) {
            System.out.println("Gumball is in the slot");
            return true;
        }
        System.out.println("No gumball in the slot");
        return false;
    }
    
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    //New method to insert dime
    public void insertDime() {
        state.insertDime();
    }
    
    //New method to insert nickel
    public void insertNickel() {
        state.insertNickel();
    }
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    
    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes  rolling out the slot...");
        if (count != 0) {
            count = count - 1;
            gumballInSlot = 1; //Means Gumball is present in slot
        }
    }
 
    //After cranking, take gumball from slot
    public void takeGumballFromSlot( ) {
        if(isGumballInSlot())
        {
            System.out.println("Please take gumball from slot...");
            gumballInSlot = 0;
        }
        
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
    
    
}
