import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Farm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{

    /**
     * Constructor for objects of class Farm.
     * 
     */
    public Farm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
       addObjectsToFarm();
    }
    
    void addObjectsToFarm()
    {
      WoodenPlank woodenplank = new WoodenPlank();
      addObject(woodenplank, 400, 150);
      
      Hen hen = new Hen();
      addObject(hen, 400, 78);
      
      Basket basket = new Basket();
      addObject(basket,400,400);
    }
}
