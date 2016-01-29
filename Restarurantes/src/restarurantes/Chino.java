package restarurantes;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Chino extends Restarurante{

    private static int totalChinos;
    private ArrayList<Trabajador> trabajadoresChino = new ArrayList<Trabajador>();

    public Chino() {
        totalChinos++;
    }

    public Chino(String nombre, String propietario, String domicilio) {
        super(nombre, propietario, domicilio);
        totalChinos++;
    }

    public static int getTotalChinos() {
        return totalChinos;
    }

    public static void setTotalChinos(int totalChinos) {
        Chino.totalChinos = totalChinos;
    }

    public ArrayList<Trabajador> getTrabajadoresChino() {
        return trabajadoresChino;
    }

    public void setTrabajadoresChino(ArrayList<Trabajador> trabajadoresChino) {
        this.trabajadoresChino = trabajadoresChino;
    }

     @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nEste restaurante es de comida Oriental (China)";
    }
   

}
