import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 706, 1);
        addObject(new Jugar(), 275, 300);
        addObject(new Salir(), 275, 400);
        addObject(flecha, 130, 300);
    }
    public void prepararMundo(){
        
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion !=0) {
            opcion++;
        }
        if (Greenfoot.isKeyDown("DOWN") && opcion !=1) {
            opcion--;
        }
        
        if (opcion>=2) opcion =0;
        if (opcion<0) opcion = 1;
        
        flecha.setLocation(130, 300 + (opcion * 100));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //Jugar
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1: //Salir
                    Greenfoot.stop();
                    break;
                
            }
        }
    }

}