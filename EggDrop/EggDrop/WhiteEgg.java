import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteEgg extends Egg
{
    public WhiteEgg(){
        GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
       
    }
    /**
     * Act - do whatever the WhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Hen hen=new Hen();
        Farm farm =  (Farm)getWorld();
        int yOfBasket = farm.getBasket().getY();
        int xOfBasket = farm.getBasket().getX();
        setRotation(90);
        move(3);
        if(isTouching(Basket.class) && (yOfBasket==getY()))
        {
            World world ;
            world = getWorld();
            world.removeObject(this);  
            
        }
        else if(((Farm)getWorld()).atWorldEdge(this))
        {
            
            setImage("egg-break.gif");
            getImage().scale( 50,50) ;
            setLocation(getX(), ((Farm)getWorld()).getHeight()-25);
            //TODO code to make egg dissapear.
        }
        
    }
    

    }    

