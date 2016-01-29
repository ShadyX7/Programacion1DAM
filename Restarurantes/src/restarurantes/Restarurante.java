package restarurantes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Restarurante {

    private String nombre;
    private String propietario;
    private String domicilio;
    protected static int numTrabajadoresTotales;

    public Restarurante() {
    }

    public Restarurante(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public static int getNumTrabajadoresTotales() {
        return numTrabajadoresTotales;
    }

    public static void setNumTrabajadoresTotales(int numTrabajadoresTotales) {
        Restarurante.numTrabajadoresTotales = numTrabajadoresTotales;
    }

    public String mostrarInformacion() {
        return "Restaurante: " + "Nombre: " + nombre + ", Propietario: " + propietario + ", Domicilio: " + domicilio ;
    }

    public void meterTrabajador(ArrayList<Trabajador> lista) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el nombre del trabajador: ");
        String nombre = entrada.next();
        //BUFFER?
        System.out.print("Introduzca la edad del trabajador: ");
        int edad = entrada.nextInt();
        System.out.print("Introduzca la dirección del trabajador: ");
        //BUFFER?
        String direccion = entrada.next();
        Trabajador trabajadorAux = new Trabajador(nombre, edad, direccion);
        lista.add(trabajadorAux);
        //incrementamos el numero de trabajadores de los restaurantes
        numTrabajadoresTotales++;
    }

    public int darAltaTrabajador(ArrayList<Trabajador> trabajadores) {
        int resultado = 1;
        if (numTrabajadoresTotales == 30) {
            resultado = -2;
        } else {
            if (trabajadores.size() <= 5) {
                meterTrabajador(trabajadores);
            } else {
                resultado = -1;
            }

        }
        return resultado;
    }
}
