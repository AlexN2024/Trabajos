/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import model.Nodo;

/**
 *
 * @author Alexa
 */
public class SillaMusicalVista {
    public static void mostrarEstado(Nodo cabeza) {
        System.out.print("Sillas restantes: ");
        Nodo actual = cabeza;
        int tamano = obtenerTamano(cabeza);

        for (int i = 0; i < tamano; i++) {
            System.out.print((actual.isOcupado() ? "X" : "O") + " ");
            actual = actual.getSiguiente();
            System.out.println("Tamaño" + tamano);
            tamano--;
        }

        System.out.println();
    }

    private static int obtenerTamano(Nodo cabeza) {
        if (cabeza == null) {
            return 0;
        }

        int tamano = 1;
        Nodo actual = cabeza.getSiguiente();

        while (actual != cabeza) {
            tamano++;
            actual = actual.getSiguiente();
        }

        return tamano;
    }
}
