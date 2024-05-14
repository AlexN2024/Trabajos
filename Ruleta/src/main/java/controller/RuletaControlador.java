package controller;

import model.ListaCircular;

/**
 *Nombre:Jorge Alexander Castillo Niño
 *Fecha:20/03/2024
 *Tema:Listas Circulares
 */
public class RuletaControlador {
    //Declaración de variables
    ListaCircular ruleta;

    //Metodo Constructor
    public RuletaControlador() {
        inicializarRuleta();
    }

    //Metodo para inicializar la ruleta
    public void inicializarRuleta() {
        ruleta = new ListaCircular();
        for (int i = 1; i <= 36; i++) {
            ruleta.agregar(i);
        }
        ruleta.agregar(0);
    }

    //Metodo para girar la ruleta
    public int girarRuleta() {
        return ruleta.girarRuleta();
    }
}
