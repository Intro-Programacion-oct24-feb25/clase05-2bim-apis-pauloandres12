/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;


import paquete01.Operador;

public class Principal {

    public static void main(String[] args) {
        int valorA = Operador.obtenerNumero();
        int valorB = Operador.obtenerNumero();
        int suma = Operador.obtenerSuma(valorA, valorB);

        Operador.presentarDatos(valorA, valorB, suma);
    }
}
