package main;

/**
 *
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 22/02/2024
 * Tema : Listas y Nodos
 * 
 * 
 */
import java.util.ArrayList;


public class ListaTareas {
    //Declaración de variables
    private ArrayList<String> tareas;

    //Metodo constructor 
    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }
    //Metodo Para Agregar Tarea
    public void agregarTarea(String tarea) {
        this.tareas.add(tarea);
    }
    //Metodo Para Completar Tarea
    public void completarTarea(String tarea) {
        if(this.tareas.contains(tarea)) {
            this.tareas.set(this.tareas.indexOf(tarea), "[X] " + tarea); 
        } else {
            System.out.println("La tarea no existe en la lista");
        }
    }
    //Metodo Para ver Tarea
    public void listarTareas() {
        System.out.println("TAREAS:");
        for(String t : this.tareas) {
            System.out.println(t);
        }
    }
    //Metodo para eliminar Tarea
    public void eliminarTarea(String tarea) { 
        this.tareas.remove(tarea);
    }
    //Metodo para contar Tareas por hacer
    public int contarTareasPendientes() {
        int contador = 0;
        for(String t : this.tareas) {
            if(!t.startsWith("[X]")) {
                contador++;
            }
        }
        return contador;
    }
}

