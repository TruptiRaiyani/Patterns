import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackEggStrategy  implements IEggStrategy
{
     EggFactory eggFactory;
        
      public BlackEggStrategy(EggFactory eggFactory){
        this.eggFactory = eggFactory;
        }
        @Override
     public Egg dropEgg(){
         return eggFactory.createEgg(Egg.EggType.BLACK);
        }
}
