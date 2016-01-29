/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradodenumero;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Cuadradodenumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cuadrado;
// num guarda el número que se lee
// cuadrado guarda el cuadrado de num
      do {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca número: ");
        num = entrada.nextInt();
        cuadrado = num * num;
          System.out.println("El resultado es: " +cuadrado);     
      } while (num >= 0); { // repetimos el proceso mientras el número que se lee no es negativo
            
                    
            
        }
    }
}

    
            
       

