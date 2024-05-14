package view;

import java.util.List;
import model.Nodo;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
public class View {
    //Metodo para mostrar la ruta optima
    public void mostrarRuta(List<Nodo> ruta) {
        System.out.println("Ruta óptima:");
        for (Nodo nodo : ruta) {
            System.out.print(nodo.getNombre() + " -> ");
        }
        System.out.println();
    }
    //Metodo para mostrar la tarifa
    public void mostrarTarifa(double tarifa) {
        System.out.println("Tarifa: $" + tarifa);
    }
    
    
}
