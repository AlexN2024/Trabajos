package model;

/**
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 3/04/2024 
 * Tema : Historial de navegacion Pilas
 */
public class PaginaWeb {
    private String url;
    private String titulo;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }
}