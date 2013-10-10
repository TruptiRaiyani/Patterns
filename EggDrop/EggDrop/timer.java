import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private int time = 20;  
    private int count = 65;  
    GreenfootSound sound = new GreenfootSound("sad.wav"); 
    public void act()   
    {  
        // Add your action code here.  
        if(time == 0)  
        {  
            sound.play();
        sound.setVolume(80);
             Greenfoot.stop();
             
        }  
          
        if(counter())  
        {  
            time--;  
            count = 65;  
        }  
        display();  
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
        setImage(new GreenfootImage("time left: " + time, 30, Color.WHITE, Color.BLACK));  
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
