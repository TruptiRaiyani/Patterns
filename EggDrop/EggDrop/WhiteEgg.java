import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class WhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteEgg extends Egg 
{
     private ArrayList<Observer> lives; 
     public String success;
    public WhiteEgg(){
        super(Egg.EggType.WHITE);
        GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
        // Creates an ArrayList to hold all observers
	    lives = new ArrayList();
    }
    /**
     * Act - do whatever the WhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       super.act();
        
    }
    
  //****************Counter Observer implemetation start
  
      public void notifyCounterObserver(){
       ((Farm)getWorld()).getCounter().updateScore(1);
        
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
         //ArrayList<LifeObserver> localLife = getLives();
         for(Observer observer : lives){
            observer.update();
        }
    }
    
     public void setState(String success){
        this.success = success;
        notifyLifeObserver();
    }
       
    public String getState(){
        return success;
    }
     
    public void notifyTimerObserver(){}
   
        
  }    


    