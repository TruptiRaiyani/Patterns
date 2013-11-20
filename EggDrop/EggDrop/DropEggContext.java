import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropEggContext
{

   // IEggsBehavior eggsBehavior;

    IEggStrategy iEggStrategy;
    
    public DropEggContext() {
		
	}
    public void setIEggStrategy(IEggStrategy iEggStrategy)
    {
        this.iEggStrategy = iEggStrategy;
    }

   

    public Egg dropEgg()
    {
        return iEggStrategy.dropEgg();
    }

}
