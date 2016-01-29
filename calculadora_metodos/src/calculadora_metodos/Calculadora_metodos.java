/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_metodos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Calculadora_metodos {
    
    static int sumar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
    static int restar(int numero1, int numero2){
        int resultado;
        resultado = numero1 - numero2;
        return resultado;
    }
    static int multiplicar (int numero1, int numero2) {
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
       
    }
    static double dividir (int numero1, int numero2){
        double resultado;
        resultado = numero1 / numero2;
        return resultado;//posible casting??
    }
    
    static int pedirOperacion(){
        Scanner sc = new Scanner(System.in);
        int caso;
       
        System.out.println("Selecciona la operacion: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        caso=sc.nextInt();
        //podriamos validar y repetir hasta que la respuesta sea correcta
        return caso;
    }
    
    static int pedirDato(){
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Introduce un número:");
    numero = sc.nextInt();
    return numero;
} 
            
   
    public static void main(String[] args) {
        int respuesta, numero1, numero2;
        respuesta = pedirOperacion();
        numero1 = pedirDato();
        numero2 = pedirDato();
        
        switch (respuesta) {
            case 1: System.out.println("resultado "+(sumar(numero1,numero2)));
                     break;
            case 2:  System.out.println("resultado "+(restar(numero1,numero2)));
                     break;
            case 3:  System.out.println("resultado "+(multiplicar(numero1,numero2)));
                     break;
            case 4:  System.out.println("resultado "+(dividir(numero1,numero2)));
                     break;
            
            default: System.out.println("Error");;
                     break;}
       
    
    }
    
}
