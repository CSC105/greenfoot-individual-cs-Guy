import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorldHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorldHard extends World
{

    /**
     * Constructor for objects of class MyWorldHard.
     * 
     */
    public MyWorldHard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false);
        addObject(new MainCharacter(), 500,300);
        addObject(new Score(),58,20);
        addObject(new LivesCounter(),943,20);
        addObject(new enemy(),42,67);
        addObject(new enemy(),954,67);
        addObject(new enemy(),954,558);
        addObject(new enemy(),42,558);
        addObject(new enemy(),48,300);
        addObject(new enemy(),956,300);
        addObject(new enemy(),500,67);
        addObject(new enemy(),500,558);
        setPaintOrder(Score.class,MainCharacter.class,enemy.class,bullet.class);
        
    }
}
