import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speedShot = 6;
    MyWorld mundo = (MyWorld) getWorld();

    
    public Shot(){
        GreenfootImage bala = getImage();
        bala.scale(50, 50);
    }
    
    public void act()
    {
        
        //Posición de la bala
        setLocation(getX(), getY() -speedShot);
        
        
        //Eliminar carro enemigo
        Actor rival;
        rival=  getOneObjectAtOffset(0,0, Rival.class);
        if(rival !=null){
            World Myworld;
            Myworld = getWorld();
            Myworld.removeObject(rival);
            Myworld.removeObject(this);
            Greenfoot.playSound("../sounds/choque2.mp3");
        
        }
        
        else if((getY() <= 20)){
            getWorld().removeObject(this);
        }
    }
}
