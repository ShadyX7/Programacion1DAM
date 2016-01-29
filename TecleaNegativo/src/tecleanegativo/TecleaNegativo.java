/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecleanegativo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class TecleaNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int contador;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = entrada.nextInt();
        contador = 0;
        while (num >= 0) // Ejecutar el programa correctamente
        {
            contador = contador + 1;
            {
                System.out.print("Introduzca un número: ");
            }
            num = entrada.nextInt();

        }

        System.out.println("Se ha introducido " + contador + " numeros");

    }
}
