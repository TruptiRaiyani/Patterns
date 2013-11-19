import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class GoldenEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenEgg extends Egg implements IEggsBehavior
{
     GreenfootSound bingo = new GreenfootSound("bingo1.wav");
     private ArrayList<Observer> lives; 
     public String success;
   
    public GoldenEgg(){
        super(Egg.EggType.GOLDEN);
        GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
         // Creates an ArrayList to hold all observers
	     lives = new ArrayList();
    }
    /**
     * Act - do whatever the GoldenEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         super.act();
        
    } 
    
    //****************Counter Observer implemetation start
   
      public void notifyCounterObserver(){
        ((Farm)getWorld()).getCounter().updateScore(10);
         bingo.play();
        
        }
     //***********Counter Observer implemetation end 
   
   
      //LifeObserver pattern implementation
    
     public void register(Observer newObserver){
        lives.add(newObserver);
    }
    
    public void unregister(Observer deleteObserver) {
        lives.remove(deleteObserver);
    }
    
     public void notifyLifeObserver(){
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
   public void notifyTimerObserver(){}
    
   //Strategy Design Pattern
    public Egg dropEgg(Egg egg){
        System.out.println("Drop Golden Egg");
        return egg;
    }
    
       
}

