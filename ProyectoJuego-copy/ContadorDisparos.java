import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContadorDisparos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContadorDisparos extends Actor
{
    /**
     * Act - do whatever the ContadorDisparos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int contar = 15;
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Shots: " + contar, 22, Color.WHITE, Color.BLACK));
        
    }
    
    public void addContar(){
        contar--;
    }
}
