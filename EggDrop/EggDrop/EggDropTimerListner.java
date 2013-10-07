
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class EggDropTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EggDropTimerListner implements ActionListener
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class EggDropTimer
     */
    public EggDropTimerListner()
    {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       WhiteEgg egg = new WhiteEgg();
       
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
}
