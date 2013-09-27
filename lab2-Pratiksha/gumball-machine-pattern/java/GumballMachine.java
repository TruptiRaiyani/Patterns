

public class GumballMachine implements IGumballMachine {
 
	State soldOutState;
	State NoFiftyCentsState;
    State HasFiftyCents;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	private boolean gumball_in_slot;
	int coinTotal = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		NoFiftyCentsState = new NoFiftyCentsState(this);
		HasFiftyCents = new HasFiftyCents(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.gumball_in_slot = false;
 		if (numberGumballs > 0) {
			state = NoFiftyCentsState;
		} 
	}
 
	public void insertQuarter() {
	    
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	//**************** Insert dime and nickel************//
    public void insertDime( ){
    state.insertDime();
    System.out.println("Thank you for dime");
    } 
    
    public void insertNickel( ){
     state.insertNickel();
     System.out.println("Thank you for nickel");
    }

    public boolean isGumballInSlot( ){ return gumball_in_slot;}
    
    public void takeGumballFromSlot( ) {
    
        if (gumball_in_slot = true){
        System.out.println(" Gumball picked ");
        gumball_in_slot = false;
        }
    }
 
    public void setTotalCoinValue(int value ){
        coinTotal = value;
    }
    
    public int getTotalCoinValue()
    {
        return coinTotal;
    }
    
      public State getNoFiftyCentsState() {
        return NoFiftyCentsState;
    }

    public State getHasFiftyCentsState() {
        return HasFiftyCents;
    }

    //***************************************************//
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
		
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		   gumball_in_slot = true;
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = NoFiftyCentsState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return NoFiftyCentsState;
    }

    public State getHasQuarterState() {
        return HasFiftyCents;
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
