/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Alexa
 */
import java.util.Scanner;

public class VistaCuentaBancaria {
    private Scanner scanner;

    public VistaCuentaBancaria() {
        this.scanner = new Scanner(System.in);
    }

    public double solicitarCantidad() {
        System.out.print("Ingrese la cantidad: ");
        return scanner.nextDouble();
    }

    public char solicitarOperacion() {
        System.out.print("¿Desea realizar un depósito (D) o un retiro (R)? ");
        return scanner.next().charAt(0);
    }

    public boolean deseaContinuar() {
        System.out.print("¿Desea continuar (S/N)? ");
        return scanner.next().equalsIgnoreCase("S");
    }
}
