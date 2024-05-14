package model;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:21/03/2024
 *Tema:Listas Circulares Listas 
 */
public class Nodo {
    String nombreJugador;
    private Nodo siguiente;

    public Nodo(String nombre) {
        nombreJugador = nombre;
        siguiente = null;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}