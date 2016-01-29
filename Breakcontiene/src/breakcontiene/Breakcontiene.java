/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontiene;

/**
 *
 * @author DAM1
 */
public class Breakcontiene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);

            System.out.println("Despues se escribe esto");

            
            if (i % 2 == 0) {
                continue;
            }

        }
        //Después del break se ejecuta la siguiente instrucción al for;
        System.out.println("Al salir del for");
    }

}
