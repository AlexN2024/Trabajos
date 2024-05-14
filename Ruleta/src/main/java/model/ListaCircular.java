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
    //Declaración de variables
    Nodo cabeza;

    //Metodo Constructor
    public ListaCircular() {
        //Inicializar Variables
        cabeza = null;
    }

    //Metodo para agregar datos
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }

    //Metodo para girar la ruleta
    public int girarRuleta() {
        if (cabeza == null) {
            return -1; 
        }
        Nodo temp = cabeza;
        while (temp.siguiente != cabeza) {
            temp = temp.siguiente;
        }
        return temp.dato;
    }
}