import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int totalscore =0;
    public void act() 
    {
        // Add your action code here.
    }    
    public int GetScore()
    {
        return totalscore;
    }
    
    public void SetScore(int score )
    {
        totalscore = totalscore + score;
        GreenfootImage img = new GreenfootImage( 50, 30 );
        img.setColor( new Color( 100, 100, 100 ));
        img.fill();
        img.setColor( Color.RED );
        img.setFont( new Font("Comic Sans MS", Font.BOLD, 24 ));
        img.drawString( "" + totalscore , 5, 25);
        setImage( img );
    }
}
