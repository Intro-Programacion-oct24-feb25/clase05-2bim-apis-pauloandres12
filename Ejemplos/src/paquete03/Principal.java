/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.imprimirMensaje;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
   
        imprimirMensaje.imprimirMensaje(valorA, valorB, suma, multiplicacion);
        
        // primero se importa el paquete06 en donde se va a imprimir el mensaje,
        // luego se crea desde el main la funcion en la que se va a imprimir
        // se llama a la funcion y la funcion dentro del paquete06 se encargara
        // de retornar lo que se va a presentar en pantalla
    }
}
