/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recualumnos;

/**
 *
 * @author Victor
 */
public class alumnoNuevo extends alumno {
    
    public alumnoNuevo() {
    }

    public alumnoNuevo(String nombre, String apellido, int edad, String fechaNac, int numLista) {
        super(nombre, apellido, edad, fechaNac, numLista);
    }
    
    
    @Override
    public String evaluarAlumno() {
        return ""+Math.random()*10;
    }
    
    public int moisesResuelveloPorMi() {
        return 10;
    }
    
    
}
    
    

