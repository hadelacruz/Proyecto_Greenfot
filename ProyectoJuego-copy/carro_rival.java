import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro_rival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro_rival extends Actor
{
    private int speed;
    
    /**
     * Act - do whatever the carro_rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Carro_rival(int velocidad){
        speed = velocidad;
        GreenfootImage carro_rival = getImage();
        carro_rival.scale(55, 150);
    
    }
    
    public void act()
    {
        // El carro rival desaparece si llega al limite del mundo
        setLocation(getX(), getY() + speed);
        if(getY() >= getWorld().getHeight() -1){
            MyWorld mundo = (MyWorld) getWorld();
            mundo.removeObject(this);
            
            mundo.aumentar_puntuacion(10);
            mundo.disminuir_cantidad_rivales();
            mundo.aumentar_cantidad_adelantamientos();
            
        }
    }
}
