/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.imparpar;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class NumeroImparPar {

    private static Object Entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = entrada.nextInt();
        while (num != 0) // mientras num sea distinto de 0
        {
            if (num % 2 == 0) // si el resto de la division entre dos es cero: es par
            {
                System.out.println("Par");
            } else // en el contrario es: impar
            {
                System.out.println("Impar");
            }
// repetir el proceso y se lee num
            System.out.print("Introduzca otro número: ");
            num = entrada.nextInt();
        }

    }

}
