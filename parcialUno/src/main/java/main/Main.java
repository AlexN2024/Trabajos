package main;

import java.util.Scanner;
import listaEnlazada.ListaEnlazada;

/**
 *
 *
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 05/03/2024 
 * Tema : Parcial Uno
 *
 *
 */
public class Main {

    //Metodo Main
    public static void main(String[] args) {

        //Metodo para inciializar
        ListaEnlazada tren = new ListaEnlazada();
        //incializar el scanner
        Scanner scanner = new Scanner(System.in);
        //Declarar la opcion de selección para el menu
        int opcion;

        //Ciclo do while para no salir de la aplicación hasta que el usuario quiera
        do {
            System.out.println("\nMenú del Tren de la Vida:");
            System.out.println("1. Agregar vagón");
            System.out.println("2. Desenganchar vagón");
            System.out.println("3. Mostrar vagones");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // para hacer un salto de linea

            //Switch para cada seleccion del usuario
            switch (opcion) {
                case 1:
                    tren.agregarVagon();
                    break;
                case 2:
                    tren.desengancharVagon();
                    break;
                case 3:
                    tren.mostrarVagones();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            //para salir si la opción elegida es 0
        } while (opcion != 0);
    }

}
