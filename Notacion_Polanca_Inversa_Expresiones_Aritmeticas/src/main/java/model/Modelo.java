/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexa
 */
public class Modelo {
    Nodo cima;

    // Método para apilar un elemento
    public void apilar(int x) {
        Nodo nuevoNodo = new Nodo(x);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para desapilar un elemento
    public int desapilar() {
        if (cima == null) {
            System.out.println("Error: Pila vacía");
            return -1;
        }
        int x = cima.dato;
        cima = cima.siguiente;
        return x;
    }

    // Método para evaluar una expresión en Notación Polaca Inversa
    public int evaluarNotacionPolacaInversa(String expresion) {
        String[] tokens = expresion.split(" ");
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                apilar(Integer.parseInt(token));
            } else {
                int valor2 = desapilar();
                int valor1 = desapilar();
                switch (token.charAt(0)) {
                    case '+':
                        apilar(valor1 + valor2);
                        break;
                    case '-':
                        apilar(valor1 - valor2);
                        break;
                    case '*':
                        apilar(valor1 * valor2);
                        break;
                    case '/':
                        apilar(valor1 / valor2);
                        break;
                }
            }
        }
        return desapilar();
    }
}