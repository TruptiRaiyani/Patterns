import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class gameOverFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timeOver extends ConcreteTimerObserver
{
    /**
     * Act - do whatever the gameOverFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     GreenfootSound sound = new GreenfootSound("sad.wav"); 
     //Farm farm;
     // Farm gw=(Farm)getWorld();
    public void act() 
    {
        // Add your action code here.
    } 
    public timeOver()
    {
    }
    public void gameOver()
    {
         sound.play();
      
        sound.setVolume(80);
     //  gw.addObject(this, gw.getWidth()/2, gw.getHeight()/2);
            Greenfoot.stop();
    }
}
