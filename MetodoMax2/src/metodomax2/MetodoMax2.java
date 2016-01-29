/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodomax2;

/**
 *
 * @author DAM1
 */
public class MetodoMax2 {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int a = 4;
        int k = max(i, j, a);

        System.out.println("El maximo de " + i + " de " + j + " y de " + a + " es " + k);
    }

    public static int max(int num1, int num2, int num3) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        if (num3 > num1) {
            result = num3;
        } else {
            result = num1;
        }
        return result;

    }

    public static double max(double num1, double num2, double num3) {
        double result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        
        
        if (num3 > num1) {
            result = num3;
        } else {
            result = num1;
        }
        return result;

    }
}
