package controller;

import model.PilaNodo;

/**
 * Nombre : Jorge Alexander Castillo Niño
 * Tema : Pilas
 * Fecha : 2/04/2024
 */
public class Control {
    
    public boolean sonParentesisBalanceados(String cadena) {
        PilaNodo pila = new PilaNodo();
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            if (caracter == '(') {
                pila.apilar(caracter);
            } else if (caracter == ')') {
                if (pila.estaVacia()) {
                    return false; // No hay paréntesis abierto correspondiente
                } else {
                    pila.desapilar(); // Desapilar el paréntesis abierto correspondiente
                }
            }
        }
        
        return pila.estaVacia(); // Si la pila está vacía, los paréntesis están balanceados
    }
}

    

