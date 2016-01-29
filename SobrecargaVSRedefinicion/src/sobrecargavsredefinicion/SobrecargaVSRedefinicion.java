/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargavsredefinicion;

/**
 *
 * @author Victor
 */
public class SobrecargaVSRedefinicion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        A a = new A();
        a.p(10);
        a.p(10.0);
        
        System.out.println("");
        A b = new A();
        b.c(10);
        b.c(10.0);
        
        
        
    }
    
}
