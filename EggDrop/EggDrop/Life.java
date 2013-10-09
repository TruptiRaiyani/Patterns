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
  // private GreenfootImage image1= new GreenfootImage("gameover.gif");
   public static int lifecounter;
    public Life()
    {
         GreenfootImage image = getImage() ;
         image.scale( 35, 25 ) ;
                   
    }
   
       
    public void act() 
    {
        // Add your action code here.
        
         
    } 
    
    public void endgame()
    {
        sound.play();
        sound.setVolume(80);
        lifecounter=0;
        Greenfoot.stop();
        
     }
}
