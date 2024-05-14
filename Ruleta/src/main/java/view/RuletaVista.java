package view;

import controller.RuletaControlador;
import java.util.Scanner;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:20/03/2024
 *Tema:Listas Circulares
 */

public class RuletaVista {
    //Declaración de variables
    RuletaControlador controlador;
    Scanner entrada;

    //Metodo Constructor
    public RuletaVista() {
        //Incializar variables
        controlador = new RuletaControlador();
        entrada = new Scanner(System.in);
    }
    
    //Metodo para mostrar el menu
    public void mostrarMenu() {
        //Mostrar opciones del usuario
        System.out.println("Bienvenido al Juego de la Ruleta");
        System.out.println("1. Girar la Ruleta");
        System.out.println("2. Salir");
    }

    
    //Metodo para ejecutar las funciones(init)
    public void ejecutar() {
        while (true) {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                
                int resultado = controlador.girarRuleta();
                System.out.println("El resultado de la ruleta es: " + resultado);
            } else if (opcion == 2) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}

