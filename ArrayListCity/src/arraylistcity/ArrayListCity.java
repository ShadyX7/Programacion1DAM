/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistcity;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ArrayListCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("Madrid");
        //el ArrayList contiene: Madrid
        ciudades.add("Paris");
        //el ArrayList contiene: Madrid, Paris
        ciudades.add("Londres");
        //el ArrayList contiene: Madrid, Paris, Londres
        ciudades.add("New York");
        //el ArrayList contiene: Madrid, Paris, LoNDRES, New York
        System.out.println("¿Cuál es el tamaño de la lista? " + ciudades.size()
        );
        System.out.println("Esta Miami en la lista? " + ciudades.contains ("Miami"));
        System.out.println("Lugar de londres en la lista: " + ciudades.indexOf("Londres"));
        System.out.println("¿La lista esta vacía? " + ciudades.isEmpty());
        
        //
        
        for (int i = 0; i<  )
        //Insertamos en la posicion 2 una ciudad
        ciudades.add(2, "Segovia");
        
        //borramos Madrid de la lista
        ciudades.remove("Madrid");
        
        //borramos la ciudad en el indice 3
        ciudades.remove(3);
        
        //imprimimos el contenido del ArrayList
        System.out.println("El contenido del array es: " + "-->" +" " + ciudades.toString() + " " + "<--"  );
         
        
        
        
    }
    
}
