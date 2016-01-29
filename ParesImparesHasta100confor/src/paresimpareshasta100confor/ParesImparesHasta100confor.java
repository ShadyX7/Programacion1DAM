/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresimpareshasta100confor;

/**
 *
 * @author DAM1
 */
public class ParesImparesHasta100confor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares, impares, numero;
        pares = 0;
        impares = 0;

        for (numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                pares = pares + numero;
            } else {	//suponemos que es impar
                impares = impares + numero;
            }

        }
        System.out.println("La suma de los números pares es: " + pares);
        System.out.println("La suma de los números impares: " + impares);

    }
}
