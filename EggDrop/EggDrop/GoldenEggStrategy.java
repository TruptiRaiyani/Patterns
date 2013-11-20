import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenEggStrategy implements IEggStrategy
{
    EggFactory eggFactory;
        
      public GoldenEggStrategy(EggFactory eggFactory){
        this.eggFactory = eggFactory;
        }
    @Override
     public Egg dropEgg(){
       return eggFactory.createEgg(Egg.EggType.GOLDEN);
        }
}
