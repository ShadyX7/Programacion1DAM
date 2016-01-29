/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantes;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class DatosCantantes {
    
    private ArrayList<Artistas> NewArray;
    
    public DatosCantantes(){
        NewArray = new ArrayList<>();
    }
    
    
    
    
    public boolean addCantante (Artistas art){
        
        return NewArray.add(art);
    }
    
    
    
    public boolean borrarCantante (String nombre){
        
        for (int i = 0; i < NewArray.size(); i++) {
            if (NewArray.get(i).equals(nombre)) {
                NewArray.remove(i);
                
            }
            
        }
        return false;
        
      }
    
    public void mostrarDatos(){
        for (Artistas art : NewArray) {
            art.mostrarDatos();
        }
    }
    
}

