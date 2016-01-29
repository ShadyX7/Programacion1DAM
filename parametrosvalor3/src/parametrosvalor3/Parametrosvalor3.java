/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametrosvalor3;

/**
 *
 * @author DAM1
 */
public class Parametrosvalor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int i = 0;
        while (i<=4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
                
        }
public static void method1(int i) {
    do {
        if (i %3 !=0)
            System.out.print (i + " ");
        i--;
    }
    while (i >=1);
    System.out.println();
    }
    
}
