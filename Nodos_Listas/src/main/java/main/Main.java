package main;

import java.util.Scanner;

/**
 *
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 22/02/2024
 * Tema : Listas y Nodos
 * 
 * 
 */
public class Main {
    
    //Metodo Main
    public static void main(String[] args) {
        //inicializar objetos
        Scanner scanner = new Scanner(System.in);
        ListaTareas tareas = new ListaTareas();
        
        int opcion = 0;
        
        //Proceso para repetir el ciclo
        while(opcion != 6) {
            System.out.println("\n** Lista de Tareas **");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Completar Tarea");
            System.out.println("3. Listar Tareas");
            System.out.println("4. Eliminar Tarea"); 
            System.out.println("5. Contar Tareas Pendientes");
            System.out.println("6. Salir");
            
            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();
            
            
            //Proceso para elegir la opción
            switch(opcion) {
                case 1: 
                    System.out.print("Ingrese la tarea: ");
                    scanner.nextLine();
                    String tarea = scanner.nextLine();
                    tareas.agregarTarea(tarea);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    scanner.nextLine();
                    String tareaCompletar = scanner.nextLine();  
                    tareas.completarTarea(tareaCompletar);
                    break;
                case 3:
                    tareas.listarTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    scanner.nextLine();
                    String tareaEliminar = scanner.nextLine();
                    tareas.eliminarTarea(tareaEliminar);
                    break;
                case 5:  
                    System.out.println("Tareas pendientes: " + tareas.contarTareasPendientes());
                    break;
                case 6: 
                    break;
                default:
                    System.out.println("Opción no válida");             
            }
        }
        
        //Cerrar el escanner
        scanner.close();
    }
}
