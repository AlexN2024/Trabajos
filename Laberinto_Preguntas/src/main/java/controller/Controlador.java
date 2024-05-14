package controller;


/**
 * Nombre: Jorge Alexander Castillo Niño Jorge Alejandro Arias Trujillo
 * Fecha : 29/02/2024
 * Tema : Laberinto
 */
import java.util.Scanner;
import model.Nodo;
import view.Vista;

public class Controlador {
    //Declaración de variables
    private Vista vista;
    private Nodo[] nodos;
    private Scanner scanner;

    //Metodo Constructor
    public Controlador() {
        //Inicializar variables
        this.vista = new Vista();
        this.nodos = new Nodo[10];
        this.scanner = new Scanner(System.in);
        inicializarNodos();
    }
    
    //Metodo para las preguntas
    private void inicializarNodos() {
        nodos[0] = new Nodo("¿La Estatua de la Libertad está ubicada en Nueva York?", 1);
        nodos[1] = new Nodo("¿El himno nacional de Estados Unidos se llama \"The Star-Spangled Banner\"?", 1);
        nodos[2] = new Nodo("¿El río Nilo es el río más largo del mundo?", 1);
        nodos[3] = new Nodo("¿El Sol es una estrella?", 1);
        nodos[4] = new Nodo("¿La Mona Lisa fue pintada por Vincent van Gogh?", 2);
        nodos[5] = new Nodo("¿La Gran Muralla China es visible desde la Luna?", 2);
        nodos[6] = new Nodo("¿El alfabeto griego tiene 24 letras?", 1);
        nodos[7] = new Nodo("¿La Torre Eiffel está ubicada en Londres?", 2);
        nodos[8] = new Nodo("¿El Monte Everest es la montaña más alta del mundo?", 1);
        nodos[9] = new Nodo("¿El Amazonas es el río más caudaloso del mundo?", 1);
    }
    
//Metodo para iniciar el juego
    public void iniciarJuego() {
        for (Nodo nodo : nodos) {
            boolean respuestaCorrecta = false;
            while (!respuestaCorrecta) {
                vista.mostrarPregunta(nodo.getPregunta());
                int respuesta = scanner.nextInt();
                if (respuesta == nodo.getRespuestaCorrecta()) {
                    respuestaCorrecta = true;
                    vista.mostrarExito();
                } else {
                    vista.mostrarFallo();
                }
            }
        }
        vista.mostrarVictoria();
    }
}

