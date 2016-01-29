package restarurantes;

import java.util.ArrayList;
import java.util.Scanner;
import static restarurantes.Restarurante.numTrabajadoresTotales;

/**
 *
 * @author Victor
 */
public class Trabajador {
    private String nombre;
    private int edad;
    private String direccion;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     
    
}
