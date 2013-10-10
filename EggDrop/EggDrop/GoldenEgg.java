import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenEgg extends Egg
{
     GreenfootSound bingo = new GreenfootSound("bingo1.wav");
     
    public GoldenEgg(){
          GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
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
    
    public void removeLifeForWhiteAndGold(){
        Farm farm =  (Farm)getWorld();
      lifecounter++;
      farm.removeLife(lifecounter);

    }
}

