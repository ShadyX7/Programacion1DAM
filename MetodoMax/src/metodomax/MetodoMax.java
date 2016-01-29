/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodomax;

/**
 *
 * @author DAM1
 */
public class MetodoMax {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("El maximo de " + i + " and " + j + " is " + k);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
        
       
    }

    public static double max(double num1, double num2) {
        double result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    
}
    
    
  }