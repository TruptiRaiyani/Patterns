/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
    
    public interface Subject  
{
    public void register(LifeObserver obj);
    public void unregister(LifeObserver obj);
    public void notifyObserver();
    
}

