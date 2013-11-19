import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayMessage  implements Observer
{
    /**
     * Act - do whatever the DisplayMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Farm farm;
    public void act() 
    {
        // Add your action code here.
    }    
    public DisplayMessage()
    {
    }
    public void gameOver(Farm farm)
    {
       
         this.farm = farm;
         farm.addObject(new GameOver(), farm.getWidth()/2, farm.getHeight()/2);
          
    }
    public void update(){}
        public void updateScore(int addCount){}
}
