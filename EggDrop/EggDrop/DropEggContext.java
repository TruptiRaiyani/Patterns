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
    int eggPicker;
    
    public DropEggContext(int eggPicker, IEggStrategy iEggStrategy ) {
		this.eggPicker = eggPicker;
		this.iEggStrategy = iEggStrategy;
	}
    public void setIEggStrategy(IEggStrategy iEggStrategy)
    {
        this.iEggStrategy = iEggStrategy;
    }

    public int geteggPicker()
    {
        return eggPicker;
    }

    public String drop(int eggPicker)
    {
        System.out.println("Inside DropEggContext" +eggPicker);
        return iEggStrategy.dropEgg(eggPicker);
    }

}
