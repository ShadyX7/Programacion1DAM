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
public class Caballero extends Jedi{
    protected int nivelDiccionario;    
    protected Maestro miMaster;
    
    public Caballero() {
    }

    public Caballero(String nombre, String planeta, String especie, String rango, int edad
    , int nivelDiccionario) {
        super(nombre, planeta, especie, rango, edad);
        this.nivelDiccionario = nivelDiccionario; 
    }

    public Maestro getMiMaster() {
        if(rango.equals("Padawan")){
         return miMaster;
        }else {
         this.setMiMaster(null);   
         return null;
        }
        
    }

    public void setMiMaster(Maestro miMaster) {
        this.miMaster = miMaster;
    }
    
    
    public int getNivelDiccionario() {
        return nivelDiccionario;
    }

    public void setNivelDiccionario(int nivelDiccionario) {
        if(rango.equals("Padawan")){
         this.nivelDiccionario = 0;
        }else {
        this.nivelDiccionario = nivelDiccionario;
        }
    }
}

