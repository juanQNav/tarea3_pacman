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
        addObject(new Wall(),265,79);
        addObject(new Wall(),265,108);
        addObject(new Wall(),265,137);
        Apple apple = new Apple();
        addObject(apple,220,228);

        BigItem bigItem = new BigItem();
        addObject(bigItem,345,131);

        Cherry cherry = new Cherry();
        addObject(cherry,411,231);

        SmallItem smallItem = new SmallItem();
        addObject(smallItem,336,294);

        Strowberry strowberry = new Strowberry();
        addObject(strowberry,114,125);

        addObject(new Pacman(),50,50);

        Banana banana = new Banana();
        addObject(banana,472,317);
        Wall wall4 = new Wall();
        addObject(wall4,266,166);
        Wall wall5 = new Wall();
        addObject(wall5,33,176);
        Wall wall6 = new Wall();
        addObject(wall6,61,176);
        Wall wall7 = new Wall();
        addObject(wall7,86,175);
        Wall wall8 = new Wall();
        addObject(wall8,113,175);
        Wall wall9 = new Wall();
        addObject(wall9,141,172);
        Wall wall10 = new Wall();
        addObject(wall10,269,195);
        Wall wall11 = new Wall();
        addObject(wall11,267,222);
        Wall wall12 = new Wall();
        addObject(wall12,262,262);
        Wall wall13 = new Wall();
        addObject(wall13,266,295);
        wall12.setLocation(267,252);
        wall13.setLocation(273,267);
        Wall wall14 = new Wall();
        addObject(wall14,266,303);
        Wall wall15 = new Wall();
        addObject(wall15,26,322);
        Wall wall16 = new Wall();
        addObject(wall16,44,321);
        Wall wall17 = new Wall();
        addObject(wall17,65,318);
        Wall wall18 = new Wall();
        addObject(wall18,86,323);
        Wall wall19 = new Wall();
        addObject(wall19,15,349);
        Wall wall20 = new Wall();
        addObject(wall20,16,377);
        Wall wall21 = new Wall();
        addObject(wall21,37,387);
        removeObject(wall21);
        removeObject(wall18);
        wall17.setLocation(-1,322);
        wall16.setLocation(60,324);
        wall15.setLocation(41,317);
        wall16.setLocation(48,317);
        wall20.setLocation(14,379);
        wall19.setLocation(17,360);
        wall19.setLocation(16,343);
        wall20.setLocation(17,367);
        wall20.setLocation(10,385);
        wall19.setLocation(14,368);
        wall17.setLocation(16,335);
        wall15.setLocation(21,342);
        wall16.setLocation(60,335);
        banana.setLocation(164,374);
        wall17.setLocation(17,342);
        wall15.setLocation(18,315);
        wall16.setLocation(41,305);
        addObject(wall21,92,314);
        banana.setLocation(81,372);
        wall5.setLocation(2,179);
        wall6.setLocation(28,179);
        wall7.setLocation(54,179);
        wall8.setLocation(76,172);
        wall9.setLocation(99,174);
        strowberry.setLocation(34,228);
        apple.setLocation(519,350);
        cherry.setLocation(533,36);
        smallItem.setLocation(444,232);
        Wall wall22 = new Wall();
        addObject(wall22,294,304);
        Wall wall23 = new Wall();
        addObject(wall23,315,304);
        Wall wall24 = new Wall();
        addObject(wall24,334,304);
        Wall wall25 = new Wall();
        addObject(wall25,348,306);
        Wall wall26 = new Wall();
        addObject(wall26,369,304);
        Wall wall27 = new Wall();
        addObject(wall27,390,304);
        Wall wall28 = new Wall();
        addObject(wall28,408,302);
        Wall wall29 = new Wall();
        addObject(wall29,427,301);
        Wall wall30 = new Wall();
        addObject(wall30,588,383);
        Wall wall31 = new Wall();
        addObject(wall31,586,351);
        Wall wall32 = new Wall();
        addObject(wall32,589,328);
        Wall wall33 = new Wall();
        addObject(wall33,588,303);
        Wall wall34 = new Wall();
        addObject(wall34,585,272);
        Wall wall35 = new Wall();
        addObject(wall35,586,243);
        Wall wall36 = new Wall();
        addObject(wall36,590,218);
        Wall wall37 = new Wall();
        addObject(wall37,587,187);
        Wall wall38 = new Wall();
        addObject(wall38,584,166);
        Wall wall39 = new Wall();
        addObject(wall39,554,170);
        Wall wall40 = new Wall();
        addObject(wall40,525,172);
        Wall wall41 = new Wall();
        addObject(wall41,497,172);
        Wall wall42 = new Wall();
        addObject(wall42,473,169);
        Wall wall43 = new Wall();
        addObject(wall43,443,169);
        Wall wall44 = new Wall();
        addObject(wall44,415,172);
        Wall wall45 = new Wall();
        addObject(wall45,410,143);
        Wall wall46 = new Wall();
        addObject(wall46,411,110);
        Wall wall47 = new Wall();
        addObject(wall47,412,87);
        wall21.setLocation(62,297);
    }
}
