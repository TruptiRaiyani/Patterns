import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
   GreenfootSound sound = new GreenfootSound("sad.wav"); 
   Farm farm =  (Farm)getWorld();
  // private GreenfootImage image1= new GreenfootImage("gameover.gif");
    public Life()
    {
         GreenfootImage image = getImage() ;
         image.scale( 35, 25 ) ;
                   
    }
   
       
    public void act() 
    {
        // Add your action code here.
          if(farm.lifecounter >= 3)
       {
           endgame();
        }
    } 
    
    public void endgame()
    {
        sound.play();
        sound.setVolume(80);
      
        //getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        
     }
}
