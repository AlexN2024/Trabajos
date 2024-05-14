package view;

/**
 *Nombre : Jorge Alexander Castillo Niño
 *Fecha : 11/04/2024
 *Tema : Notacion polanca
 */
public class Vista {
    java.util.Scanner scanner;

    public Vista() {
        scanner = new java.util.Scanner(System.in);
    }

    // Método para obtener la expresión en Notación Polaca Inversa
    public String obtenerExpresion() {
        System.out.print("Ingrese la expresión en Notación Polaca Inversa: ");
        return scanner.nextLine();
    }

    // Método para mostrar el resultado
    public void mostrarResultado(int resultado) {
        System.out.println("El resultado de la expresión en Notación Polaca Inversa es: " + resultado);
    }
}