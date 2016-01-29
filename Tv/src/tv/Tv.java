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
public class Tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuncionesTv sony = new FuncionesTv();
        sony.turnOn();
        sony.setChannel(30);
        sony.setVolume(3);
        System.out.println("¿La tele ha sido encendida? " + sony.on + "\n"
                + "El canal de la Tv Sony es " + sony.canal + "\n" 
                    + "El volumen de la Tv Sony es " + sony.volumen);
        
        System.out.println("");
        
        FuncionesTv samsung = new FuncionesTv();
        samsung.turnOn();
        samsung.channelUp();
        samsung.channelUp();
        samsung.volumneUp();
        System.out.println("¿ La tele ha sido encendida? " + samsung.on + "\n"
        + "En que canal esta ahora la Tele? " + samsung.canal + "\n" 
        + "En que volumen se encuentra ahora mismo la Tele? " + samsung.volumen);
  
    
        System.out.println("");
        System.out.println("Añadimos nueva tele, en la que la encendemos y el canal esta en el 15," + "\n"
                + " y el volumen en el 6 y cambiamos canal al 12 " + "\n"
                + "y volvemos a bajar la tele hasta el nivel 3; por ultimo apagamos la tele.");
        System.out.println("");
        
        FuncionesTv Lg = new FuncionesTv();
        Lg.turnOn();
        Lg.setChannel(15);
        Lg.setVolume(6);
        
        System.out.println("La tele esta apagada, ¿la quieres encender? " + Lg.on + "\n"
                            + "¿En que canal se encuentra la Tele? " + Lg.canal + "\n"
                            + "¿En que volumen se encuentra la Tele? " + Lg.volumen );
        
        Lg.channelDown();
        Lg.channelDown();
        Lg.channelDown();
        Lg.volumenDown();
        Lg.volumenDown();
        Lg.volumenDown();
        
        System.out.println("");
        System.out.println("Realizando cambios...");
        System.out.println("");
        System.out.println("¿y ahora en que canal se encuentra la Tele? " + Lg.canal + "\n"
                            + "¿y ahora en que volumen se encuentra la Tele? " + Lg.volumen);
    
        Lg.turnOff();
        
        System.out.println("");
        System.out.println("por ultimo, ¿ Como se encuentra la tele ahora? " + Lg.on);
        
    }
       
        
}
