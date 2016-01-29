/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoadivinanum;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class JuegoAdivinaNum {
    private static Object entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n; // n es el numero a adivinar
        int num; //num guarda los numeros introducidos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Intoduzca el numero N el cual tengo que adivinar: ");
        n = entrada.nextInt();
        
        System.out.print("Introduzca un numero : ");
        num = entrada.nextInt();
        
        while (num!=n)
        {
          
            if (num>n)
            System.out.println("mayor");
            
            else
           System.out.println("menor");
            
        System.out.print (" Introduce numero: ");
        num = entrada.nextInt();
         }
        System.out.println(" ACERTASTE!!!");
       
    
        
    }
    
}
