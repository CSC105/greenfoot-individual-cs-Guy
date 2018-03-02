import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startB extends Actor
{
    /**
     * Act - do whatever the startB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound introMusic = new GreenfootSound("toby fox - UNDERTALE Soundtrack - 04 Fallen Down.mp3");
    public void act() 
    {
        // Add your action code here.
        introMusic.playLoop();
        introMusic.setVolume(70);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HowToPlay());
            introMusic.stop();
        }
    }    
}
