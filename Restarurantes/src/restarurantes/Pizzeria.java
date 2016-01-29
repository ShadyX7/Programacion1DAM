package restarurantes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Pizzeria extends Restarurante {

    private static int totalPizzerias;
    private ArrayList<Trabajador> trabajadoresPizzeria = new ArrayList<Trabajador>();

    public Pizzeria() {
        //lamada a super implicita!!
        totalPizzerias++;
    }

    public Pizzeria(String nombre, String propietario, String domicilio) {
        super(nombre, propietario, domicilio);
        totalPizzerias++;
    }

    public static int getTotalPizzerias() {
        return totalPizzerias;
    }

    public static void setTotalPizzerias(int totalPizzerias) {
        Pizzeria.totalPizzerias = totalPizzerias;
    }

    public ArrayList<Trabajador> getTrabajadoresPizzeria() {
        return trabajadoresPizzeria;
    }

    public void setTrabajadoresPizzeria(ArrayList<Trabajador> trabajadoresPizzeria) {
        this.trabajadoresPizzeria = trabajadoresPizzeria;
    }

    @Override
    public String mostrarInformacion() {
//llamada a super??
        return super.mostrarInformacion() + "\nEste restaurante es de comida italiana (Pizzeria)";
    }
   
   

   
}
