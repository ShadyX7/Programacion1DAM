/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydieznumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArrayDiezNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayNumeros = new int[10];//134578980000
        Scanner entrada = new Scanner(System.in);
        int menor,mayor = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        double media,sumador = 0;
        //llenamos el array
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Introduzca el valor de la posicion " + i + ": ");
            arrayNumeros[i] = entrada.nextInt();
        }
        menor = arrayNumeros[0];
        mayor = arrayNumeros[0];
        //decidimos el mínimo, el máximo, la media, cuántos pares e impares
        for (int j = 0; j < arrayNumeros.length; j++) {
            sumador += arrayNumeros[j];
            //contamos pares e impares
            if(arrayNumeros[j] % 2 == 0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
            //decidimos el mayor y el menor
            if(arrayNumeros[j] < menor){
                menor = arrayNumeros[j];
            }
            if(arrayNumeros[j] > mayor){
                mayor = arrayNumeros[j];
            }
        }
        media = sumador / arrayNumeros.length;
        System.out.println("Los pares: " + contadorPares);
        System.out.println("Los impares: " + contadorImpares);
        System.out.println("La media: " + media);
        System.out.println("El menor: " + menor);
        System.out.println("El mayor: " + mayor);
        
        
        
    }
    
}


