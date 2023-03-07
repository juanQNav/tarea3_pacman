import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Item extends Actor
{
    protected int points;
    
    public Item(int points){
        this.points = points;
    }
    public void act()
    {
    
    }
    public int getPoints(){
        return points;
    }
}
