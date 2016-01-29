/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocienteconmetodo;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class CocienteConMetodo {


    
   public static int cociente (int numero1, int numero2){
       if (numero2 == 0){
           System.out.println("El divisor no puede ser 0");
           System.exit(1);
       }
       return numero1 / numero2;
   }
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce 2 numeros: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        
        
        try {
        int resultado = cociente (numero1, numero2);
        System.out.println(numero1 + " / " + numero2 + " es " + resultado);
        }
        
        catch (ArithmeticException ex){
            System.out.println("Excepcion: el numero " + " no puede ser dividido por 0.");
        }
            
        System.out.println("La ejecución continúa...");
        
    }
    
}
