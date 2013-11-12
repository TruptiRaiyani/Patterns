import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropEggStrategy extends Actor
{
    /**
     * Act - do whatever the DropEggStrategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
        // Add your action code here.
    IEggsBehavior eggsBehavior;

    public void setBehavior(IEggsBehavior eggsBehavior)
    {
        this.eggsBehavior = eggsBehavior;
    }

    public IEggsBehavior getBehavior()
    {
        return eggsBehavior;
    }

    public Egg drop()
    {
        Egg command = eggsBehavior.dropEgg();
        // ... send the command to mechanisms
        return command;
    }

}
