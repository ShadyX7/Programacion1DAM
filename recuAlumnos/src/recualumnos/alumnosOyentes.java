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
public class alumnosOyentes extends alumno {

    
     public alumnosOyentes() {
    }

    public alumnosOyentes(String nombre, String apellido, int edad, String fechaNac, int numLista) {
        super(nombre, apellido, edad, fechaNac, numLista);
    }
    
    
    @Override
    public String evaluarAlumno() {
        return "CV";
    }
    
    
}

