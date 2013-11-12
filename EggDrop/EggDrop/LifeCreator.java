import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class LifeCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCreator extends Actor implements LifeObserver
 {
    GreenfootSound sound = new GreenfootSound("sad.wav"); 
    private Life life1,life2,life3;
    Farm farm;
     Egg egg;
   String  subjectState="noeggbreak";
    private ArrayList<Life> lives; 
    /**
     * Act - do whatever the LifeCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public LifeCreator(Farm farm)
    {
        this.farm=farm;
       
         life1 = new Life();
         farm.addObject(life1,690,20);
       
         life2 = new Life();
         farm.addObject(life2,730,20);
         
         life3 = new Life();
         farm.addObject(life3,770,20); 
         
        
        GreenfootImage image = getImage() ;
        image.scale( 35, 25 ) ; 
        
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
        return subjectState;
    }
    
    public void setState(String subjectState)
    {
        this.subjectState = subjectState;
        
    }
    
}