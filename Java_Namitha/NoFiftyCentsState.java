

public class NoFiftyCentsState implements State {
    GumballMachine gumballMachine;
 
    public NoFiftyCentsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
	}
	
	public void insertDime() {
		System.out.println("You inserted a dime");
		gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
	}
	
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void ejectDime() {
		System.out.println("You haven't inserted a dime");
	}
	
	public void ejectNickel() {
		System.out.println("You haven't inserted a nickel");
	}
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
