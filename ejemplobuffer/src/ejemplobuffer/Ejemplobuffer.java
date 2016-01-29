/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobuffer;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ejemplobuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Introduzca su edad ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduxca su nombre");
        nombre = entrada.nextLine();
        System.out.println("Introduxca su apellido");
        String apellido = entrada.nextLine();

      

        System.out.println("Su edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);

    }

}

