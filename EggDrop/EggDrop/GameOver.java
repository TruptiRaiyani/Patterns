import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     String text = " GAME OVER! \n YOU WIN! ";  
   // GreenfootImage inner = new GreenfootImage(text, 48, Color.black, new Color(0, 0, 0, 96));
    public void act()  
    {  
        if (Greenfoot.mouseClicked(this))  
        {  
             getWorld().removeObject(this);  
        }  
    }  
    public GameOver()
    {
      
    }
    
  
}
