package view;

/**
 *
 * Nombre: Jorge Alexander Castillo Niño Jorge Alejandro Arias Trujillo
 * Fecha : 29/02/2024
 * Tema : Laberinto
 * 
 */
//Declaración de variables


public class Vista {
    
    //Metodo Para mostrar pregunta
    public void mostrarPregunta(String pregunta) {
        System.out.println(pregunta);
    }
    //Metodo Para mostrar mensaje de victora
    public void mostrarExito() {
        System.out.println("¡Respuesta correcta! Avanzas en el laberinto.");
    }
    //Metodo Para mostrar fallo
    public void mostrarFallo() {
        System.out.println("Respuesta incorrecta. Intenta de nuevo.");
    }
    //Metodo Para mostrar victoria
    public void mostrarVictoria() {
        System.out.println("¡Felicidades! Has alcanzado el tesoro.");
    }
}


