import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackEgg extends Egg
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
    
 
     //****************Counter Observer implemetation start
   
      public void notifyCounterObserver(){
      ((Farm)getWorld()).getCounter().updateScore(-10);
         boing.play();
        
        }
     //***********Counter Observer implemetation end 
    
   //Life observer 
    public void removeLifeForWhiteAndGold(){
      
     //do nothing
    }
    
    public void register(Observer obj)
    {
        //do nothing
    }
    public void unregister(Observer obj)
    {
         //do nothing
    }
    public void notifyLifeObserver()
    {
         //do nothing
    }
     public void notifyTimerObserver(){}
    
   /* //Strategy Design Pattern                    
    public Egg dropEgg(Egg egg){
          System.out.println("Drop Black Egg");
          return egg;
        }*/
      
  }    


    