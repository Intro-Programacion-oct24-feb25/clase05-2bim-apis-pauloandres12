/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    // método que permita preguntar al usuario la dirección de la empresa
    
    public static String nombreEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();

        return nombreEmpresa;
    }

    public static String direccionEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion de la empresa");
        String direccionE = entrada.nextLine();

        return direccionE;
    }
}
