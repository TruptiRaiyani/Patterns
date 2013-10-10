import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;


public class Counter extends Actor
{
    private int target;
    private String prefix;
    
    public Counter()
    {
        getImage().scale(200,100);
        target = 0;
        prefix = "Score: ";
        getImage().setFont(new Font("Comic", Font.BOLD, 24 ));
        getImage().setColor(Color.red);
        getImage().drawString(prefix +"" + target, 50, 60);
        
    }
    
    public void updateScore(int addCount)
    {
        target += addCount;
        getImage().clear();
        getImage().drawString(prefix +"" + target, 50, 60);
    }
    
    
    

    
}


