/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdatos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class LeerDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta linea nos permite leer datos del usuario
        Scanner entradaDatos = new Scanner(System.in);
        int numero_1, numero_2, numero_3, media;
        System.out.print("Introduzca tres números: ");
        numero_1 = entradaDatos.nextInt();
        numero_2 = entradaDatos.nextInt();
        numero_3 = entradaDatos.nextInt();

        media = (numero_1 + numero_2 + numero_3) / 3;

        System.out.print("Los números introducidos fueron: ");
        System.out.println(numero_1 + " " + numero_2 + " " + numero_3);
        System.out.println("La media de los tres es : " + media);
    }

}
