/**
 * Write a description of class EggFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EggFactory  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class EggFactory
     */
    public EggFactory()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public Egg createEgg(Egg.EggType type)
    {
       Egg egg = null;
       
       switch(type)
       {
        case GOLDEN:
            egg = new GoldenEgg();
            break;
        case WHITE:
            egg = new WhiteEgg();
            break;
        case BLACK:
            egg = new BlackEgg();
            break;
        
        default: break;
        }
        
          return egg;
    }
    
  
}
