import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hen extends Actor
{
    
    public Hen()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 120) ; 
        getImage().mirrorHorizontally();
    }
    /**
     * Act - do whatever the Chicken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(4);
        int random = Greenfoot.getRandomNumber(5000);
        if((random>200 & random<300) || atWorldEdge())
        {
            turn(180);
            getImage().mirrorVertically();
            move(4);
        }
        
        if( Greenfoot.getRandomNumber(2)==0)
        {
            
            WhiteEgg egg=new WhiteEgg();       
            getWorld().addObject(egg, this.getX(), this.getY());
           
        }
    }  
    
    private boolean atWorldEdge()  
    {  
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)  
            return true;  
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)  
            return true;  
        else  
            return false;  
    }  
}
