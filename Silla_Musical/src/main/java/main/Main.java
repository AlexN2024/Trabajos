/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.SillaMusicalControlador;
import java.util.Scanner;

import view.SillaMusicalVista;

/**
 *
 * @author Alexa
 */

public class Main {
    //Metodo Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de ingresar el número

        String[] nombresJugadores = new String[numJugadores];
        System.out.println("Ingrese los nombres de los jugadores:");
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            nombresJugadores[i] = scanner.nextLine();
        }

        SillaMusicalControlador controlador = new SillaMusicalControlador(numJugadores, nombresJugadores);
        jugarSillaMusical(controlador);
        scanner.close();
    }

    public static void jugarSillaMusical(SillaMusicalControlador controlador) {
        SillaMusicalVista.mostrarEstado(controlador.getCabezaSillas());
       
        while (controlador.getTamanoSillas() > 1) {
            System.out.println("Eliminando una silla...");
            controlador.eliminarSillaAleatoria();
            SillaMusicalVista.mostrarEstado(controlador.getCabezaSillas());
            
        }
        
        System.out.println("¡El ganador es el jugador " + controlador.getNombreGanador() + "!");
    }
}