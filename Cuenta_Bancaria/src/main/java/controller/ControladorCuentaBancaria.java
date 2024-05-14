/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CuentaBancaria;
import view.VistaCuentaBancaria;

/**
 *
 * @author Alexa
 */
public class ControladorCuentaBancaria {
    private CuentaBancaria cuenta;
    private VistaCuentaBancaria vista;

    public ControladorCuentaBancaria(CuentaBancaria cuenta, VistaCuentaBancaria vista) {
        this.cuenta = cuenta;
        this.vista = vista;
    }

    public void gestionarCuenta() {
        char operacion;
        do {
            operacion = vista.solicitarOperacion();
            if (operacion == 'D') {
                double cantidad = vista.solicitarCantidad();
                cuenta.depositar(cantidad);
            } else if (operacion == 'R') {
                double cantidad = vista.solicitarCantidad();
                cuenta.retirar(cantidad);
            }
        } while (vista.deseaContinuar());

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
