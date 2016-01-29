package consolas;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Consola {
    
    Game juegoEnUso;
    ArrayList<Game> arrayJuegos;

    public Consola() {
    juegoEnUso=null;
    arrayJuegos=null;
    }
    
    public void insertGame (Game videoGame) {
    juegoEnUso=videoGame;
       
    }
    
    public void takeOutGame() {
    juegoEnUso=null;
    }
    
    public void play() {
    if (juegoEnUso != null) {
    System.out.println("Me encuentro jugando al "+juegoEnUso.getNombre());
        } else {
    System.out.println("Introduce juego primero");
        }
    }
    
    public void definirJuegosCompatibles(ArrayList<Game> gameArray) {
    if (this.arrayJuegos==null) {
    this.arrayJuegos=gameArray;
        }
    }
    
    public int esCompatible (Game juego) {
    if (arrayJuegos==null) {
       return -2;
    } else {
    if (arrayJuegos.contains(juego)) {
       return 1;
    } else {
       return -1;
          }
       }
    }
    
}
