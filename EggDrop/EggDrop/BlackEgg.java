import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackEgg extends Egg implements IEggsBehavior
{
    GreenfootSound boing = new GreenfootSound("boing.wav");
    public BlackEgg(){
         super(Egg.EggType.BLACK);
        GreenfootImage image = getImage() ;
        image.scale( 35, 20 ) ;
       
    }
    
    /**
     * Act - do whatever the WhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       super.act();
        
    }
    
   public void updateScore()
    {
        ((Farm)getWorld()).getCounter().updateScore(-10);
         boing.play();
                 
    }
    
   //Life observer 
    public void removeLifeForWhiteAndGold(){
      
     //do nothing
    }
    
    public void register(LifeObserver obj)
    {
        //do nothing
    }
    public void unregister(LifeObserver obj)
    {
         //do nothing
    }
    public void notifyObserver()
    {
         //do nothing
    }
    
    //Strategy Design Pattern
    Egg egg;
    EggFactory eggFactory = new EggFactory();
                                  
    public Egg dropEgg(){
          System.out.println("Drop Black Egg");
          egg = eggFactory.createEgg(Egg.EggType.BLACK);     
          return egg;
        }
    
  }    


    