import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Basket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basket extends Actor
{
    public Basket()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
    }
    /**
     * Act - do whatever the Basket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           int mouseX, mouseY;
           MouseInfo mouse = Greenfoot.getMouseInfo();  
            if(mouse!=null)
            {
                mouseX=mouse.getX();  
                mouseY=480;
                setLocation(mouseX, mouseY);        
        } 
    }    
}
