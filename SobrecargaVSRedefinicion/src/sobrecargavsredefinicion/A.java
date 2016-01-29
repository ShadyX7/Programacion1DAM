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

public class A extends B{
    
// Este método sobrecarga el método definido en la clase B
   
    
    public void p(int i){
        System.out.println(i);
    }
    
//Este método redefine el método definido en la clase B   
    
    public void c (double j){
        System.out.println(j);
    }
}
