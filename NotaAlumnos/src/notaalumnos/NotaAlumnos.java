/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaalumnos;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class NotaAlumnos {
    public static void main(String[] args) {
        //declaraciÃ³n
        double [] notasAlumnos;
        Scanner entrada = new Scanner(System.in);
        double totalNotas = 0;
        double promedioFinal = 0;
        String confirmacion = "";
        
        //Inicializacion del bucle
        notasAlumnos = new double [5];
        int contadorNotas = 0;
          
        do{
            System.out.printf("Inserte la nota del alumno %d:",contadorNotas+1);
            notasAlumnos[contadorNotas] = entrada.nextDouble();
            contadorNotas++; 
            
            //Para que salte la Ãºtlima pregunta en el alumno final.
            if( contadorNotas>= notasAlumnos.length ){
                break;
            }
            
            //Para confirmar el ingreso de notas.
            System.out.println("Â¿Desea ingresar otro DATO?(s/n)");            
            entrada.nextLine();//Esto es para borrar el buffer
            confirmacion = entrada.nextLine();
            if(confirmacion.charAt(0) == 'n' || confirmacion.charAt(0) =='N'){
            break;
            }
            
        }while(contadorNotas < notasAlumnos.length );
        
        //Suma todo el array
        for (int i = 0; i < contadorNotas; i++) {
             totalNotas = totalNotas + notasAlumnos[i];
        }
        
        //Calcula la nota final
        promedioFinal = totalNotas / contadorNotas;
        
        //Imprime el mensaje final
        System.out.printf("El promedio de todas las notas es: %+15.2f", promedioFinal);
        
        
    }// fin main
}// fin clase