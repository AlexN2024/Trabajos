package main;

import controller.Controller;
import javax.swing.JOptionPane;
import model.Model;
import model.Nodo;
import view.View;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
public class Main {
    //Metodo Main
    public static void main(String[] args) {
        Model modelo = new Model();
        View vista = new View();
        Controller controlador = new Controller(modelo, vista);
        
        // Prueba
        
        Nodo origen = modelo.getGrafo().getNodos().get(0);
        Nodo destino = modelo.getGrafo().getNodos().get(3);
        controlador.planificarRuta(origen, destino);
    }
}