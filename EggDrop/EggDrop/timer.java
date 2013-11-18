import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class timerFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends TimerSubject
{
    /**
     * Act - do whatever the timerFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private int time = 20;  
    private int count = 65;  
   
    
    public void act() 
    {
        if(time == 0)  
        {  
            super.SetState("TimeOff");
           
             
        }  
          
        if(counter())  
        {  
            time--;  
            count = 65;  
        }  
        display();  
    }    
    public timer()
    {
       Farm farm =  (Farm)getWorld();
         
        setImage(new GreenfootImage("Total time : " + time  , 30, Color.WHITE, Color.BLACK)); 
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
}
