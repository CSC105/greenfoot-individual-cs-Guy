import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorldNorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorldNorm extends World
{

    /**
     * Constructor for objects of class MyWorldNorm.
     * 
     */
    public MyWorldNorm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false);
        enemy enemy1 = new enemy();
        enemy enemy2 = new enemy();
        enemy enemy3 = new enemy();
        enemy enemy4 = new enemy();
        addObject(new MainCharacter(), 500,300);
        addObject(new Score(),58,20);
        addObject(new LivesCounter(),943,20);
        addObject(enemy1,42,67);
        addObject(enemy2,954,67);
        addObject(enemy3,954,558);
        addObject(enemy4,42,558);
        setPaintOrder(Score.class,MainCharacter.class,enemy.class,bullet.class);
        
    }
}
