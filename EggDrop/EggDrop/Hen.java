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
        if((random>200 & random<300) || ((Farm)getWorld()).atWorldEdge(this))
        {
            turn(180);
            getImage().mirrorVertically();
            move(4);
        }
        
        if( Greenfoot.getRandomNumber(100) ==0)
        {
            WhiteEgg white_egg;
            GoldenEgg golden_egg;
            int eggPicker = Greenfoot.getRandomNumber(40);
            if(eggPicker > 30 && eggPicker < 38)
            {
             golden_egg=new GoldenEgg();       
             getWorld().addObject(golden_egg, this.getX(), this.getY()+45);
            }
            else
            {
            white_egg=new WhiteEgg();       
            getWorld().addObject(white_egg, this.getX(), this.getY()+45);
        }
           
        }
    }  
    
    
}
