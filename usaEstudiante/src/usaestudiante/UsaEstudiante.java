/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaestudiante;

/**
 *
 * @author Victor
 */
public class UsaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante victor = new Estudiante();
        
        System.out.println("El nombre del estudiante es " + victor.nombre);
        System.out.println("La edad del estudiante es " + victor.edad);
        System.out.println("El sexo del estudiante es " + victor.sexo);
        System.out.println("El estudiante, esta becado? " + victor.esBecado);
        
        
        
        
    }
    
}
