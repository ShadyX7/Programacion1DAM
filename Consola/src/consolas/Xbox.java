package consolas;

/**
 *
 * @author Victor
 */
public class Xbox extends Consola {

    public Xbox() {
    super();
    }
    
    
    public void play () {
    if (juegoEnUso != null) {
    System.out.println("Estoy jugando al "+juegoEnUso.getNombre()+" en la Xbox");
        } else {
    System.out.println("Introduce juego primero");
        }
    }
}
