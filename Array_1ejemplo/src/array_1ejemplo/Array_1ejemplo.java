/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_1ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Array_1ejemplo {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
 
        //Esto es opcional
        final int TAMANIO=10;
 
        int num[]=new int[TAMANIO];
 
        //Invocamos las funciones
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}