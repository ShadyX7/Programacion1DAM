/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diezelementos;

/**
 *
 * @author DAM1
 */
public class DiezElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] arrayUno = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] arrayDos = new char[10];
        for (int i = (arrayUno.length - 1); i >= 0; i--) {

            arrayDos[(arrayUno.length - 1) - i] = arrayUno[i];

        }
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(arrayUno[i] + "" + arrayDos[i]);

        }

    }

}
