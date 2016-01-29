package consolas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class Datos {
    
    public static void main (String[] args) {
        Game GTA = new Game("Grand theft auto V", 60.59, new Date());
        Game GT = new Game("Gran turismo", 45.99, new Date());
        System.out.println(GTA);
        
        Consola invocacion=new Consola();
        invocacion.play();
        invocacion.insertGame(GTA);
        invocacion.play();
        
        PlayStation play=new PlayStation ();
        play.play();
        play.insertGame(GTA);
        play.play();
        
        Xbox xbox=new Xbox ();
        xbox.play();
        xbox.insertGame(GTA);
        xbox.play();
        
        System.out.println("");
        System.out.println("¿El GT es compatible con la PlaySation? "+play.esCompatible(GT));
        System.out.println("¿El GT es compatible con la Xbox? "+xbox.esCompatible(GT));
        System.out.println("");
        
        ArrayList<Game>gameCompatiblePlay=new ArrayList<Game>();
        gameCompatiblePlay.add(GTA);
        
        System.out.println("");
        System.out.println("Juegos compatibles con Play Station: "+gameCompatiblePlay);
        play.definirJuegosCompatibles(gameCompatiblePlay);
        System.out.println("");
        System.out.println("¿El GT es compatible con la PlaySation? "+play.esCompatible(GT));
        System.out.println("¿El GTA es compatible con la Xbox? "+play.esCompatible(GTA));
        
        ArrayList<Game>gameCompatibleXbox=new ArrayList<Game>();
        gameCompatibleXbox.add(GT);
        
        System.out.println("");
        System.out.println("Juegos compatibles con Xbox "+gameCompatibleXbox);
        xbox.definirJuegosCompatibles(gameCompatibleXbox);
        System.out.println("");
        System.out.println("¿El GT es compatible con la Xbox? "+xbox.esCompatible(GT));
        System.out.println("¿El GT es compatible con la Xbox? "+xbox.esCompatible(GTA));
    }
}
