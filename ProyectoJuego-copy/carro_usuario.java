import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro_usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro_usuario extends Actor
{
    private int speed;
    public Carro_usuario (int velocidad){
        speed = velocidad;
        GreenfootImage carro_usuario = getImage();
        carro_usuario.scale(125, 300);
    }
    /**
     * Act - do whatever the carro_usuario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            if(getX() < 410)
                setLocation(getX() +speed, getY());
        }
        if (Greenfoot.isKeyDown("left")){
            if(getX() > 135)
                setLocation(getX() -speed, getY());
        }
        if (Greenfoot.isKeyDown("up")){
            if(getY() > 400)
                setLocation(getX() , getY () - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            if(getY() < 615)
                setLocation(getX() , getY () +speed);
        }
        MyWorld mundo = (MyWorld) getWorld();
        //Se elimina el rival y el usuario si chocan
        Actor rival;
        rival=  getOneObjectAtOffset(0,0, Carro_rival.class);
        if(rival !=null){
            World Myworld;
            Myworld = getWorld();
            Myworld.removeObject(rival);
            Myworld.removeObject(this);
            mundo.stop_audio();
            Greenfoot.playSound("../sounds/choque2.mp3");
            Greenfoot.setWorld(new MyWorld());
            Greenfoot.stop();
        }
    }
    
    public void aumenta_velocidad(){
        speed++;
    }
    
}
