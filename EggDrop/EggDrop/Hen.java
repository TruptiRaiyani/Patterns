import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hen extends Actor
{
  
    public Hen()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 120) ; 
        getImage().mirrorHorizontally();  
    }
    /**
     * Act - do whatever the Chicken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EggFactory eggFactory = new EggFactory();
        
        move(4);
        int random = Greenfoot.getRandomNumber(5000);
        if((random>200 & random<300) || ((Farm)getWorld()).atWorldEdge(this))
        {
            turn(180);
            getImage().mirrorVertically();
            move(4);
                             
        }

        if( Greenfoot.getRandomNumber(100) ==0)
        {

           Farm farm =  (Farm)getWorld();
           Egg egg = null;       
           int eggPicker = Greenfoot.getRandomNumber(80);
           //DropEggStrategy dropEgg = new DropEggStrategy(); //Strategy pattern

           IEggStrategy whiteStrategy = new WhiteEggStrategy();
           IEggStrategy blackStrategy = new BlackEggStrategy();
           IEggStrategy goldenStrategy = new GoldenEggStrategy();
           
           DropEggContext context = new DropEggContext(eggPicker,whiteStrategy); 
           System.out.println("EggPicker: "+eggPicker);
           
           String eggColor = context.drop(eggPicker);
           System.out.println("EggColor: "+eggColor);
           
           if(eggColor.equals("white")){

               context.setIEggStrategy(whiteStrategy);
               egg = eggFactory.createEgg(Egg.EggType.WHITE);
               getWorld().addObject(egg, this.getX(), this.getY()+45);
            }
             
            else if(eggColor.equals("black")){

               context.setIEggStrategy(blackStrategy);
               egg = eggFactory.createEgg(Egg.EggType.BLACK);
               getWorld().addObject(egg, this.getX(), this.getY()+45);
            }
            else if(eggColor.equals("golden")){
               
               context.setIEggStrategy(goldenStrategy);
               egg = eggFactory.createEgg(Egg.EggType.GOLDEN);
               getWorld().addObject(egg, this.getX(), this.getY()+45);
            }
            
            egg.register(farm.getLifeObserver());//register life creator observer into egg subject              

            /*if(eggPicker >= 50 && eggPicker <= 60)
            {
               IEggStrategy whiteStrategy = new WhiteEggStrategy();
               DropEggContext context = new DropEggContext(whiteStrategy);
               context.dropEgg(eggFactory.createEgg(Egg.EggType.GOLDEN));
            // dropEgg.setBehavior(new GoldenEgg());
             //egg = dropEgg.drop(eggFactory.createEgg(Egg.EggType.GOLDEN)); //Command and strategy pattern
             getWorld().addObject(egg, this.getX(), this.getY()+45);
             
            }
            else if (eggPicker >= 60 && eggPicker <= 70)
            {
             dropEgg.setBehavior(new BlackEgg());
             egg = dropEgg.drop(eggFactory.createEgg(Egg.EggType.BLACK)); //Command and strategy pattern
             getWorld().addObject(egg, this.getX(), this.getY()+45);
            }
            else
            {
            dropEgg.setBehavior(new WhiteEgg());
            egg = dropEgg.drop(eggFactory.createEgg(Egg.EggType.WHITE)); //Command and strategy pattern
            getWorld().addObject(egg, this.getX(), this.getY()+45);
            }*/

        }

    }  
    
    
    
    
}
