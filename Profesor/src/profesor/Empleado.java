/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

/**
 *
 * @author Victor
 */
public class Empleado extends Persona {
    
    public Empleado(){
        
        this(("2) Invocando al constructor sobrecargado de Empleado"));
        System.out.println("3) Ejecutando sentencias propias de Empleado");
    }
    public Empleado(String s){
        System.out.println(s);
    }
}
