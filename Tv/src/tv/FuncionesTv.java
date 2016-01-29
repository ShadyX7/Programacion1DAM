/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author Victor
 */
public class FuncionesTv {
    
    int canal;
    int volumen;
    boolean on;
    

     FuncionesTv() {
    }

    FuncionesTv (int Canal, int Volumen ){
        canal = Canal;
        volumen = Volumen;
        on = true;
        
    }
    
    void turnOn (){
        on = true;       
    }
    
    void turnOff(){
        on = false;
    }
    
   void setChannel (int newChannel){
        if((on) && (newChannel >= 1 && newChannel <= 120)) canal = newChannel;
        
   }
   
   void setVolume (int newVolumeLevel){
       if((on) && (newVolumeLevel >= 1 && newVolumeLevel <=7 )) volumen = newVolumeLevel;
   }
   
   void channelUp (){
       if (on){
           if(canal == 120) canal = 1;
           else
               canal ++;
           
       }
   }
   
   void channelDown (){
       if (on){
           if (canal == 1) canal = 120;
           else
               canal --;
       }
   }
   
   void volumneUp (){
       if (on){
           if (volumen < 7 && volumen >= 0) volumen++;
           else
               System.out.println("No puedes subir mas el volumen");
       }
   }
   
   void volumenDown (){
       if (on){
           if (volumen <=7 && volumen > 0) volumen--;
           else
               System.out.println("No se puede bajar mas el volumen");
       }
   }
}
    

