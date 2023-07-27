import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    //Variables para inicializar el mundo
    private Counter score;
    public Counter level;
    
    
    private int velocidad_enemigo;
    private int cantidad_adelantamientos;
    private int cantidad_adelantamientos_nivel;
    private int cantidad_rivales;
    private Usuario carro;
    
    
    //Sonido mundo
    GreenfootSound backgroundMusic = new GreenfootSound("../sounds/audio_coche.mp3");
    
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 706, 1); 
        prepare();
        carro = new Usuario(4);
        //Lugar donde colocamos al carro_usuario
        addObject(carro, 275, 515);
        
        //Inicializar variables
        cantidad_adelantamientos = 0;
        cantidad_adelantamientos_nivel = 4;
        velocidad_enemigo = 5;
        //cantidad_rivales = 0;
        
        score = new Counter("Soccer: ");
        level = new Counter("Level: ");
        level.add(1);
        
        addObject(level, 175, 30);
        addObject(score, 180, 50);
        
        
        
        
    }
    public void act(){
        backgroundMusic.playLoop();
        aumentar_dificultad();
        agregar_rivales();
    }
    
    public void stop_audio(){
        backgroundMusic.stop();
    }
    
    /*public int getRandomNumber(int start, int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }*/
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    
    public void aumentar_cantidad_adelantamientos(){
        cantidad_adelantamientos++;
    }
    
    public void disminuir_cantidad_rivales(){
        cantidad_rivales = 0;
    }
    
    public void aumentar_dificultad(){
        if(cantidad_adelantamientos == cantidad_adelantamientos_nivel){
            cantidad_adelantamientos = 0;
            cantidad_adelantamientos_nivel = cantidad_adelantamientos_nivel+ 2;
            velocidad_enemigo++;
            level.add(1);
            carro.aumenta_velocidad();
        }
        
    }
    
    
    public void agregar_rivales(){
        if(cantidad_rivales ==0){
            int carril = Greenfoot.getRandomNumber(2);
            
            //Primer auto
            if(carril==0){
                addObject(new Rival(velocidad_enemigo),155, 85);
            }
            if(carril==1){
                addObject(new Rival(velocidad_enemigo),275, 85);
            }
            if(carril==2){
                addObject(new Rival(velocidad_enemigo),395, 85);
            }
            carril ++;
            carril = carril % 3;
            
            //Segundo auto
            if(carril==0){
                addObject(new Rival(velocidad_enemigo),155, 85);
            }
            if(carril==1){
                addObject(new Rival(velocidad_enemigo),275, 85);
            }
            if(carril==2){
                addObject(new Rival(velocidad_enemigo),395, 85);
            }
            
            cantidad_rivales = 2;
        }
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
