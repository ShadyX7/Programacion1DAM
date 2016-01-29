/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enerelectrica;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class EnerElectrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        BbddCentrales inserta = new BbddCentrales();
        int opcion = -1;
        
        while (opcion != 7) {
            String nombre;
            String localizacion;
            int
            System.out.println("selecciona una de las siguientes opciones:");
            System.out.println(
                    "\n1 Insertar una central Hidro Eléctrica."
                    + "\n2  Insertar central Solar."
                    + "\n3 Insertar central Nuclear."
                    + "\n4 Insertar central Térmica."
                    + "\n5 Eliminar central."
                    + "\n6 Mostrar información de las centrales."
                    + "\n7 Salir.");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                     int res,rea,con;
                     System.out.println("Introduce nombre");
                     n=entrada.nextLine();
                     System.out.println("Introduce localizacion");
                     l=entrada.nextLine();
                     System.out.println("Introduce superficie");
                     s=entrada.nextInt();
                     System.out.println("Introduce residuos");
                     res=entrada.nextInt();
                     System.out.println("Introduce reactores");
                     rea=entrada.nextInt();
                     System.out.println("Introduce consumo");
                     con=entrada.nextInt();
                     CentralNuclear c1 = new CentralNuclear(con, res, rea, n, l, s);
                     reg.addCentral(c1);
                     break;
                case 2:
                case 3:
                case 4:
                    array.add(general(opcion));
                    break;
                case 5:
                    ProductoresBasicos.listar(array);
                    break;
                case 6:
                    int j = maxMedia(array);
                    if (j<0) {
                        System.out.println("error");
                    }else{
                        array.get(j).toString();
                    }
                    break;
                case 7:
                    System.out.println("gracias por el 10(no soy victor)");
                    break;
                default:
                    System.out.println("elije 1");
            }
            
        }
        
        
        
        
        
        
    }
    
}
