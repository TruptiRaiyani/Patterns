

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	//******Lab2Changes***********
	public void insertDime( ) {
	   System.out.println("Please wait, we're already giving you a gumball");
	   }
	public void ejectDime(){
	   System.out.println("Sorry, you already turned the crank");
	   }
    public void insertNickel( ) {
    System.out.println("Please wait, we're already giving you a gumball");
}
	public void ejectNickel(){
	 System.out.println("Sorry, you already turned the crank");
	   }
	
	//*****End Lab2Changes*********
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
		} else {
		    gumballMachine.setState(gumballMachine.getSoldOutState());
			System.out.println("Oops, out of gumballs!");
			
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


