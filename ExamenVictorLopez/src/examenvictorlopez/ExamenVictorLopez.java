/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvictorlopez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class ExamenVictorLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<peronajesStarWars> orden = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int n =-1;
        while (n != 5) {
            System.out.println(
"Selecciona la opcion:\n"
        
+ "1-. añadir un Miembro \n"
        
+ "2-. eliminar un Miembro \n"
        
+ "3-. convertir un Padawan \n"
        
+ "4-. mostrar a lo Miembros \n"
        
+ "5-. salir");
            n = entrada.nextInt();
            switch (n) {
                case 1:
                    ExamenVictorLopez.nuevoCab(orden);
                    break;
                case 2:
                    ExamenVictorLopez.borrarMiembro(orden);
                    break;
                case 3:
                    ExamenVictorLopez.ascenderPad(orden);
                    break;
                case 4:
                    ExamenVictorLopez.mostrarNombres(orden);
                    break;
                case 5:
                    System.out.println("Gracias por el 10");
                    break;
                default:
                    System.out.println("selecciona una de las anteriores");
            }
        }
    }

        
        
        
        
    }
    

