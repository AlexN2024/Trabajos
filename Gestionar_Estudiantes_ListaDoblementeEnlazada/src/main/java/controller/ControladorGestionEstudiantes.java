/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Estudiante;
import model.ListaDoblementeEnlazada;
import view.VistaGestionEstudiantes;

/**
 *s
 * @author Alexa
 */
public class ControladorGestionEstudiantes {
    private ListaDoblementeEnlazada listaEstudiantes;
    private VistaGestionEstudiantes vista;

    public ControladorGestionEstudiantes() {
        listaEstudiantes = new ListaDoblementeEnlazada();
        vista = new VistaGestionEstudiantes();
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.obtenerOpcion();
            manejarOpcion(opcion);
        } while (opcion != 6);
    }

    private void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarEstudianteAlFinal();
                break;
            case 2:
                agregarEstudianteAlPrincipio();
                break;
            case 3:
                eliminarEstudianteDelFinal();
                break;
            case 4:
                eliminarEstudianteDelPrincipio();
                break;
            case 5:
                mostrarListaEstudiantes();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo.");
        }
    }

    private void agregarEstudianteAlFinal() {
        Estudiante estudiante = vista.obtenerDatosEstudiante();
        listaEstudiantes.agregarAlFinal(estudiante);
        System.out.println("Estudiante agregado al final.");
    }

    private void agregarEstudianteAlPrincipio() {
        Estudiante estudiante = vista.obtenerDatosEstudiante();
        listaEstudiantes.agregarAlPrincipio(estudiante);
        System.out.println("Estudiante agregado al principio.");
    }

    private void eliminarEstudianteDelFinal() {
        if (listaEstudiantes.cabeza == null) {
            System.out.println("La lista de estudiantes está vacía.");
        } else {
            listaEstudiantes.eliminarDelFinal();
            System.out.println("Estudiante eliminado del final.");
        }
    }

    private void eliminarEstudianteDelPrincipio() {
        if (listaEstudiantes.cabeza == null) {
            System.out.println("La lista de estudiantes está vacía.");
        } else {
            listaEstudiantes.eliminarDelPrincipio();
            System.out.println("Estudiante eliminado del principio.");
        }
    }

    private void mostrarListaEstudiantes() {
        if (listaEstudiantes.cabeza == null) {
            System.out.println("La lista de estudiantes está vacía.");
        } else {
            System.out.println("Lista de Estudiantes:");
            listaEstudiantes.imprimirLista();
        }
    }
}
