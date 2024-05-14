package nodos;

/**
 *
 *
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 05/03/2024 
 * Tema : Parcial Uno
 *
 *
 */
public class Nodo {
    //Declaración de variables
    
    private String contenido; // Datos del vagón
    private Nodo siguiente; // Enlace al siguiente vagón

    //Metodo Constructor
    public Nodo(String contenido) {
        
        //Inicializar variables
        this.contenido = contenido;
        this.siguiente = null;

    }
    
    

    //Metodos getter y setter
    public String getContenido() {
        return contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
