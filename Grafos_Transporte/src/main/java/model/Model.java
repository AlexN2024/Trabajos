package model;

/**
 *Nombres : Jorge Alexander Castillo Niño
 *Fecha : 7/05/2024
 *Tema : Grafos
 */
public class Model {
    //Declaración de variables
    private Grafo grafo;
    //Metodo constructor
    public Model() {
        grafo = new Grafo();
        // Inicializar el grafo con los nodos y aristas correspondientes
        Nodo nodo1 = new Nodo("Nodo 1");
        Nodo nodo2 = new Nodo("Nodo 2");
        Nodo nodo3 = new Nodo("Nodo 3");
        Nodo nodo4 = new Nodo("Nodo 4");

        grafo.agregarNodo(nodo1);
        grafo.agregarNodo(nodo2);
        grafo.agregarNodo(nodo3);
        grafo.agregarNodo(nodo4);

        grafo.agregarArista(nodo1, nodo2, 5.0);
        grafo.agregarArista(nodo1, nodo3, 2.0);
        grafo.agregarArista(nodo2, nodo4, 3.0);
        grafo.agregarArista(nodo3, nodo4, 7.0);
        
     
    
        
    }

    //Metodo para obtener el grafo
    public Grafo getGrafo() {
        return grafo;
    }
}
