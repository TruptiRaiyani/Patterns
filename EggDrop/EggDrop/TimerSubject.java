import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
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
    public String GetState()
    {
        return subjectState;
    }
    public void SetState(String SubState)
    {
        this.subjectState = SubState;
        notifyTimerObserver();
    }
    @Override
    public void notifyTimerObserver()
    {
        if(subjectState == "TimeOff")
        {
             Farm farm = (Farm)getWorld();
           
             lstObserver.add(stopgame);
             lstObserver.add(dispMsg);
             for (Observer ob : lstObserver) {
            ob.gameOver(farm);
        }
        }
    }
    
     public void register(Observer obj){}
    public void unregister(Observer obj){}
    public void notifyObserver(){}
      public void notifyCounterObserver(){}
}
