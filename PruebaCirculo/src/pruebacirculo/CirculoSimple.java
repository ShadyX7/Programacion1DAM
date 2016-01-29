/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacirculo;


/**
 *
 * @author Victor
 */
public class CirculoSimple {
    
    double radio;
    static int numeroObjetos;
    
    CirculoSimple() {
         numeroObjetos++;
    }
    
    CirculoSimple (double nuevoRadio){
        radio = nuevoRadio;
        numeroObjetos++;
    }
    
    static int getNumeroObjetos(){
    return numeroObjetos;
    }
       
    double getArea() {
        return radio * radio * Math.PI;
        }
    
    double getPerimetro() {
        return 2 * radio * radio * Math.PI;
    }
    
    double getRadio(){
        return radio;
    }
    
    void setRadio (double nuevoRadio) {
        radio = nuevoRadio;
    }
    
    public static void imprimeAreas (CirculoSimple c, int veces){
        System.out.println("Radio\t\tArea");
        while(veces >=1){
            System.out.println(c.getRadio() + "\t\t" + c.getArea());
            c.setRadio(c.getRadio() + 1);
            veces--;
        }
    }
    
}
