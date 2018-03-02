import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction, speed;
    public bullet()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/8,img.getHeight()/8);
        setImage(img);
    }
    public bullet(int dir)
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/8,img.getHeight()/8);
        setImage(img);
        direction = dir;
        speed = 4;
    }
    public void act() 
    {
        removeOffScreen();
        setRotation(direction);
        move(speed);
    }        
    public boolean isOffScreen()
    {
        if (getX() < 0 - getImage().getWidth()/2 || getX() > getWorld().getWidth() + getImage().getWidth()/2 ||
        getY() < 0 - getImage().getHeight()/2 ||getY() > getWorld().getHeight() + getImage().getHeight()/2)
        {
            return true;
        }
        return false;
    }
    public void removeOffScreen()
    {
        if(isOffScreen())
        {
            getWorld().removeObject(this);
        }
    }
}
