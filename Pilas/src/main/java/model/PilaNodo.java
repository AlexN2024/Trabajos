package model;

/**
 *
 * Nombre : Jorge Alexander Castillo Niño
 * Tema : Pilas
 * Fecha : 2/04/2024
 * 
 */
public class PilaNodo {
    private Nodo cima;

    public PilaNodo() {
        cima = null;
        
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(char caracter) {
        
        Nodo nuevoNodo = new Nodo(caracter);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        
    }

    public char desapilar() {
        if (!estaVacia()) {
            char caracterDesapilado = cima.caracter;
            cima = cima.siguiente;
            return caracterDesapilado;
        } else {
            return '\0'; // Retorna un valor nulo en caso de que la pila esté vacía
        }
    }
}

