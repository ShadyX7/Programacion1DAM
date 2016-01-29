/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salidaformateada;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Salidaformateada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int redondeo;
       double real;
     
       System.out.print("Introduzco un numero entero: ");
       redondeo = (int) entrada.nextDouble();
       System.out.println("Introducimos un numero real: ");
       real = entrada.nextDouble();
       System.out.printf("El numero es %+d %n y el decimal es %.2f %n", redondeo, real);
       
    }
    
}
