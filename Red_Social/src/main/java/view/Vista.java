/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.SecuenciaEventos;
import java.time.LocalDateTime;
import java.util.Scanner;
import model.Evento;

/**
 *
 * @author Alexa
 */
public class Vista {
    private Scanner scanner;
    private SecuenciaEventos secuenciaEventos;

    public Vista() {
        scanner = new Scanner(System.in);
        secuenciaEventos = new SecuenciaEventos();
    }

    public void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            procesarOpcion(opcion);
        } while (opcion != 5);
    }

    private void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar evento");
        System.out.println("2. Eliminar evento");
        System.out.println("3. Buscar eventos por tipo");
        System.out.println("4. Listar eventos");
        System.out.println("5. Salir");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarEvento();
                break;
            case 2:
                eliminarEvento();
                break;
            case 3:
                buscarEventos();
                break;
            case 4:
                listarEventos();
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    private void agregarEvento() {
        System.out.print("Ingrese el ID del evento: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el tipo de evento: ");
        String tipoEvento = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la fecha y hora del evento (en formato yyyy-MM-ddTHH:mm): ");
        LocalDateTime fechaHora = LocalDateTime.parse(scanner.nextLine());
        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine();

        Evento nuevoEvento = new Evento(id, tipoEvento, idUsuario, fechaHora, contenido);
        secuenciaEventos.agregarEvento(nuevoEvento);
        System.out.println("Evento agregado correctamente.");
    }

    private void eliminarEvento() {
        System.out.print("Ingrese el ID del evento a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        secuenciaEventos.eliminarEvento(id);
    }

    private void buscarEventos() {
        System.out.print("Ingrese el tipo de evento a buscar: ");
        String tipoEvento = scanner.nextLine();
        secuenciaEventos.buscarEventos(tipoEvento);
    }

    private void listarEventos() {
        secuenciaEventos.listarEventos();
    }
}
 
 
    
    
    
    

