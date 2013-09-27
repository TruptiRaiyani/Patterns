

public class NoFiftyCentsState implements State {
    GumballMachine gumballMachine;
 
    public NoFiftyCentsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() + 25);
        if(gumballMachine.getTotalCoinValue()==50)
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    
    //******Lab2Changes***********
    public void insertDime() {
        System.out.println("You inserted a dime");
        gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() + 10);
        if(gumballMachine.getTotalCoinValue()==50)
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
    }
    public void ejectDime(){
    		System.out.println("You haven't inserted a dime");
    }
    public void insertNickel() {
        System.out.println("You inserted a nickel");
        gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue()+5);
        if(gumballMachine.getTotalCoinValue()==50)
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
    }
    public void ejectNickel(){
        System.out.println("You haven't inserted a nickel");
    }
    
    //*****End Lab2Changes*********
 
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
