import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Egg extends Actor
{
    
    
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound sound = new GreenfootSound("Egg Crack.wav"); 
    public void act() 
    {
      actEgg();
   }
   
    public abstract void actEgg();

}
