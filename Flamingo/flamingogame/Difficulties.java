import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulties here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulties extends World
{

    /**
     * Constructor for objects of class Difficulties.
     * 
     */
    GreenfootSound Music = new GreenfootSound("toby fox - UNDERTALE Soundtrack - 93 Menu (Full).mp3");
    Easy easy = new Easy();
    Normal norm = new Normal();
    hard hrd = new hard();
    public Difficulties()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        addObject(new SelectGamemode(),500,50);
        addObject(norm, 500,306);
        addObject(hrd, 500,423);
        addObject(easy,500,183);
    }

    public void act()
    {
        Music.playLoop();
        if(Greenfoot.mouseClicked(easy) || Greenfoot.mouseClicked(norm) || Greenfoot.mouseClicked(hrd))
        {
            Music.stop();
        }
    }
}
