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
    private Counter counter;
    private timer timer;
    private Life life;
    private LifeCreator lifecreator;
    public  static int lifecounter;
    /**
     * Constructor for objects of class Farm.
     * 
     */
    public Farm()
    {    
        // Create a new world with 600x550 cells with a cell size of 1x1 pixels.
       super(800, 550, 1); 
       addObjectsToFarm();
    }
    
    void addObjectsToFarm()
    {
      counter = new Counter();
      addObject(counter, 60, 20);
      //c.setLocation(49, 16);
        
      woodenplank = new WoodenPlank();
      addObject(woodenplank, 400, 145);
      
      hen = new Hen();
      addObject(hen, 400, 78);
      
      basket = new Basket();
      addObject(basket,400,480);
      
     
      lifecreator = new LifeCreator(this);//Calling life creator from Farm
      
      timer = new timer();
      addObject(timer, 450, 15);
    }
    
     public LifeCreator getLifeCreator()
    {
        return lifecreator;
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
    
    public Counter getCounter()
    {
        return counter;
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
       Greenfoot.setWorld(this);
       lifecounter=0;//reset
    }
    
}
