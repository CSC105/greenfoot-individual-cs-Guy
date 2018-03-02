import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgain extends Actor
{
    /**
     * Act - do whatever the playAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound Music = new GreenfootSound("toby fox - UNDERTALE Soundtrack - 83 Here We Are.mp3");
    public void act() 
    {
        // Add your action code here.
        Music.playLoop();
        Music.setVolume(70);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Difficulties());
            Score.score = 0;
            Music.stop();
        }
        button();
    }    
    public void button()
    {
        setImage(new GreenfootImage("PLAY AGAIN",70,Color.WHITE,new Color(0,0,0,0)));
    }
}
