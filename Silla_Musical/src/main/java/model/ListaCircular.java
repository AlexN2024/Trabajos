/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexa
 */
public class ListaCircular {
    private Nodo cabeza;
    private int tamano;

    public ListaCircular(int n) {
        tamano = n;
        cabeza = new Nodo();
        Nodo actual = cabeza;

        for (int i = 1; i < n; i++) {
            actual.setSiguiente(new Nodo());
            actual = actual.getSiguiente();
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

        // Recorrer la lista hasta el nodo aleatorio
        for (int i = 0; i < indiceAleatorio; i++) {
            previo = actual;
            actual = actual.getSiguiente();
        }

        if (previo == null) {
            cabeza = actual.getSiguiente();
        } else {
            previo.setSiguiente(actual.getSiguiente());
        }

        System.out.println("Numero de jugadores");
        tamano--;
    }

    public int getTamano() {
        return tamano;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}