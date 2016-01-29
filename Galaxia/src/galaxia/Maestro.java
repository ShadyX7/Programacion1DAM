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
public class Maestro extends Caballero{
    public void convertiraCaballero(Caballero miAlumno){
          if(miAlumno.miMaster == this){
            miAlumno.setRango("Caballero");
            miAlumno.setNivelDiccionario(1);
            miAlumno.setMiMaster(null);
          }
    }
    public void setRango(String rango) {
        this.rango = "Maestro";
    }
}