/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelta_cambio2;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Vuelta_cambio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double leche = 15.20;
        double cleche = 0;
        double wisky = 21.20;
        double cwisky = 0;
        double galletas = 10;
        double cgalletas = 0;
        double cereales = 5;
        double ccereales = 0;
        int opc = 10;
        double unids;
        double totalcosto;
        double vuelta = 0;
        double pago = 0;
        
        
         while (opc != 0) {
        System.out.println("Que producto desea elegir: ");
        System.out.println("1.- Leche");
        System.out.println("2.- Wisky");
        System.out.println("3.- Galletas");
        System.out.println("4.- Cereales");
        System.out.println("5.- Pagar");
        System.out.println("0.- No comprar nada");
        opc = entrada.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Cuantas unidades desea comprar");
                unids = entrada.nextInt();
                cleche = leche * unids;
                break;
                
                case 2:
                    System.out.println("Cuantas unidades desea comprar");
                unids = entrada.nextInt();
                cwisky = wisky * unids;
                
                break;
                 case 3:
                     System.out.println("Cuantas unidades desea comprar");
                unids = entrada.nextInt();
                
                cgalletas = galletas * unids;
                
                
                break;
                 case 4:
                System.out.println("Cuantas unidades desea comprar");
                unids = entrada.nextInt();
                ccereales = cereales * unids;
                break;
                    
                    case 5:
                
                totalcosto = ccereales + cgalletas + cwisky + cleche;
                        System.out.println("La factura asciende a " + totalcosto);    
                        System.out.println("Cual es el importe con el que pagara");
                        pago = entrada.nextDouble();
                        vuelta = pago - totalcosto;
                        System.out.println("Su vuelta es " + vuelta);
                        opc = 0;
              
                break;
                        
                          case 0:
                              
                               break;
                
                
                
                
                
            default:
                throw new AssertionError();
        }
        
       
            
        }
       
    }
    
}

    
