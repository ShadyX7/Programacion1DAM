/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enlazadodemetodos;

/**
 *
 * @author Victor
 */
public class EnlazadoDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        metodo(new EstudianteGraduado());
        metodo(new Estudiante());
        metodo(new Persona());
        metodo (new Object());
        
    }
    
    public static void metodo (Object o){
        System.out.println(o.toString());
    }
    
}
