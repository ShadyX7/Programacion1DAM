/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytrestres;

/**
 *
 * @author Usuario
 */
public class ArrayTresTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayPrimero = {1, 2, 3, 4, 5, 6};
        int[] arraySegundo = {20, 19, 18, 17, 16, 15};
        int[] arrayTotal = new int[12];
        int contador = 0;

        for (int i = 0; i < arrayTotal.length; i += 6) {
            for (int j = 0; j < 3; j++) {

                arrayTotal[i + j] = arrayPrimero[contador + j];
                arrayTotal[(i + j) + 3] = arraySegundo[contador + j];
                
            }
            contador+=3;
        }
        for (int i = 0; i < arrayTotal.length; i++) {
            System.out.println(arrayTotal[i]);
        }
    }

}
