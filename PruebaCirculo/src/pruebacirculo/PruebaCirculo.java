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
public class PruebaCirculo {

    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) {
        
        //Creamos un circulo de radio 1 
        CirculoSimple circulo1 = new CirculoSimple(1);
        int n = 5;
        
        CirculoSimple.imprimeAreas(circulo1,n);
        
        System.out.println("El radio es: " + circulo1.getRadio());
        System.out.println("n vale: " +n);
        System.out.println("El area del circulo de radio " + circulo1.radio + " es " + circulo1.getArea());
        
        
        //Creamos un circulo de radio 16
        CirculoSimple circulo2 = new CirculoSimple(16);
        System.out.println("El area del circulo de radio " + circulo2.radio + " es " + circulo2.getArea());

        //Creamos un circulo de radio 38
        CirculoSimple circulo3 = new CirculoSimple(38);
        System.out.println("El area del circulo de radio " + circulo3.radio + " es " + circulo3.getArea());
        
        //Creamos un circulo de radio 42
        CirculoSimple circulo4 = new CirculoSimple(42);
        System.out.println("El area del circulo de radio " + circulo4.radio + " es " + circulo4.getArea());
        
        //Creamos un circulo de radio 10
        CirculoSimple circulo5 = new CirculoSimple(10);
        System.out.println("El perimetro del circulo de radio " + circulo5.radio + " es " + circulo5.getPerimetro());
         
        //Veámos cuantos circulos se han creado...
        System.out.println("El número de circulos creados es: " + CirculoSimple.getNumeroObjetos());
    }
    
}
