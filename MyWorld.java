import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //walls on the far left
        addObject(new Wall(),15,15);
        addObject(new Wall(),15,44);
        addObject(new Wall(),15,73);
        addObject(new Wall(),15,102);
        addObject(new Wall(),15,131);
        addObject(new Wall(),15,160);
        addObject(new Wall(),15,189);
        addObject(new Wall(),15,218);
        addObject(new Wall(),15,247);
        addObject(new Wall(),15,276);
        addObject(new Wall(),15,305);
        addObject(new Wall(),15,334);
        addObject(new Wall(),15,363);
        addObject(new Wall(),15,392);

        //walls on the far right
        addObject(new Wall(),585,44);
        addObject(new Wall(),585,73);
        addObject(new Wall(),585,102);
        addObject(new Wall(),585,131);
        addObject(new Wall(),585,160);
        addObject(new Wall(),585,189);
        addObject(new Wall(),585,218);
        addObject(new Wall(),585,247);
        addObject(new Wall(),585,276);
        addObject(new Wall(),585,305);
        addObject(new Wall(),585,334);
        addObject(new Wall(),585,363);
        addObject(new Wall(),585,392); 

        //walls at the top
        addObject(new Wall(),15,15);
        addObject(new Wall(),44,15);
        addObject(new Wall(),73,15);
        addObject(new Wall(),102,15);
        addObject(new Wall(),131,15);
        addObject(new Wall(),160,15);
        addObject(new Wall(),189,15);
        addObject(new Wall(),218,15);
        addObject(new Wall(),247,15);
        addObject(new Wall(),276,15);
        addObject(new Wall(),305,15);
        addObject(new Wall(),334,15);
        addObject(new Wall(),363,15);
        addObject(new Wall(),392,15);
        addObject(new Wall(),421,15);
        addObject(new Wall(),450,15);
        addObject(new Wall(),479,15);
        addObject(new Wall(),508,15);
        addObject(new Wall(),537,15);
        addObject(new Wall(),566,15);
        addObject(new Wall(),595,15);

        //walls at the bottom end
        addObject(new Wall(),44,392);
        addObject(new Wall(),73,392);
        addObject(new Wall(),102,392);
        addObject(new Wall(),131,392);
        addObject(new Wall(),160,392);
        addObject(new Wall(),189,392);
        addObject(new Wall(),218,392);
        addObject(new Wall(),247,392);
        addObject(new Wall(),276,392);
        addObject(new Wall(),305,392);
        addObject(new Wall(),334,392);
        addObject(new Wall(),363,392);
        addObject(new Wall(),392,392);
        addObject(new Wall(),421,392);
        addObject(new Wall(),450,392);
        addObject(new Wall(),479,392);
        addObject(new Wall(),508,392);
        addObject(new Wall(),537,392);
        addObject(new Wall(),566,392);

        //center left
        addObject(new Wall(),236,108);
        addObject(new Wall(),236,137);
        addObject(new Wall(),236,166);
        addObject(new Wall(),236,195);
        addObject(new Wall(),236,224);
        addObject(new Wall(),236,253);
        addObject(new Wall(),236,282);
        addObject(new Wall(),236,309);

        addObject(new Wall(),265,108);
        addObject(new Wall(),284,108);
        addObject(new Wall(),313,108);
        addObject(new Wall(),342,108);
        addObject(new Wall(),371,108);
        addObject(new Wall(),400,108);
        addObject(new Wall(),429,108);
        addObject(new Wall(),455,108);

        addObject(new Wall(),265,224);
        addObject(new Wall(),284,224);
        addObject(new Wall(),313,224);

        addObject(new Wall(),236,224);
        addObject(new Wall(),207,224);
        addObject(new Wall(),178,224);
        addObject(new Wall(),149,224);
        addObject(new Wall(),120,224);
        addObject(new Wall(),94,224);

        addObject(new Wall(),236,108);
        addObject(new Wall(),207,108);
        addObject(new Wall(),178,108);
        addObject(new Wall(),149,108);
        addObject(new Wall(),120,108);
        addObject(new Wall(),94,108);

        addObject(new Wall(),556,305);
        addObject(new Wall(),527,305);
        addObject(new Wall(),498,305);
        addObject(new Wall(),469,305);

        addObject(new Wall(),455,137);
        addObject(new Wall(),455,166);
        addObject(new Wall(),455,195);

        Apple apple = new Apple();

        addObject(apple,250,230);

        BigItem bigItem = new BigItem();
        addObject(bigItem,345,131);

        Cherry cherry = new Cherry();
        addObject(cherry,411,231);

        SmallItem smallItem = new SmallItem();
        addObject(smallItem,336,294);

        Strowberry strowberry = new Strowberry();
        addObject(strowberry,114,125);

        addObject(new Pacman(),70,60);

        Banana banana = new Banana();
        addObject(banana,472,317);        
        apple.setLocation(197,272);
        bigItem.setLocation(271,147);
        banana.setLocation(551,353);
        smallItem.setLocation(43,361);
        cherry.setLocation(276,281);
        strowberry.setLocation(196,177);
        smallItem.setLocation(541,269);
        banana.setLocation(546,358);
    }
}
