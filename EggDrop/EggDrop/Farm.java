import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Farm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{
    private WoodenPlank woodenplank ;
    private Hen hen;
    private Basket basket;
    private Egg egg;
    public static Counter c = new Counter();
     private Life life1,life2,life3;
    public static int lifecounter;
    /**
     * Constructor for objects of class Farm.
     * 
     */
    public Farm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 550, 1); 
       addObjectsToFarm();
    }
    
    void addObjectsToFarm()
    {
        addObject(c, 50, 34);
        c.setLocation(49, 16);
        
      woodenplank = new WoodenPlank();
      addObject(woodenplank, 400, 145);
      
      hen = new Hen();
      addObject(hen, 400, 78);
      
      basket = new Basket();
      addObject(basket,400,480);
      
      life1 = new Life();
      addObject(life1,690,10);
      life2 = new Life();
      addObject(life2,730,10);
      life3 = new Life();
      addObject(life3,770,10);
     
    }
    
    public Hen getHen()
    {
        return hen;
    }
    
    public Basket getBasket()
    {
        return basket;
    }
    
    public WoodenPlank getWoodenPlank()
    {
        return woodenplank;
    }
    
    public boolean atWorldEdge(Actor me)  
    {  
        if(me.getX() < 10 || me.getX() > getWidth() - 10)  
            return true;  
        if(me.getY() < 10 || me.getY() > getHeight() - 25)  
            return true;  
        else  
            return false;  
    }  
    
    GreenfootSound sound = new GreenfootSound("Hen Final.wav"); 
    public void started(){
       sound.setVolume(40);
        sound.playLoop();
    }
    
    public void stopped(){
       sound.setVolume(0);
    }
    
     public void removeLife(int lifecounter)
    {
        if(lifecounter==1)
        {
           removeObject(life1);
        }
        else if(lifecounter==2)
        {
            removeObject(life2);
        }
        else if(lifecounter == 3)
        {
            removeObject(life3);
            life3.endgame();
            lifecounter=0;//reset
        }
        
    }
}
