package listaEnlazada;

import java.util.Scanner;
import nodos.Nodo;

/**
 *
 *
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 05/03/2024 
 * Tema : Parcial Uno
 *
 *
 */
public class ListaEnlazada {
    //Declaración de variables
    private Nodo cabeza; // Primer vagón del tren
    //Metodo Constructor
    public ListaEnlazada() {
        //Inicializar Nodo
        this.cabeza = null;
    }

    // Añadir un nuevo vagón al final del tren
    public void agregarVagon() {
        //Inicializar el scanner
        Scanner scanner = new Scanner(System.in);
        //Pedirle al usuario que ingrese que contenido va en el vagon
        System.out.print("Ingrese el contenido del nuevo vagón: ");
        //Ahora le diremos al scanner que vote la siguiente linea
        String contenido = scanner.nextLine();

        Nodo nuevoVagon = new Nodo(contenido);

        //Metodo if para agregar vagones
        if (cabeza == null) {
            cabeza = nuevoVagon;
        } else {
            Nodo actual = cabeza;
            //Ciclo mientras para repetir secuencia hasta 
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoVagon);
        }
    }

    // Desenganchar un vagón del tren
    public void desengancharVagon() {
        //Metodo para obtener datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el contenido del vagón a desenganchar: ");
        String contenido = scanner.nextLine();

        //Condicional if para saber si la cabeza es nula
        if (cabeza != null) {
            //Condicional if para ver si los contenidos son similares
            if (cabeza.getContenido().equals(contenido)) {
                cabeza = cabeza.getSiguiente();
            } else {
                Nodo actual = cabeza;
                //Ciclo mientras para repasar los datos
                while (actual.getSiguiente() != null) {
                    if (actual.getSiguiente().getContenido().equals(contenido)) {
                        actual.setSiguiente(actual.getSiguiente().getSiguiente());
                        break;
                    }
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    // Mostrar el contenido de todos los vagones
    public void mostrarVagones() {
        //Inicializar el Nodo
        Nodo actual = cabeza;
        //Ciclo mientras para imprirmir los datos y que se muestre tanto dato actual y se registre el dato siguiente y asi susesivamente
        while (actual != null) {
            System.out.println("El contenido de los vagones es : ");
            System.out.println(actual.getContenido());
            actual = actual.getSiguiente();

        }
    }

}
