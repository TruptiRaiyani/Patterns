import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class ConcreteTimerSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimerSubject extends Actor implements Subject
{
 private String subjectState = "TimeOn";
   private ArrayList<Observer> lstObserver = new ArrayList<Observer>();
  
    StopGame stopgame = new StopGame();
    DisplayMessage dispMsg = new DisplayMessage();
    private int time = 20;  
    private int count = 65;  
   
    public TimerSubject(){
     Farm farm =  (Farm)getWorld();
     setImage(new GreenfootImage("Total time : " + time  , 30, Color.WHITE, Color.BLACK)); 
     register(stopgame);
     register(dispMsg);
    }
    public String getState()
    {
        return subjectState;
    }
    public void setState(String SubState)
    {
        this.subjectState = SubState;
        notifyTimerObserver();
    }
    public void act() 
    {
        if(time == 0)  
        {  
            setState("TimeOff");
           
             
        }  
          
        if(counter())  
        {  
            time--;  
            count = 65;  
        }  
        display();  
    }    
    
    @Override
    public void notifyTimerObserver()
    {
        if(subjectState == "TimeOff")
        {
           Farm farm = (Farm)getWorld();
           for (Observer ob : lstObserver) {
            ob.gameOver(farm);
        }
        }
    }
      private boolean counter()  
    {  
        if(count > 0)  
        {  
            count--;  
        }  
        return count == 0;  
    }  
      
    private void display()  
    {  
        Farm farm =  (Farm)getWorld();
         
        setImage(new GreenfootImage("Time left: " + time  , 30, Color.WHITE, Color.BLACK));  
    }  
      
    public void setTime()  
    {  
        time = 20;  
    }  
      
    public boolean isTimeUp()  
    {  
        return time == 0;  
    }  
     public void register(Observer obj){
         lstObserver.add(obj);
        
        }
    public void unregister(Observer obj){
             lstObserver.remove(obj);
        }
    public void notifyLifeObserver(){}
      public void notifyCounterObserver(){}
}
