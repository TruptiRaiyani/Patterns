import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Egg extends Actor implements Subject
{
   private ArrayList<Observer> lives; 
   public String success;
    
     public Egg()
    {
	 //ArrayList to hold all observers
	 lives = new ArrayList();
    }
    
    
    GreenfootSound sound = new GreenfootSound("egg_crack.wav"); 
     public static int lifecounter;
     
    public enum EggType{
        GOLDEN,
        WHITE,
        BLACK
    }
     
    private EggType type;
    public Egg(EggType mytype)
    {
        type= mytype;
    }
    
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
            
            updateScore();
            world.removeObject(this);   
            
        } 
        else if(((Farm)getWorld()).atWorldEdge(this))
        {
            
            setImage("egg-break.gif");
            sound.play();
            getImage().scale( 50,50) ;
            setLocation(getX(), ((Farm)getWorld()).getHeight()-25);
            
            if(Greenfoot.getRandomNumber(50) == 0) {
                setState("eggbreak");//Set state for life observer
                world.removeObject(this);
            }
    }
      
   }
   
    public abstract void updateScore();
    
    //Life observer implementation
    
    public ArrayList<Observer> getLives()
    {
        return lives;
    }
    
    public void register(Observer newObserver){
        lives.add(newObserver);
    }
    
    public void unregister(Observer deleteObserver) {
        lives.remove(deleteObserver);
    }
    
     public void notifyObserver(){
         
        for(Observer observer : lives){
            observer.update();
                      
        }
    }
    
     public void setState(String success){
        this.success = success;
        notifyObserver();
    }
       
    public String getState(){
        return success;
    }
}
