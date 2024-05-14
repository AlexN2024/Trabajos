package model;

import model.Nodo;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 07/03/2024
 * Tema : Listas Doblemente Enlazadas
 */
public class ListaDoblementeEnlazada {
    //Declarar variables
    public Nodo cabeza;
    private Nodo cola;

    //Clase privada Nodo
    private static class Nodo {
        //Inicializar variables
        Estudiante datos;
        Nodo anterior;
        Nodo siguiente;

        Nodo(Estudiante datos) {
            //Incializar variables
            this.datos = datos;
            anterior = null;
            siguiente = null;
        }
    }
    
    //Metodo Constructor
    public ListaDoblementeEnlazada() {
        //Inicializar variables
        cabeza = null;
        cola = null;
    }

    //Metodo para agregar datos al inicio
    public void agregarAlPrincipio(Estudiante datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
        } else {
            cabeza.anterior = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
    }
    
    //Metodo para agregar datos al final de la lista
    public void agregarAlFinal(Estudiante datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (cola == null) {
            cabeza = cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }
    
    //Metodo para eliminar datos de la lista  en concreto el dato del inicio
    public void eliminarDelPrincipio() {
        if (cabeza == null) {
            return;
        }
        if (cabeza == cola) {
            cabeza = cola = null;
        } else {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }
    }
    
    //Metodo para eliminar datos de la lista  en concreto el dato final
    public void eliminarDelFinal() {
        if (cola == null) {
            return;
        }
        if (cabeza == cola) {
            cabeza = cola = null;
        } else {
            cola = cola.anterior;
            cola.siguiente = null;
        }
    }

    //Metodo para imprimir los datos registrados
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.datos);
            actual = actual.siguiente;
        }
    }
}