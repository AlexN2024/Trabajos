/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

import java.util.Scanner;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 22/02/2024
 * Tema : Listas y Nodos
 */
public class Main {
    //Metodo Main
    
    public static void main(String[] args) {
        
        
        ListaTareas lista = new ListaTareas();
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        //Metodo Repetir
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Contar tareas pendientes");
            System.out.println("0. Salir");
            
            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();
            
            scanner.nextLine();
            
            //Metodo para saber la opción del usuario
            switch(opcion){
                case 1: 
                    System.out.print("\nIngrese tarea: ");
                    String tarea = scanner.nextLine();
                    lista.agregarTarea(tarea);
                    break;
                case 2:
                    System.out.print("\nIngrese tarea a completar: ");
                    tarea = scanner.nextLine();  
                    lista.completarTarea(tarea);
                    break;
                case 3:
                    System.out.println("\nTareas:");
                    lista.listarTareas();
                    break;
                case 4:
                    System.out.print("\nIngrese tarea a eliminar: ");
                    tarea = scanner.nextLine();
                    lista.eliminarTarea(tarea);  
                    break;
                case 5:
                    System.out.println("\nTareas pendientes: " + lista.contarTareasPendientes());
                    break;
            }
            
        } while(opcion != 0);
        
        //Cerrar el escaner
        scanner.close();
    }
}
