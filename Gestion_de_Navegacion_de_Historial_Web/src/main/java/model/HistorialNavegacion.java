package model;




/**
 *Nombre : Jorge Alexander Castillo Niño
 *Fecha : 3/04/2024
 *Tema : Historial de navegacion Pilas 
 */
import java.util.Stack;


public class HistorialNavegacion {
    private Stack<PaginaWeb> haciaAtras;
    private Stack<PaginaWeb> haciaAdelante;
    private PaginaWeb paginaActual;
    private NodoPagina cima;

    public HistorialNavegacion() {
        haciaAtras = new Stack<>();
        haciaAdelante = new Stack<>();
        
        // Página predeterminada
        
        paginaActual = new PaginaWeb("http://www.ejemplo.com", "Ejemplo");
        haciaAtras.push(paginaActual);
    }

    public void visitarPagina(PaginaWeb pagina) {
        haciaAtras.push(pagina);
        haciaAdelante.empty();
        paginaActual = pagina;
    }

    public PaginaWeb retroceder() {
        if (!haciaAtras.isEmpty()) {
            haciaAdelante.push(paginaActual);
            paginaActual = haciaAtras.pop();
            
        }
        return paginaActual;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    public void apilar(PaginaWeb pagina) {
        
        NodoPagina nuevoNodo = new NodoPagina(pagina);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        
    }

    public PaginaWeb desapilar() {
        if (!estaVacia()) {
            PaginaWeb pagina = cima.pagina;
            cima = cima.siguiente;
            return pagina;
        } else {
           
           return paginaActual;
            
        }
     
    }

}