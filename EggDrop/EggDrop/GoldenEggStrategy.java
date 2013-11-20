import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenEggStrategy extends Actor implements IEggStrategy
{
    @Override
    public String dropEgg(int eggPicker){
        
        if(eggPicker >= 50 && eggPicker <= 60)
            {
               return "golden"; 
            }
                return "white";
          
        }
}
