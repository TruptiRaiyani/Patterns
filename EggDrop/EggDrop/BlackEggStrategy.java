import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackEggStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackEggStrategy extends Actor implements IEggStrategy
{
        @Override
     public String dropEgg(int eggPicker){
         if(eggPicker >= 60 && eggPicker <= 70)
          {
              return "black";          
          }
          return "white";
        }
}
