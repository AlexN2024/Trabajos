package controller;

import model.ListaCircular;
import model.Nodo;
import view.Vista;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:21/03/2024
 *Tema:Listas Circulares Listas 
 */
public class Controlador {
    private ListaCircular listaCircular;
    private Vista vista;

    public Controlador() {
        vista = new Vista();
        int numeroJugadores = vista.solicitarNumeroJugadores();
        listaCircular = new ListaCircular(numeroJugadores);

        String[] nombresJugadores = vista.solicitarNombresJugadores(numeroJugadores);
        for (int i = 0; i < numeroJugadores; i++) {
            listaCircular.setNombreJugador(i, nombresJugadores[i]);
        }
    }

    public void iniciarJuego() {
        while (listaCircular.getTamano() > 1) {
            listaCircular.eliminarNodoAleatorio();
            vista.mostrarEstadoJuego(listaCircular);
        }
        

        Nodo ganador = listaCircular.getCabeza();
        vista.mostrarGanador(ganador.getNombreJugador());
    }
}