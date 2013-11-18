import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class gameOverFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timeOver implements Observer
{
    /**
     * Act - do whatever the gameOverFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     GreenfootSound sound = new GreenfootSound("sad.wav"); 
     //Farm farm;
     // Farm gw=(Farm)getWorld();
   
    public timeOver()
    {
    }
    public void gameOver(Farm farm)
    {
         sound.play();
      
        sound.setVolume(80);
     //  gw.addObject(this, gw.getWidth()/2, gw.getHeight()/2);
            Greenfoot.stop();
    }
    public void update()
    {
    }
}
