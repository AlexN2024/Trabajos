package model;
import java.time.LocalDateTime;

/**
 *
 * 
 * 
 * 
 * 
 */

public class Evento {
    private int id;
    private String tipoEvento;
    private int idUsuario;
    private LocalDateTime fechaHora;
    private String contenido;


    public Evento(int id, String tipoEvento, int idUsuario, LocalDateTime fechaHora, String contenido) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}