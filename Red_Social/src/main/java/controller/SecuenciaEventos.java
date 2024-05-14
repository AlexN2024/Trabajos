package controller;

import model.Evento;
import model.NodoEvento;

/**
 *
 * 
 * 
 */
public class SecuenciaEventos {
    private NodoEvento cabeza;
    private NodoEvento cola;

    public SecuenciaEventos() {
        cabeza = null;
        cola = null;
    }

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    public void eliminarEvento(int id) {
        NodoEvento actual = cabeza;
        while (actual != null) {
            if (actual.getEvento().getId() == id) {
                if (actual == cabeza) {
                    cabeza = cabeza.getSiguiente();
                    if (cabeza != null) {
                        cabeza.setAnterior(null);
                    }
                } else if (actual == cola) {
                    cola = cola.getAnterior();
                    cola.setSiguiente(null);
                } else {
                    NodoEvento anterior = actual.getAnterior();
                    NodoEvento siguiente = actual.getSiguiente();
                    anterior.setSiguiente(siguiente);
                    siguiente.setAnterior(anterior);
                }
                return;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("Evento no encontrado.");
    }

    public void buscarEventos(String tipoEvento) {
        NodoEvento actual = cabeza;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.getEvento().getTipoEvento().equalsIgnoreCase(tipoEvento)) {
                System.out.println(actual.getEvento());
                encontrado = true;
            }
            actual = actual.getSiguiente();
        }
        if (!encontrado) {
            System.out.println("No se encontraron eventos de ese tipo.");
        }
    }

    public void listarEventos() {
        NodoEvento actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getEvento());
            actual = actual.getSiguiente();
        }
    }
}
