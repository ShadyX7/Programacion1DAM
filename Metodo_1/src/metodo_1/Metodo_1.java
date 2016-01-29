/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_1;

/**
 *
 * @author DAM1
 */
public class Metodo_1 {

   static int suma(int comienzo, int finaliza ){
    int resultado = 0;
    for (int i = comienzo; i <= finaliza; i++) {
        resultado += i;
    }
    return resultado; 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("La suma de 2 hasta 7 es: " + suma(2,7));
        
        System.out.println("La suma desde 23 hasta 54 es: " + suma(23,54));
        
        System.out.println("La suma desde 62 hasta 73 es: " + suma(62,70));
        


    }

}
