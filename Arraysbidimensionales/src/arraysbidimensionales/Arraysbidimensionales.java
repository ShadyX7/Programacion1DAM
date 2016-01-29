/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

/**
 *
 * @author DAM1
 */
public class Arraysbidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] matrizNumeros = new String[3][];
        matrizNumeros[0] = new String[3];
        matrizNumeros[1] = new String[3];
        matrizNumeros[2] = new String[3];
        
        matrizNumeros[0][0] = "Victor";
        matrizNumeros[1][1] = "Hombre";
        matrizNumeros[2][2] = "Medio";
        
        matrizNumeros[1][0] = "Elisabeth";
        matrizNumeros[1][1] = "Mujer";
        matrizNumeros[1][2] = "Bajita";
        
        matrizNumeros[2][0] = "Nacho";
        matrizNumeros[2][1] = "Hombre";
        matrizNumeros[2][2] = "Alto";
        
       //recorremos las filas con i
        for (int i = 0;i < 3; i++) {
            System.out.println("Estamos en la fila " +i);
            //recorremos las columnas con j
            for (int j = 0;j < 3; j++) {
                System.out.println("Estamos en la columna " +j);
                System.out.print("El dato de la posicion "+i+" "+j+" es: ");
                System.out.println(matrizNumeros [i][j]);
                
            }
        }
    }
    
}
