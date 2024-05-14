package model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
public class Grafo {
    //Declaración de variables
    private List<Nodo> nodos;
    //Metodo constructor
    public Grafo() {
        nodos = new ArrayList<>();
    }
    //Metodo para agregar Nodo
    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }
    //Metodo para agregar la arista
    public void agregarArista(Nodo origen, Nodo destino, double distancia) {
        Edge arista = new Edge(origen, destino, distancia);
        origen.agregarAdyacente(arista);
        destino.agregarAdyacente(arista);
    }
    //Metodo para localizar el camino mas corto
    public List<Nodo> encontrarCaminoMasCorto(Nodo origen, Nodo destino) {
        PriorityQueue<Nodo> colaConPrioridad = new PriorityQueue<>((n1, n2) -> Double.compare(n1.getDistanciaAcumulada(), n2.getDistanciaAcumulada()));
        for (Nodo nodo : nodos) {
            nodo.setDistanciaAcumulada(Double.MAX_VALUE);
            nodo.setPrevio(null);
        }
        origen.setDistanciaAcumulada(0.0);
        colaConPrioridad.offer(origen);

        while (!colaConPrioridad.isEmpty()) {
            Nodo nodoActual = colaConPrioridad.poll();
            if (nodoActual == destino) {
                break;
            }
            for (Edge arista : nodoActual.getAdyacentes()) {
                Nodo vecino = arista.getDestino();
                double distanciaAcumulada = nodoActual.getDistanciaAcumulada() + arista.getDistancia();
                if (distanciaAcumulada < vecino.getDistanciaAcumulada()) {
                    colaConPrioridad.remove(vecino);
                    vecino.setDistanciaAcumulada(distanciaAcumulada);
                    vecino.setPrevio(nodoActual);
                    colaConPrioridad.offer(vecino);
                }
            }
        }

        List<Nodo> caminoMasCorto = new ArrayList<>();
        Nodo nodoActual = destino;
        while (nodoActual != null) {
            caminoMasCorto.add(0, nodoActual);
            nodoActual = nodoActual.getPrevio();
        }
        return caminoMasCorto;
    }

    // Getters y setters auxiliares para el algoritmo de Dijkstra
    
    private double getDistanciaAcumulada(Nodo nodo) {
        return nodo.getDistanciaAcumulada();
    }

    private void setDistanciaAcumulada(Nodo nodo, double distancia) {
        nodo.setDistanciaAcumulada(distancia);
    }
    
      public List<Nodo> getNodos() {
        return nodos;
    }

    private Nodo getPrevio(Nodo nodo) {
        return nodo.getPrevio();
    }

    private void setPrevio(Nodo nodo, Nodo previo) {
        nodo.setPrevio(previo);
    }
}
