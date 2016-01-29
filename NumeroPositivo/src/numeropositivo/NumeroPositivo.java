/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropositivo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class NumeroPositivo {

    private static Object Entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = entrada.nextInt();
        while (num != 0) {

            if (num > 0) // mayor que cero: positivo
            {
                System.out.println("Positivo");
            } else // si no es positivo: es negativo
            {
                System.out.println("Negativo");
            }

// repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro número: ");
            num = entrada.nextInt();
            //}
// al salir del mientras tenemos la certeza que num es 0  
        }
    }
}
