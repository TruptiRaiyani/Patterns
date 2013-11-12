import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteTimerSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteTimerSubject extends Actor implements TimerSubject
{
 
    private String subjectState = "TimeOn";
    timeOver cto = new timeOver();
    public String GetState()
    {
        return subjectState;
    }
    public void SetState(String SubState)
    {
        this.subjectState = SubState;
        notifyTimerObserver();
    }
    public void notifyTimerObserver()
    {
        if(subjectState == "TimeOff")
        {
            cto.gameOver();
        }
    }
    
}
