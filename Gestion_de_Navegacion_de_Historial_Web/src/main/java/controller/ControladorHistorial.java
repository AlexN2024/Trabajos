package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.HistorialNavegacion;
import model.PaginaWeb;
import view.VistaHistorial;

/**
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 3/04/2024 
 * Tema : Historial de navegacion Pilas
 */

public class ControladorHistorial {
    
    private HistorialNavegacion historial;
    private VistaHistorial vista;

    public ControladorHistorial(HistorialNavegacion historial, VistaHistorial vista) {
        this.historial = historial;
        this.vista = vista;

        
        // Asociar eventos de botones con métodos del historial
        vista.setRetrocederListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPagina(historial.desapilar());
            }
        });
 
/**
        vista.setAvanzarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String url = vista.getURL();
                mostrarPagina(historial.apilar(url));
                 
                
            }
        });
 */

        vista.setVisitarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String url = vista.getURL();
                String titulo = JOptionPane.showInputDialog("Ingrese el título de la página:");
                historial.visitarPagina(new PaginaWeb(url, titulo));
                mostrarPagina(historial.desapilar());
                
            }
        });
    }

    private void mostrarPagina(PaginaWeb pagina) {
        vista.mostrarPagina(pagina);
    }
}
