import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteEggStrategy implements IEggStrategy
{
    EggFactory eggFactory;
        
      public WhiteEggStrategy(EggFactory eggFactory){
        this.eggFactory = eggFactory;
        }
          @Override
      public Egg dropEgg(){
           
           return eggFactory.createEgg(Egg.EggType.WHITE);
        }
}
