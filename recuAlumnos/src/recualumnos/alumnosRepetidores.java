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
public class alumnosRepetidores extends alumnoNuevo  {


     private int convocatorias;

    public alumnosRepetidores() {
    }

    public alumnosRepetidores(int convocatorias, String nombre, String apellido, int edad, String fechaNac, int numLista) {
        super(nombre, apellido, edad, fechaNac, numLista);
        this.convocatorias = convocatorias;
    }

    public int getConvocatorias() {
        return convocatorias;
    }

    public void setConvocatorias(int convocatorias) {
        this.convocatorias = convocatorias;
    }
    
    public String evaluarAlumno(){
        
        return ""+Math.random()*10;
    }
    
}