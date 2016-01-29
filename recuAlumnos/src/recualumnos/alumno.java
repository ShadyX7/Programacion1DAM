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
public abstract class alumno {
    


 private String nombre;
    private String apellido;
    private int edad;
    private String fechaNac;
    private int numLista;

    public alumno() {
    }

    public alumno(String nombre, String apellido, int edad, String fechaNac, int numLista) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.numLista = numLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNumLista() {
        return numLista;
    }

    public void setNumLista(int numLista) {
        this.numLista = numLista;
    }
    
    public abstract String evaluarAlumno();

    @Override
    public String toString() {
        return "\nAlumno: " + "nombre: " + nombre + ", apellido: " + apellido +  "\nedad: " + edad + "\nfechaNac: " + fechaNac + "\nnumLista: " + numLista;
    }
    
    
}
