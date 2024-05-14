package model;

/**
 * Nombre: Jorge Alexander Castillo Niño Jorge Alejandro Arias Trujillo
 * Fecha : 29/02/2024
 * Tema : Laberinto
 */

public class Nodo {
    //Declaración de variables
    private String pregunta;
    private int respuestaCorrecta;

    //Metodo Constructor
    public Nodo(String pregunta, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    //Metodos Getter

    public String getPregunta() {
        return pregunta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}