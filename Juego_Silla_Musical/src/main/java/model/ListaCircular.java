package model;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:21/03/2024
 *Tema:Listas Circulares Listas 
 */
public class ListaCircular {
    private Nodo cabeza;
    private int tamano;

    public ListaCircular(int n) {
        tamano = n;
        cabeza = null;
        Nodo actual = null;

        for (int i = 0; i < n; i++) {
            Nodo nuevoNodo = new Nodo("");
            if (cabeza == null) {
                cabeza = nuevoNodo;
                actual = cabeza;
            } else {
                actual.setSiguiente(nuevoNodo);
                actual = actual.getSiguiente();
            }
        }

        actual.setSiguiente(cabeza);
    }

    public void eliminarNodoAleatorio() {
        if (tamano == 1) {
            cabeza = null;
            return;
        }

        int indiceAleatorio = (int) (Math.random() * tamano);
        Nodo actual = cabeza;
        Nodo previo = null;

        for (int i = 0; i < indiceAleatorio; i++) {
            previo = actual;
            actual = actual.getSiguiente();
        }

        if (previo == null) {
            cabeza = actual.getSiguiente();
        } else {
            previo.setSiguiente(actual.getSiguiente());
        }

        tamano--;
    }

    public int getTamano() {
        return tamano;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setNombreJugador(int indice, String nombre) {
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        actual.nombreJugador = nombre;
    }
}