import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DropEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DropEggStrategy
{

    IEggsBehavior eggsBehavior;

    public void setBehavior(IEggsBehavior eggsBehavior)
    {
        this.eggsBehavior = eggsBehavior;
    }

    public IEggsBehavior getBehavior()
    {
        return eggsBehavior;
    }

    public Egg drop(Egg egg)
    {
        Egg command = eggsBehavior.dropEgg(egg);
        // ... send the command to mechanisms
        return command;
    }

}
