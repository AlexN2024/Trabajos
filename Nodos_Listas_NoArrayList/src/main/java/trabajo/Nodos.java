/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

import java.util.Scanner;


/**
 *
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 22/02/2024
 * Tema : Listas y Nodos
 * 
 */


//Clase Nodo
class Nodo{
    
    //Declarar variables
    String tarea;
    boolean completada;
    Nodo siguiente;
    
    //Metodo Constructor
    public Nodo(String tarea){
        this.tarea = tarea;
        this.completada = false;
        this.siguiente = null;
    }
}

