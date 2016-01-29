package restarurantes;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Restarurantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restarurante victor = new Pizzeria("Ralph", "Victor", "Madrid, C/Falsa 7");
        Pizzeria Marshall = new Pizzeria("Marshall", "Eminem", "USA, C/Boss 6");
        Chino Chow = new Chino("Chow", "Yamamoto", "China, C/ Shin shu Lanxa 8");
        Restarurante Italiano = new Pizzeria();
        Restarurante Español = new Pizzeria();
        Restarurante Americano = new Pizzeria();
        Restarurante Frances = new Pizzeria();
        System.out.println("El número total de pizzerias es: " + Pizzeria.getTotalPizzerias());

        //Declaramos Array List
        ArrayList<Restarurante> Restaurantes = new ArrayList();
        Restaurantes.add(victor);
        Restaurantes.add(Marshall);
        Restaurantes.add(Chow);

        //Recorremos con un for el array List
        for (Restarurante miRestaurant : Restaurantes) {
            System.out.println(miRestaurant.mostrarInformacion());
        }

        //Instanciamos los 5 trabajadores con la funcion getTrabajadoresPizzeria
        Marshall.darAltaTrabajador(Marshall.getTrabajadoresPizzeria());
        Marshall.darAltaTrabajador(Marshall.getTrabajadoresPizzeria());
        Marshall.darAltaTrabajador(Marshall.getTrabajadoresPizzeria());
        Marshall.darAltaTrabajador(Marshall.getTrabajadoresPizzeria());
        Marshall.darAltaTrabajador(Marshall.getTrabajadoresPizzeria());

        if (victor instanceof Pizzeria) {
            victor.darAltaTrabajador(((Pizzeria) victor).getTrabajadoresPizzeria());
        }
        System.out.println("");
        //Vamos recorriendo con un for cada uno de los trabajadores instanciados
        for (Trabajador nuevoTrabajador : Marshall.getTrabajadoresPizzeria()) {
            System.out.println("El nuevo trabajador se llama: " + nuevoTrabajador.getNombre() + ", tiene " + nuevoTrabajador.getEdad() + " años y trabaja en " + nuevoTrabajador.getDireccion());

        }
        System.out.println("");
        System.out.println("Dado que solo se pueden añadir 5 trabajadores, un trabajador no llega a darse de alta.");
    }
}
