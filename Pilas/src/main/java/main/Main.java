package main;

import controller.Control;
/**
 * Nombre : Jorge Alexander Castillo Niño
 * Tema : Pilas
 * Fecha : 2/04/2024
 */
public class Main {
    //Metodo MAIN
    public static void main(String[] args) {
        Control controller = new Control();
        
        String cadena1 = "(((((a+b)))*c)";
        String cadena2 = "(a+b()()()()()()()()))()()()()()()()))";
        
        System.out.println(cadena1 + " está balanceada: " + controller.sonParentesisBalanceados(cadena1));
        System.out.println(cadena2 + " está balanceada: " + controller.sonParentesisBalanceados(cadena2));
    }

}
