

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
	//******** insert and eject : dime and nickel******///
	public void insertDime() {
		System.out.println("You can't insert a Dime, the machine is sold out");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert a nickel, the machine is sold out");
	}
	
	public void ejectDime() {
		System.out.println("You can't eject, you haven't inserted a Dime yet");
	}
	
	public void ejectNickel() {
		System.out.println("You can't eject, you haven't inserted a Nickel yet");
	}
	//*******************************************************************************//
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
