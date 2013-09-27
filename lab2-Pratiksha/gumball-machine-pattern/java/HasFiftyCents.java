

import java.util.Random;

public class HasFiftyCents implements State {
	GumballMachine gumballMachine;
 
	public HasFiftyCents(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
	
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	//*****************************************************************//
	public void insertDime() {
		System.out.println("You can't insert another dime");
	}
	
	public void ejectDime() {
		System.out.println("You can't insert another dime");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert another nickel");
	}
 
	public void ejectNickel() {
		System.out.println("You can't insert another nickel");
	}

	//******************************************************************//
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
