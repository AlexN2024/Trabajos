/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 22/02/2024
 * Tema : Listas y Nodos
 */
class ListaTareas{
   //Declarar variables 
    private Nodo cabeza;
    
    //Metodo Constructor
    public ListaTareas(){
        cabeza = null;
    }
    
    //Metodo Agregar Tarea
    public void agregarTarea(String tarea){
        Nodo nuevo = new Nodo(tarea);
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    //Metodo Completar Tarea
    public void completarTarea(String tarea){
        Nodo actual = cabeza;
        while(actual != null){
            if(actual.tarea.equals(tarea)){
                actual.completada = true;
                return;
            }
            actual = actual.siguiente;
        }
    }
    //Metodo Listar Tareas
    public void listarTareas(){
        Nodo actual = cabeza;
        while(actual != null){
            String estado = actual.completada ? "Completada" : "Pendiente";
            System.out.println(actual.tarea + " - " + estado);
            actual = actual.siguiente;
        }
    }
    //Metodo Eliminar Tareas
    public void eliminarTarea(String tarea){
        if(cabeza != null && cabeza.tarea.equals(tarea)){
            cabeza = cabeza.siguiente;
            return;
        }
        
        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;
        while(actual != null){
            if(actual.tarea.equals(tarea)){
                anterior.siguiente = actual.siguiente;
                return;
            }
            anterior = anterior.siguiente;
            actual = actual.siguiente;
        }
    }
    //Metodo Contar  Tarea
    public int contarTareasPendientes(){
        int contador = 0;
        Nodo actual = cabeza;
        while(actual != null){
            if(!actual.completada){
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }
}
