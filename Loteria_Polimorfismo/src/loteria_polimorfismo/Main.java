
package loteria_polimorfismo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */


public class Main {
    
	public static void main(String[] args) {
		
		int usuario = 0;
		Scanner entradaDatos = new Scanner(System.in);
		juego Juego;  

		do
		{
			System.out.println( "¿A que juego quieres jugar?"
                                        + "\n"
					+ "\n1. Mundo Millon "
					+ "\n2. Loteria de la casa"
					+ "\n3. Numeros MultiMillon"
                                        + "\n4. Salir");
                        
			usuario = entradaDatos.nextInt();
			switch (usuario)
			{
				case 1: 
					Juego = new MundoMillon();
					Juego.play();
					break;
				case 2: 
					Juego = new LoteriaCasa();
					Juego.play();
					break;
				case 3: 
					Juego = new NumMultiMillon();
					Juego.play();
					break;
				case 4:
					break;
				default: 
					System.out.println("Porfavor escoja un número entre el 1 y el 4: ");
			}
		} while (usuario != 4);
	}
}