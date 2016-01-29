package consolas;

/**
 *
 * @author Victor
 */
public class PlayStation extends Consola {

    public PlayStation() {
    super();
    arrayJuegos=null;
    }
    
   
    public void play () {
    if (juegoEnUso != null) {
    System.out.println("");    
    System.out.println("Estoy jugando al "+juegoEnUso.getNombre()+" en la PlayStation");
        } else {
    System.out.println("Introduce juego primero");
        }
    }
}
