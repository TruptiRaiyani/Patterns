

import java.util.Random;

public class HasFiftyCentsState implements State {
	GumballMachine gumballMachine;
 
	public HasFiftyCentsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertDime() {
		System.out.println("You can't insert another dime");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert another nickel");
	}
	
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
	}
 
	public void ejectDime() {
		System.out.println("You haven't inserted a dime");
	}
	
	public void ejectNickel() {
		System.out.println("You haven't inserted a nickel");
	}
	
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
