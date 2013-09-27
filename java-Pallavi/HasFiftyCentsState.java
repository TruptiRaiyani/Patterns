

import java.util.Random;

public class HasFiftyCentsState implements State {
	GumballMachine gumballMachine;
 
	public HasFiftyCentsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
	}
 
	//******Lab2Changes***********
	public void insertDime() {
	   System.out.println("You can't insert another dime");
	   }
	public void ejectDime(){
	   		System.out.println("You haven't inserted a dime");
	   }
    public void insertNickel( ) {
    System.out.println("You can't insert another nickel");
    }
	public void ejectNickel(){
	   System.out.println("You haven't inserted a nickel");
	   }
	
	//*****End Lab2Changes*********
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
