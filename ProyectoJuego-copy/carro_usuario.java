import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro_usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro_usuario extends Actor
{
    private int speed;
    public carro_usuario (int v){
        speed = v;
    }
    /**
     * Act - do whatever the carro_usuario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            if(getX() < 450)
                setLocation(getX() +speed, getY());
        }
        if (Greenfoot.isKeyDown("left")){
            if(getX() > 50)
                setLocation(getX() -speed, getY());
        }
        if (Greenfoot.isKeyDown("up")){
            if(getY() > 270)
                setLocation(getX() , getY () - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            if(getY() < 520)
                setLocation(getX() , getY () +speed);
        }
    }
}
