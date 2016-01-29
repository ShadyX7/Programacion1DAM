/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class GranSistema {
    ArrayList<Jedi> LaLista = new ArrayList();

    public ArrayList<Jedi> getLaLista() {
        return LaLista;
    }

    public void setLaLista(ArrayList<Jedi> LaLista) {
        this.LaLista = LaLista;
    }

    public void agregarCaballero(){
        Caballero EsteCaballero = new Caballero();
        pedirDatos(EsteCaballero);
     LaLista.add(EsteCaballero);
    }
    
    public void agregarMaestro(){
     Maestro EsteCaballero = new Maestro();
        pedirDatos(EsteCaballero);
     LaLista.add(EsteCaballero);
    }
    /**
     * return 1 si lo borra y 0 si no lo encuentra
     */
    public int borrarCaballero(String nombre){
        for(Jedi caballero : LaLista){
            if(caballero.equals(nombre)){
              LaLista.remove(caballero);
              return 1;
            }
        }
        return 0;
    }
    
    public void convertirACaballero(Maestro miMaster, String miAlumno){
        Caballero elAlumno = null;
        for(Jedi caballero : LaLista){
            if((caballero instanceof Caballero)&&(miAlumno.equals(caballero.getNombre())))
                elAlumno = (Caballero)caballero;
        }
        if(elAlumno != null)
            miMaster.convertiraCaballero(elAlumno);
    }
    
    public void imprimeMaestros(){
          for(Jedi master : LaLista){
            if(master instanceof Maestro)
                  System.out.printf("%s es un maestro.", master.getNombre());
        }
    
    }
    
    private void pedirDatos(Jedi miCaballero){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        miCaballero.setNombre(sc.nextLine());
        System.out.print("Ingrese planeta:");
        miCaballero.setPlaneta(sc.nextLine());
        
        System.out.print("Ingrese Edad:");
        miCaballero.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Ingrese Especie:");
        miCaballero.setEspecie(sc.nextLine());
        if(miCaballero instanceof Caballero){
            System.out.print("Ingrese Rango:");
            miCaballero.setRango(sc.nextLine());
        }
    }
}
