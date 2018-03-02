import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenKappa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenKappa extends Score
{
    /**
     * Act - do whatever the GoldenKappa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public GoldenKappa()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/7,image.getHeight()/7);
        setImage(image);
    }
}
