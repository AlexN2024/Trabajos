package controller;


import model.Modelo;
import view.Vista;

/**
 *Nombre : Jorge Alexander Castillo Niño
 *Fecha : 11/04/2024
 *Tema : Notacion polanca
 */
public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Método para evaluar la expresión en Notación Polaca Inversa
    public void evaluarExpresion() {
        String expresion = vista.obtenerExpresion();
        int resultado = modelo.evaluarNotacionPolacaInversa(expresion);
        vista.mostrarResultado(resultado);
    }
}