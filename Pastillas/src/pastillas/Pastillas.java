/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastillas;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Pastillas {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos, numSemanas;
        String semana;
        char[][] dias;
        System.out.println("INTRODUZCA EL NÚMERO DE CASOS DE PRUEBA:");
        casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            System.out.println("INTRODUZCA LAS SEMANAS DEL CASO:" + i);
            numSemanas = entrada.nextInt();
            entrada.nextLine();
            dias = new char[numSemanas][7];
            for (int j = 0; j < numSemanas; j++) {
                System.out.println("INTRODUZCA LA SEMANA DE PASTILLAS " + j + " :");
                semana = entrada.nextLine();
                dias[j] = semana.toCharArray();
            }
            trataCasoPrueba(dias);
        }

    }

    public static char diaSemana(int posicion) {
        char dia = '\u0000';
        switch (posicion) {
            case 0:
                dia = 'L';
                break;
            case 1:
                dia = 'M';
                break;
            case 2:
                dia = 'X';
                break;
            case 3:
                dia = 'J';
                break;
            case 4:
                dia = 'V';
                break;
            case 5:
                dia = 'S';
                break;
            case 6:
                dia = 'D';
                break;
        }
        return dia;
    }

    public static int[][] compruebaPosterior(int fila, int posicion, char[][] dias) {

        for (int i = fila+1; i < dias.length; i++) {
            if(dias[][])
                
        }
    }

    public static String trataCasoPrueba(char[][] dias) {
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if ("-".equals(dias[i][j])) {
                    compruebaPosterior(i, j, dias);
                }
            }
        }

    }

}