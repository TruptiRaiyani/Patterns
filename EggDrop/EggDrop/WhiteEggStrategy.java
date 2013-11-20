import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteEggStrategy extends Actor implements IEggStrategy
{
      public String dropEgg(int eggPicker){
           if(eggPicker >= 50 && eggPicker <= 60)
            {
               return "golden"; 
            }
            else if (eggPicker >= 60 && eggPicker <= 70)
            {
                return "black";
            }
            else
            {
                return "white";
            }
        }
}
