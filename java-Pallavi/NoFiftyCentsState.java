

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
           else if (gumballMachine.getTotalCoinValue()>50)
           {
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
           gumballMachine.setChange(gumballMachine.getTotalCoinValue()-50);
           gumballMachine.setTotalCoinValue(50);
           System.out.println("Please turn the crank. GumballMachine has more than 50 cents");
           }
    }
 
   
    
    public void ejectQuarter() {
        //System.out.println("You haven't inserted a quarter");
         if(gumballMachine.getTotalCoinValue()>=25)
         {
              gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 25);
              System.out.println("Please collect ejected quarter.");
             
         }
         else
         {
            System.out.println("Cannot return quarter as machine has " + gumballMachine.getTotalCoinValue()+ " cents.");
         }
    }
    
    //******Lab2Changes***********
    public void insertDime() {
        System.out.println("You inserted a dime");
        gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() + 10);
        if(gumballMachine.getTotalCoinValue()==50)
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
           else if (gumballMachine.getTotalCoinValue()>50)
           {
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
           gumballMachine.setChange(gumballMachine.getTotalCoinValue()-50);
           gumballMachine.setTotalCoinValue(50);
           System.out.println("Please turn the crank. GumballMachine has more than 50 cents");
           }
    }
    public void ejectDime(){
           
         if(gumballMachine.getTotalCoinValue()>=10)
         {
              gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 10);
              System.out.println("Please collect ejected dime.");
             
         }
         else
         {
            System.out.println("Cannot return dime as machine has " + gumballMachine.getTotalCoinValue()+ " cents.");
         }
    }
    public void insertNickel() {
        System.out.println("You inserted a nickel");
        gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue()+5);
        if(gumballMachine.getTotalCoinValue()==50)
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
           else if (gumballMachine.getTotalCoinValue()>50)
           {
           gumballMachine.setState(gumballMachine.getHasFiftyCentsState());
           gumballMachine.setChange(gumballMachine.getTotalCoinValue()-50);
           gumballMachine.setTotalCoinValue(50);
           System.out.println("Please turn the crank. GumballMachine has more than 50 cents");
           }
    }
    public void ejectNickel(){
        if(gumballMachine.getTotalCoinValue()>=5)
         {
              gumballMachine.setTotalCoinValue(gumballMachine.getTotalCoinValue() - 5);
              System.out.println("Please collect ejected nickel.");
             
         }
         else
         {
            System.out.println("Cannot return nickel as machine has " + gumballMachine.getTotalCoinValue()+ " cents.");
         }
    }
    
    //*****End Lab2Changes*********
 
    public void turnCrank() {
        System.out.println("You turned, but need more money. GumballMachine has "+ gumballMachine.getTotalCoinValue( )+ "cents");
        
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
