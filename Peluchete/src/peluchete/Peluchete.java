/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluchete;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Peluchete {
public static int suma(int tarifa, int minutos){
    return tarifa * minutos;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
        String datos;
        datos = entrada.nextLine();
        //M 11:20 11:40
        String[] turismo = datos.split(" ");
       
       String [] horaLlegada = turismo[1].split(":");
        int horaLlegadita1 = Integer.parseInt(horaLlegada[0]);
        int minutosLlegadita = Integer.parseInt(horaLlegada[1]);
       String [] horaSalida = turismo[2].split(":");
        int holaSalidita = Integer.parseInt(horaSalida[0]);
        int minutosSalidita = Integer.parseInt(horaSalida[1]);
        
        int totalHoras = holaSalidita - horaLlegadita1;
        int totalHoras2 = totalHoras * 60;
        
        int totalMinutos = minutosSalidita - minutosLlegadita;
        
        int minutos = totalHoras + totalMinutos ;
        System.out.println(minutos);
        switch (turismo[0]) {
            case "M":
                    System.out.println(suma(1, minutos));
                break;
            case "T":
                    System.out.println(suma(2, minutos));
                
                break;
            case "C":
                    System.out.println(suma(3, minutos));
                
                break;
            default:
                throw new AssertionError();
        }
        
    
    }
    
}
    
    

