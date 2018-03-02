import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacter extends Actor
{
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] imgR = new GreenfootImage[36];
    GreenfootImage[] imgL = new GreenfootImage[36];
    GreenfootSound kappa = new GreenfootSound("Mario-coin-sound.mp3");
    GreenfootSound dmg = new GreenfootSound("smb2_shrink.wav");
    private int frame;
    private boolean right = true;
     public MainCharacter()
    {
        for(int i = 0; i<imgR.length;i++)
        {
            imgR[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
            imgR[i].scale(imgR[i].getWidth()/7,imgR[i].getHeight()/7);
            setImage(imgR[frame]);
            imgL[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
            imgL[i].scale(imgL[i].getWidth()/7,imgL[i].getHeight()/7);
            imgL[i].mirrorHorizontally();
        }
    }
    public void act() 
    {
        //action codes
        controls();
        eat();
        hurt();
    }    
    public void animationR()
    {
        //animation facing right
        right = true;
        frame = (frame+1)%imgR.length;
        setImage(imgR[frame]);
    }
    public void animationL()
    {
        //animation facing left
        right = false;
        frame = (frame+1)%imgL.length;
        setImage(imgL[frame]);
    }
    public void controls()
    {
        if(Greenfoot.isKeyDown("left") && getX()-5 >= 30)//move left
        {
            setLocation(getX()-6,getY());
            animationL();
        }
        if(Greenfoot.isKeyDown("right") && getX()+5 <= 970 )// move right
        {
            setLocation(getX()+6,getY());
            animationR();
        }    
        if(Greenfoot.isKeyDown("up") && getY()-5 >= 30) // move up
        {
            if(right) animationR();
            else animationL();
            setLocation(getX(),getY()-6);
        }
        if(Greenfoot.isKeyDown("down") && getY()+5 <=570)// move down
        {
            if(right) animationR();
            else animationL();
            setLocation(getX(),getY()+6);
        }
    }
    public void eat()
    {
        kappa.setVolume(70);
        if(isTouching(Kappa.class))
        {
            ((Score)getWorld().getObjects(Score.class).get(0)).addScore(10);
            playKappa();
            removeTouching(Kappa.class);
        }
        if(isTouching(GoldenKappa.class))
        {
            ((Score)getWorld().getObjects(Score.class).get(0)).addScore(50);
            playKappa();
            removeTouching(GoldenKappa.class);
        }
    }
    public void hurt()
    {
        if(isTouching(bullet.class))
        {
            removeTouching(bullet.class);
            dmg.play();
            ((LivesCounter)getWorld().getObjects(LivesCounter.class).get(0)).loseLife();
        }
    }
    public void playKappa()
    {
        kappa.play();
    }
}
