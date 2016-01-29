/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recualumnos;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class RecuAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   ArrayList<alumno> alumnos = new ArrayList<alumno>();
        ArrayList<correccionPruebas> pruebas = new ArrayList<correccionPruebas>();
        
        alumnos.add(new alumnoNuevo("Victor", "Lopez", 20, "08/12/1994", 13));
        pruebas.add(new pruebaPractica(2, "POO", "Programacion", "Diurno", 4, 5.2));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 5.5));
        alumnos.add(new alumnosOyentes("Juan", "Bartolo", 19, "09/10/1995", 20));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 7));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 8.4));
        alumnos.add(new alumnosRepetidores(2, "Lucas", "Walker" , 26 , "03/05/1988", 21));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 5.6));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 6.3));
        alumnos.add(new alumnoNuevo("Pedro", "Aspe", 20, "11/10/1994", 18));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 5.7));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Vespertino", 4, 4.3));
        alumnos.add(new alumnoNuevo("Nacho", "Lopez", 50, "03/02/1965", 7));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 8.4));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 3.5));
        alumnos.add(new alumnoNuevo("Ariadna", "Lopez", 21, "07/09/1994", 15)); 
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 7));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 10));
        alumnos.add(new alumnoNuevo("Carmen", "Aspe", 50, "08/06/1965", 1));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 10));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 10));
        alumnos.add(new alumnoNuevo("Isabel", "Lopez", 20, "04/15/1945", 6));
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 5));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 6.7));
        alumnos.add(new alumnoNuevo("Sergio", "Pedrosa", 21, "07/10/1994", 3));       
        pruebas.add(new pruebaPractica(2, "POO", "Progamacion", "Vespertino",4 , 8.9));
        pruebas.add(new pruebaTeorica(20, "20 minutos", "Programacion", "Diurno", 4, 9.5));
        
        System.out.println("LA LISTA DE ALUMNOS ES: " + "\n" + alumnos);
        System.out.println("");
        System.out.println("LA LISTA DE PRUEBAS ES: " + "\n" + pruebas);
        
       
        //recorremos con un for el array List
        
        for (correccionPruebas evaluarPruebas : pruebas ){
            evaluarPruebas.corregirPrueba();
             }
        
       
        
        
}

}