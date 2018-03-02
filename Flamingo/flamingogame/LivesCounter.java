import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivesCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivesCounter extends Actor
{
    /**
     * Act - do whatever the LivesCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound Music = new GreenfootSound("toby fox - UNDERTALE Soundtrack - 59 Spider Dance.mp3");
    public int lives = 3;
    public void act() 
    {
        // Add your action code here.
        countLives();
        GameOver();
    }
    public void countLives()
    {
        setImage(new GreenfootImage("Lives : "+lives,30,Color.WHITE,new Color(0,0,0,0)));
    }
    public void GameOver()
    {
        Music.playLoop();
        Music.setVolume(70);
        if(lives == 0)
        {
            Greenfoot.setWorld(new GameOver());
            Music.stop();
        }
    }
    public void loseLife()
    {
        lives--;
    }
}
