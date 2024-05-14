/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ControladorCuentaBancaria;
import model.CuentaBancaria;
import view.VistaCuentaBancaria;

/**
 *
 * Nombre : Jorge Alexander Castillo Niño
 * Fecha : 20/02/2024
 * Tema : Mvc
 * 
 * 
 */
public class Main {
    
    //Metodo Main
    public static void main(String[] args) {
        
        //Inicializar Metodos
        CuentaBancaria cuenta = new CuentaBancaria();
        VistaCuentaBancaria vista = new VistaCuentaBancaria();
        ControladorCuentaBancaria controlador = new ControladorCuentaBancaria(cuenta, vista);
        controlador.gestionarCuenta();
        
        
        
    }
}