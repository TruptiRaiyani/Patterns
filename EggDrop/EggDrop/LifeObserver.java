import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class LifeCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeObserver implements Observer
 {
    GreenfootSound sound = new GreenfootSound("sad.wav"); 
    private Life life1,life2,life3;
    Farm farm;
    Egg egg;
    String  observerState="noeggbreak";
    private ArrayList<Life> lives; 
  
    
    public LifeObserver(Farm farm)
    {
        this.farm=farm;
       
         life1 = new Life();
         farm.addObject(life1,690,20);
       
         life2 = new Life();
         farm.addObject(life2,730,20);
         
         life3 = new Life();
         farm.addObject(life3,770,20); 
        
        lives = new ArrayList();
        lives.add(life1);
        lives.add(life2);
        lives.add(life3);
            
        
        
    }
    
   
//LifeObserver pattern implementation
   public void update(){
        //in life update
     
        farm.removeObject(lives.remove(0));
        setState("noeggbreak");
        if(lives.size()==0)
          endgame();
           
        //egg broken
    }

    public void endgame()
    {
        sound.play();
        sound.setVolume(80);
        farm.addObject(new GameOver(),farm.getWidth()/2, farm.getHeight()/2);
        Greenfoot.stop();
        
     }
   

     public String getState()
    {
        return observerState;
    }
    
    public void setState(String observertState)
    {
        this.observerState = observertState;
        
    }
     public void gameOver(Farm farm){}
         public void updateScore(int addCount){}
    
}