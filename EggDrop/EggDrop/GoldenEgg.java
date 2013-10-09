import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenEgg extends Egg
{
    
    public GoldenEgg(){
          GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
    }
    /**
     * Act - do whatever the GoldenEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         super.act();
    } 
    
    public void actEgg()
    {
        Farm farm =  (Farm)getWorld();
        int yOfBasket = farm.getBasket().getY();
        int xOfBasket = farm.getBasket().getX();
        
        setRotation(90);
        move(3);
         World world ;
         world = getWorld();
    
        if(isTouching(Basket.class) && (yOfBasket==getY()) )
        {
            
            Farm.c.add(10);
      
            world.removeObject(this);   
             
        } 
        else if(((Farm)getWorld()).atWorldEdge(this))
        {
            
            setImage("egg-break.gif");
            getImage().scale( 50,50) ;
            setLocation(getX(), ((Farm)getWorld()).getHeight()-25);
            if(Greenfoot.getRandomNumber(50) == 0) {
                world.removeObject(this);
            }
    }
    
  
    
    }
}

