package main;

import controller.Controlador;
import model.Modelo;
import view.Vista;



/**
 *Nombre : Jorge Alexander Castillo Niño
 *Fecha : 11/04/2024
 *Tema : Notacion polanca
 */

// Clase Main
public class Main {
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        // Ejemplo de uso
        controlador.evaluarExpresion();
    }
    
    
}