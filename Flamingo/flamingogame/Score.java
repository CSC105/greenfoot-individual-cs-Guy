import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static int score;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        countScore();
        randomSpawn();
    }   
    public void countScore()
    {
        setImage(new GreenfootImage("Score : "+score,30,Color.WHITE,new Color(0,0,0,0)));
    }
    public void addScore(int a)
    {
        score = score+a;
    }
    public void randomSpawn()
    {
        if(Greenfoot.getRandomNumber(500)<2){
            getWorld().addObject(new Kappa(),Greenfoot.getRandomNumber(940)+30,Greenfoot.getRandomNumber(540)+30);
        }
        if(Greenfoot.getRandomNumber(1000)<2){
            getWorld().addObject(new GoldenKappa(),Greenfoot.getRandomNumber(940)+30,Greenfoot.getRandomNumber(540)+30);
        }
    }
}
