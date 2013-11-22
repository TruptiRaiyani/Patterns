import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class gameOverFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopGame  implements Observer
{
    /**
     * Act - do whatever the gameOverFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     GreenfootSound sound = new GreenfootSound("sad.wav"); 
     
      Farm farm;
    public void act() 
    {
        // Add your action code here.
    } 
    public StopGame()
    {
       
    }
    public void gameOver(Farm farm)
    {
       
         this.farm = farm;
         sound.play();
      
        sound.setVolume(80);
      
            Greenfoot.stop();
    }
    public void update(){}
        public void updateScore(int addCount){}
}
