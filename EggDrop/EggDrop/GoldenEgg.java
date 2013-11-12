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
     private ArrayList<LifeObserver> lives; 
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
    
    public void updateScore()
    {
        ((Farm)getWorld()).getCounter().updateScore(10);
         bingo.play();
    
    }
    
      //LifeObserver pattern implementation
    
     public void register(LifeObserver newObserver){
        lives.add(newObserver);
    }
    
    public void unregister(LifeObserver deleteObserver) {
        lives.remove(deleteObserver);
    }
    
     public void notifyObserver(){
          for(LifeObserver observer : lives){
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
    
   //Strategy Design Pattern
    Egg egg;
    EggFactory eggFactory = new EggFactory();

    public Egg dropEgg(){
        System.out.println("Drop Golden Egg");
        egg = eggFactory.createEgg(Egg.EggType.GOLDEN);       
         return egg;
    }
}

