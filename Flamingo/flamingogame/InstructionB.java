import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionB extends Actor
{
    /**
     * Act - do whatever the InstructionB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound Music = new GreenfootSound("toby fox - UNDERTALE Soundtrack - 93 Menu (Full).mp3");
    public void act() 
    {
        // Add your action code here.
        Music.playLoop();
        Music.setVolume(70);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Difficulties());
            Music.stop();
        }
    }    
    public InstructionB()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2,image.getHeight()/2);
        setImage(image);
    }
}
