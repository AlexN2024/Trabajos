package model;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 07/03/2024
 * Tema : Listas Doblemente Enlazadas
 */
public class Nodo {
    //Declaración de variables
    Estudiante estudiante;
    Nodo siguiente;
    Nodo anterior;
    
    //Metodo Constructor
    public Nodo(Estudiante estudiante) {
        //Inicializar Variables
        this.estudiante = estudiante;
        siguiente = null;
        anterior = null;

    }
}