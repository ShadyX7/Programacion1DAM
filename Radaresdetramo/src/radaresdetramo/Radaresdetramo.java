/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radaresdetramo;

/**
 *
 * @author DAM1
 */
public class Radaresdetramo {
    
    static boolean velnosupera(int velindicada1, int velmax2) {
        boolean resultado;
        resultado = velindicada1 < velmax2;
        return resultado;
    }
    
    static boolean velsupera1(int velindicada1, int velmax2) {
        boolean resultado;
        resultado = velindicada1 > velmax2 - (velmax2*0.2);
        return resultado;
    }
    
    static boolean velsupera2 (int velindicada1, int velmax2) {
        boolean resultado;
        resultado = velindicada1 > velmax2 + (velmax2*0.2);
        return resultado;
    }
    
    static boolean error (int velindicada1, int velmax2) {
        boolean resultado;
        resultado = velindicada1 < 0 | velmax2 < 0;
        return resultado;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        
        
        
        
    }
    
}
