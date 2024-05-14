package model;

/**
 * Nombre : Jorge Alexander Castillo Niño Fecha : 3/04/2024 Tema : Historial de
 * navegacion Pilas
 */
public class NodoPagina {
    public PaginaWeb pagina;
    public NodoPagina siguiente;

    public NodoPagina(PaginaWeb pagina) {
        this.pagina = pagina;
        this.siguiente = null;
    }

    public PaginaWeb getPagina() {
        return pagina;
    }

    public void setPagina(PaginaWeb pagina) {
        this.pagina = pagina;
    }

    public NodoPagina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPagina siguiente) {
        this.siguiente = siguiente;
    }
}
