package view;

//import java.awt.BorderLayout;
import controller.ControladorHistorial;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;  
import model.HistorialNavegacion;
import model.PaginaWeb;

/**
 * Nombre : Jorge Alexander Castillo Niño 
 * Fecha : 3/04/2024 
 * Tema : Historial de navegacion Pilas
 */

public class VistaHistorial extends JFrame {
    private HistorialNavegacion historial;

    private JButton btnRetroceder;
    private JButton btnAvanzar;
    private JButton btnVisitar;
    private JTextField txtURL;
    private JLabel lblPaginaActual;

    public VistaHistorial() {
        historial = new HistorialNavegacion();

        setTitle("Gestor de Navegación de Historial Web");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelBotones = new JPanel(new FlowLayout());
        btnRetroceder = new JButton("Retroceder");
        btnAvanzar = new JButton("Avanzar");
        btnVisitar = new JButton("Visitar Página");
        txtURL = new JTextField(30);
        lblPaginaActual = new JLabel("Página actual: ");

        panelBotones.add(btnRetroceder);
        panelBotones.add(btnAvanzar);
        panelBotones.add(btnVisitar);

        JPanel panelURL = new JPanel();
        panelURL.add(new JLabel("URL: "));
        panelURL.add(txtURL);

        add(panelBotones, BorderLayout.NORTH);
        add(panelURL, BorderLayout.CENTER);
        add(lblPaginaActual, BorderLayout.SOUTH);
    }

    public void setRetrocederListener(ActionListener listener) {
        btnRetroceder.addActionListener(listener);
    }

    public void setAvanzarListener(ActionListener listener) {
        btnAvanzar.addActionListener(listener);
    }

    public void setVisitarListener(ActionListener listener) {
        btnVisitar.addActionListener(listener);
    }

    public String getURL() {
        return txtURL.getText();
    }

    public void mostrarPagina(PaginaWeb pagina) {
        JOptionPane.showMessageDialog(this, "Página actual: " + pagina.getTitulo() + "\nURL: " + pagina.getUrl());
        lblPaginaActual.setText("Página actual: " + pagina.getTitulo());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VistaHistorial vista = new VistaHistorial();
                vista.setVisible(true);
                new ControladorHistorial(vista.historial, vista);
            }
        });
    }
}