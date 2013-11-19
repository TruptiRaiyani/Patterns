/**
 * Write a description of class LifeObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Observer  
{
    public void update();
    public void gameOver(Farm farm);
   
    // For counter observer
    public void updateScore(int addCount);
}