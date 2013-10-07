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
        image.scale( 20, 35 ) ;
       
    }
    /**
     * Act - do whatever the WhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Hen hen=new Hen();
        //Greenfoot.delay(3);
        setRotation(90);
        move(3);
        if(isTouching(Basket.class) || atWorldEdgeWhiteEgg())
        {
            World world ;
            world = getWorld();
            world.removeObject(this);  
            
        }
   //
        
    }
     private boolean atWorldEdgeWhiteEgg()  
    {  
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)  
            return true;  
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)  
            return true;  
        else  
            return false;  
    }  
    
    
        /*if(getRotation()!=90)
            {
                System.out.println("Rotation not 90");
                setRotation(90);
                getImage().
            }
        move(4);*/
    }    

