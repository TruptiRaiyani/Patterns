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
       super.act();
        
    }
    
   public void updateScore()
    {
       ((Farm)getWorld()).getCounter().updateScore(1);
    }
    
    public void removeLifeForWhiteAndGold(){
      Farm farm =  (Farm)getWorld();
     
       farm.lifecounter = farm.lifecounter + 1;
      farm.removeLife(farm.lifecounter);
   

    }
    
  }    


    