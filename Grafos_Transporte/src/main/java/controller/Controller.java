package controller;

import java.util.List;
import model.Edge;
import model.Grafo;
import model.Model;
import model.Nodo;
import view.View;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */

public class Controller {
    //Declaración de variables
    private Model modelo;
    private View vista;
    
    //Metodo constructor
    public Controller(Model modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    //Metodo para buscar la ruta
    public void planificarRuta(Nodo origen, Nodo destino) {
        Grafo grafo = modelo.getGrafo();
        List<Nodo> rutaOptima = grafo.encontrarCaminoMasCorto(origen, destino);
        vista.mostrarRuta(rutaOptima);
        calcularTarifa(rutaOptima);
    }  
    //Metodo para calcular la tarifa
    public void calcularTarifa(List<Nodo> ruta) {
        double tarifa = 0.0;
        for (int i = 0; i < ruta.size() - 1; i++) {
            Nodo origen = ruta.get(i);
            Nodo destino = ruta.get(i + 1);
            for (Edge arista : origen.getAdyacentes()) {
                if (arista.getDestino() == destino) {
                    tarifa += arista.getDistancia();
                    break;
                }
            }
        }
        // Ajuste de tarifa (suponiendo $0.5 por unidad de distancia)
        tarifa *= 0.5;
        vista.mostrarTarifa(tarifa);
    }
}