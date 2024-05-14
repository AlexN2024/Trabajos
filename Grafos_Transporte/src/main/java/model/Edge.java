package model;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
public class Edge {
    //Declaración de variables
    private Nodo origen;
    private Nodo destino;
    private double distancia;
    //Metodo Constructor
    public Edge(Nodo origen, Nodo destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }
    //Metodos setter y getter
    public Nodo getOrigen() {
        return origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
