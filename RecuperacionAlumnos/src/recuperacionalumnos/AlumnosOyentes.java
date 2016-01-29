
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor
 */
public class AlumnosOyentes extends CorreccionPruebas{

    private ArrayList<AlumnosOyentes> AlumnosOyentes;
    private String nombre, fechaNac;
    private int edad, numLista, notaAnoPasado;

    public AlumnosOyentes(String nombre, String fechaNac, int edad, int numLista, int notaAnoPasado) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.numLista = numLista;
        this.notaAnoPasado = notaAnoPasado;
    }

    public AlumnosOyentes() {

        AlumnosOyentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNotaAnoPasado() {
        return notaAnoPasado;
    }

    public void setNotaAnoPasado(int notaAnoPasado) {
        this.notaAnoPasado = notaAnoPasado;
    }

    public void mostrarInformacion() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Alumno: " + getNombre() + "\n Edad:  " + getEdad() + "\n supeficie:  " + getFechaNac() + "\n Numero de lista: " + getNumLista() + "\n Nota obtenida el año pasado: " + getNotaAnoPasado());

        for (AlumnosOyentes b : AlumnosOyentes) {

            b.mostrarInformacion();
        }
    }
}
