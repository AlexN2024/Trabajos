package view;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:21/03/2024
 *Tema:Listas Circulares Listas 
 */
import model.ListaCircular;
import model.Nodo;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int solicitarNumeroJugadores() {
        System.out.print("Ingrese el número de jugadores: ");
        
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextInt();
    }

    public String[] solicitarNombresJugadores(int numJugadores) {
        String[] nombres = new String[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        return nombres;
    }

    public void mostrarEstadoJuego(ListaCircular listaCircular) {
        Nodo actual = listaCircular.getCabeza();
        int contadorSillas = 1;

        System.out.println("Estado del juego:");

        do {
            System.out.println("Silla " + contadorSillas + ": " + actual.getNombreJugador());
            actual = actual.getSiguiente();
            contadorSillas++;
        } while (actual != listaCircular.getCabeza());
    }

    public void mostrarGanador(String nombreGanador) {
        System.out.println("¡Felicidades! El ganador del juego es " + nombreGanador + ".");
    }
}
