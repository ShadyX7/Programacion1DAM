/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxia;

/**
 *
 * @author Victor
 */
public class Galaxia {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        GranSistema LaListaDeCaballeros = new GranSistema();
        LaListaDeCaballeros.agregarCaballero();
        LaListaDeCaballeros.borrarCaballero("Juan");
        LaListaDeCaballeros.agregarMaestro();
        LaListaDeCaballeros.imprimeMaestros();
        
    }
    
}