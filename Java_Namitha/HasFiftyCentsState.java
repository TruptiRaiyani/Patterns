

import java.util.Random;

public class HasFiftyCentsState implements State {
	GumballMachine gumballMachine;
 
	public HasFiftyCentsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
		gumballMachine.setChange(gumballMachine.getChange()+25);
		System.out.println("Please turn the crank.");
           }
 
	public void ejectQuarter() {
		System.out.println("Please collect ejected quarter.");
		gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 25);
		gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
	}
 
	//******Lab2Changes***********
	public void insertDime() {
	   System.out.println("You can't insert another dime");
	   gumballMachine.setChange(gumballMachine.getChange()+10);
	   System.out.println("Please turn the crank.");
           
           }
	   	   
	public void ejectDime(){
	     System.out.println("Please collect ejected dime.");
		gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 10);
		gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
	   }
    public void insertNickel( ) 
    {
     System.out.println("You can't insert another nickel");
      gumballMachine.setChange(gumballMachine.getChange()+5);
      System.out.println("Please turn the crank. ");
        
    }
    
	public void ejectNickel(){
	   System.out.println("Please collect ejected nickel.");
		gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 5);
		gumballMachine.setState(gumballMachine.getNoFiftyCentsState());
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
