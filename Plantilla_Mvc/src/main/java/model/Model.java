package model;

/**
 *
 *
 * Nombre:Jorge Alexander Castillo Niño
 * Fecha  : 
 * Tema : 
 * 
 * 
 * 
 */
public class Model {
    //Declaración de variables
    private int Edad;
    private String nombre;
    
    //Metodo Constructor
    public Model(){
        
        this.Edad = 0;
        this.nombre = "";
        
    }
    
    
    //Metodos Propios

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
}
