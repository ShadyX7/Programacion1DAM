/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radares;  
import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */


public class Radares {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int metros = 0;
        int velPerm = 0;
        int segundos = 0;
        Scanner entrada = new Scanner(System.in);
        
        
        //el do se repite mientras los valores no sean 0.
        do {
            System.out.print("Metros recorridos:");
            metros = entrada.nextInt();
            System.out.print("Velocidad maxima permitida:");
            velPerm = entrada.nextInt();
            System.out.print("Segundos empleados:");
            segundos = entrada.nextInt();
            
            if(!((metros == 0)&&(velPerm==0)&&(segundos==0))){
                System.out.println(prueba(metros, velPerm, segundos));
            }
        }while (!((metros == 0)&&(velPerm==0)&&(segundos==0)));
        
        System.out.println("Funciona");
        //fin
    }
    
    
    
    public static String prueba(int metro, int velPer, int segundo){

    //Si algún valor es menor que 0
    if( metro < 0 || velPer < 0 || segundo < 0){
        return "ERROR";
    }//
    
    //
    double misMetros = metro;
    double misSegundos = segundo;
    
    double Kilometros = misMetros / 1000;
    double Horas = misSegundos / 3600;
    double velocidadActual = Kilometros / Horas;
    
    if(velocidadActual <= velPer){         
      return "OK";     
      }else{         
        if (velocidadActual > (velPer * 1.2)) {
            return "Puntos"; 
        }else{
            return "Multa";
        }//fin if velocidad actual > velocidad permitida + 20%
    }//fin if 
   
    }//fin metodo prueba
}//Fin de clase Radares
