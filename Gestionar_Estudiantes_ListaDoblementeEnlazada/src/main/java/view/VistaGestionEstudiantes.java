package view;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 07/03/2024
 * Tema : Listas Doblemente Enlazadas
 */

import java.util.Scanner;
// VistaGestionEstudiantes.java
import java.util.Scanner;
import model.Estudiante;

public class VistaGestionEstudiantes {
    //Declaracion de variables
    private Scanner scanner;

    //Metodo Constructor
    public VistaGestionEstudiantes() {
        //Inicializar el scanner
        scanner = new Scanner(System.in);
    }
    
    //Metodo para visualizar el menu
    public void mostrarMenu() {
        System.out.println("\nSistema de Gestión de Estudiantes");
        System.out.println("1. Agregar estudiante al final");
        System.out.println("2. Agregar estudiante al principio");
        System.out.println("3. Eliminar estudiante del final");
        System.out.println("4. Eliminar estudiante del principio");
        System.out.println("5. Mostrar lista de estudiantes");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }
    
    //Metodo para obtener y devolver la opcion del usuario
    public int obtenerOpcion() {
        return scanner.nextInt();
    }
    
    //Metodo para obtener los datos del estudiante
    public Estudiante obtenerDatosEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        //Regresar los datos tanto del nombre del estudiante como de su edad
        return new Estudiante(nombre, edad);
    }
}