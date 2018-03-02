import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/2,img.getHeight()/2);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
        findMC();
        shoot();
    }    
    public void findMC()
    {
        if (!getWorld().getObjects(MainCharacter.class).isEmpty())  
        {  
            MainCharacter player = (MainCharacter) getWorld().getObjects(MainCharacter.class).get(0);  
            turnTowards(player.getX(), player.getY());  
        }  
    }
    public void shoot()
    {
        if(Greenfoot.getRandomNumber(500)<5){
            getWorld().addObject(new bullet(getRotation()),getX(),getY());
        }
    }
}
