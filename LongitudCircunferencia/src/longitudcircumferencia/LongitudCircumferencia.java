/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longitudcircumferencia;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class LongitudCircumferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, longitud;
        final double PI = 3.141592;//Pi es una constante!!!
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circumferencia");
        radio = entrada.nextDouble();

        longitud = radio * 2 * PI;
        System.out.println("La longitud de la circumferencia es: " + longitud);

    }

}
