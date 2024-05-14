package model;

import java.util.ArrayList;
import java.util.List;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
// Clase Node (Nodo)
public class Nodo {
    private String nombre;
    private List<Edge> adyacentes;
    private double distanciaAcumulada;
    private Nodo previo;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.adyacentes = new ArrayList<>();
        this.distanciaAcumulada = Double.MAX_VALUE;
        this.previo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Edge> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(List<Edge> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public void agregarAdyacente(Edge arista) {
        adyacentes.add(arista);
    }

    public double getDistanciaAcumulada() {
        return distanciaAcumulada;
    }

    public void setDistanciaAcumulada(double distanciaAcumulada) {
        this.distanciaAcumulada = distanciaAcumulada;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}