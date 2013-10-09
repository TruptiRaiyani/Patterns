import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    
    
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound sound = new GreenfootSound("Egg Crack.wav"); 
    public void act() 
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
            
            Farm.c.add(1);
            world.removeObject(this);   
             
        } 
        else if(((Farm)getWorld()).atWorldEdge(this))
        {
            sound.play();
            sound.setVolume(85);
            setImage("egg-break.gif");
            getImage().scale( 50,50) ;
            setLocation(getX(), ((Farm)getWorld()).getHeight()-25);

            if(Greenfoot.getRandomNumber(50) == 0) {
                sound.setVolume(0);
                world.removeObject(this);

            }
    } 
    
    
   }


}
