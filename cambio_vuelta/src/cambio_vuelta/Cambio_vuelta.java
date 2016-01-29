/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_vuelta;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Cambio_vuelta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5productos, elegimos cual queremos (con su precio), pagamos, damos vueltas
        Scanner compra = new Scanner(System.in);
        double chocolate = 5.5;
        double leche = 2.5;
        double galletas = 1.5;
        double fruta = 7.5;
        double pan = 0.5;
        byte opcion = 0;
        double producto = 0;
        int pago = 0;
        double vuelta = 0;
        
        System.out.println("Eliga un producto:");
        System.out.println("");
        System.out.println("Chocolate → 1");
        System.out.println("Leche → 2");
        System.out.println("Galletas → 3");
        System.out.println("Fruta → 4");
        System.out.println("Pan → 5");
        System.out.println("");
        
        opcion = compra.nextByte();
        
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido chocolate, su valor es de 5,5€");
                System.out.println("");
                producto = 5.5;
                break;
            case 2:
                System.out.println("Ha elegido leche, su valor es de 2,5€");
                System.out.println("");
                producto = 2.5;
                break;
            case 3:
                System.out.println("Ha elegido galletas, su valor es de 1,5€");
                System.out.println("");
                producto = 1.5;
                break;
            case 4:
                System.out.println("Ha elegido fruta, su valor es de 7,5€"); 
                System.out.println("");
                producto = 7.5;
                break;
            case 5:
                System.out.println("Ha elegido pan, su valor es de 0,5€");
                System.out.println("");
                producto = 0.5;
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("¿Con cuanto va a pagar? (10, 20, 30...)");
        System.out.println("");
        pago = compra.nextInt();
        vuelta = pago - producto;
        System.out.println("Su cambio es de "+vuelta+"€");
    }
    
}
    
