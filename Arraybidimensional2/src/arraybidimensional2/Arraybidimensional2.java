/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybidimensional2;

/**
 *
 * @author DAM1
 */
public class Arraybidimensional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String[][] matrizCosas = null;
        matrizCosas[0] = new String[3];
        matrizCosas[1] = new String[3];
        matrizCosas[2] = new String[3];
        
        matrizCosas[0][0] = "Victor";
        matrizCosas[1][1] = "guapo";
        matrizCosas[2][2] = "majete";
        
        matrizCosas[1][0] = "Elisabeth";
        matrizCosas[1][1] = "ama de casa";
        matrizCosas[1][2] = "trabajadora";
        
        matrizCosas[2][0] = "Nacho";
        matrizCosas[2][1] = "primo";
        matrizCosas[2][2] = "tonto";
        
       //El primer for recorre las filas del array
        for (int i = 0; i < matrizCosas.length;i++) {
            System.out.println("Estamos en la fila " +i);
            //recorremos las columnas con j
            for (int j = 0 ; j < matrizCosas[i].length; j++0) {
            System.out.print("El dato de la posicion " +i+ " " +j+ "es: ");
            System.out.println(matrizCosas[i][j] + "");
        }
            System.out.print("\n");
            
        }
    }
    
}

    
    

