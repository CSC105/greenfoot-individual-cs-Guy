import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hard extends Actor
{
    /**
     * Act - do whatever the hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorldHard());
        }
        button();
    }    
    public void button()
    {
        setImage(new GreenfootImage("HARD",50,Color.WHITE,new Color(0,0,0,0)));
    }
}
