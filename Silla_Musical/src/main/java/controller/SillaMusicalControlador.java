/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ListaCircular;
import model.Nodo;

/**
 *
 * @author Alexa
 */
public class SillaMusicalControlador {
    private ListaCircular sillas;
    private String[] nombresJugadores;

    public SillaMusicalControlador(int numJugadores, String[] nombresJugadores) {
        inicializarSillas(numJugadores);
        this.nombresJugadores = nombresJugadores;
    }

    public void inicializarSillas(int numJugadores) {
        sillas = new ListaCircular(numJugadores);
    }

    public void eliminarSillaAleatoria() {
        sillas.eliminarNodoAleatorio();
    }

    public int getTamanoSillas() {
        return sillas.getTamano();
    }

    public Nodo getCabezaSillas() {
        return sillas.getCabeza();
    }

    public String getNombreGanador() {
        Nodo nodoGanador = sillas.getCabeza();
        while (!nodoGanador.isOcupado()) {
            nodoGanador = nodoGanador.getSiguiente();
        }
        int indiceGanador = obtenerIndiceNodo(nodoGanador);
        return nombresJugadores[indiceGanador];
    }

    private int obtenerIndiceNodo(Nodo nodo) {
        Nodo actual = sillas.getCabeza();
        int indice = 0;
        while (actual != nodo) {
            actual = actual.getSiguiente();
            indice++;
        }
        return indice;
    }
}
