import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endGameScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endGameScore extends Actor
{
    /**
     * Act - do whatever the endGameScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        button();
    }    
    public void button()
    {
        setImage(new GreenfootImage("SCORE : "+Score.score,60,Color.WHITE,new Color(0,0,0,0)));
    }
}
