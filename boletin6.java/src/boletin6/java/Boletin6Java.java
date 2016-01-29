/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6.java;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin6Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] arrayNumeros = new int[4][4];
        int[] filaAux = new int[4];
        int filaTitular, filaSuplente;
        Scanner entrada = new Scanner(System.in);
        //leemos las cifras para introducirlas en el array
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.println("Introduzca el valor para la fila " + i + "columna " + j + ": ");
                arrayNumeros[i][j] = entrada.nextInt();
            }

        }
        System.out.println("La matriz es esta Jose:");
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("Introduzca la fila a cambiar: ");
        filaTitular = entrada.nextInt();
        System.out.println("Introduzca la fila por la que debe cambiarse la primera: ");
        filaSuplente = entrada.nextInt();
        filaTitular--;
        filaSuplente--;
        
        for (int i = 0; i < arrayNumeros[filaTitular].length; i++) {
            //salvamos la fila titular
            filaAux[i] = arrayNumeros[filaTitular][i];
            //metemos los valores de la fila suplente en la titular
            arrayNumeros[filaTitular][i] = arrayNumeros[filaSuplente][i];
            //restablecemos los valores de la fila titular que salvamos en la fila Aux
            arrayNumeros[filaSuplente][i] = filaAux[i];
        }
        System.out.println("La matriz es esta:");
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j]);
            }
            System.out.println("\n");
        }
    }

}
