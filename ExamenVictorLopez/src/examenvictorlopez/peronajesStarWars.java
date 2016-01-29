/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvictorlopez;

import static examenvictorlopez.peronajesStarWars.nuevoPad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class peronajesStarWars {
    
     private String maestro;

    public peronajesStarWars(String maestro, String nombre, String especie, String planetaOrigen, String rango, int edad) {
       
        super(nombre, especie, planetaOrigen, rango, edad);
        this.maestro = maestro;
    }
    
    
    
    public static ExamenVictorLopez nuevoPad(ArrayList<ExamenVictorLopez> orden){
        Scanner leer = new Scanner(System.in);
       
        ***__
        System.out.println("nombre");
        String nombre = leer.next();
        leer.nextLine
        System.out.println("especie");
        String especie = leer.next();
        leer.nextLine();
        System.out.println("origen");
        String planetaOrigen = leer.next();
        leer.nextLine();
        System.out.println("edad");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("maestro");
        String maestro = leer.next();
        leer.nextLine();
         aux = new peronajesStarWars(maestro, nombre, especie, planetaOrigen, "Padawan", edad);
        
        return aux;
    }
}

class Caballero extends ExamenVictorLopez{
    private int nivelMidi;

    public Caballero(int nivelMidi, String nombre, String especie, String planetaOrigen, String rango, int edad) {
        super(nombre, especie, planetaOrigen, rango, edad);
        this.nivelMidi = nivelMidi;
    }
    public static ExamenVictorLopez nuevoCab(ArrayList<ExamenVictorLopez> orden){
        Scanner leer = new Scanner(System.in);
        System.out.println("nombre");
        String nombre = leer.next();
        leer.nextLine();
        System.out.println("especie");
        String especie = leer.next();
        leer.nextLine();
        System.out.println("origen");
        String planetaOrigen = leer.next();
        leer.nextLine();
        System.out.println("edad");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println(" midiccionario");
        int nivelMidi = leer.nextInt();
        leer.nextLine();
        
        return createCab(nivelMidi, nombre, especie, planetaOrigen, edad);
    }
    
    
    public static ExamenVictorLopez createCab(int nivelMidi,String nombre,String especie,String planetaOrigen,int edad){
    Caballero aux=new Caballero(nivelMidi, nombre, especie, planetaOrigen, "Caballero", edad);
    return aux;
}
}

    
    
    

