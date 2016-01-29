
package loteria_polimorfismo;

/**
 *
 * @author DAM1
 */
public class MundoMillon extends juego implements InterfazJuego {

	public MundoMillon()
	{
		this.limiteSeleccionado = 59;
		this.limiteCapacidad = 35;
		this.CapacidadNombre = "reintegro de Mundo Millon";
		this.bonus = "la Bola mágica";
	}

	public int calcularGanancias()
	{
		multiplicador = usarBonus ? 2 : 1;
		if ( marcadorNumeros == 5 )
			if ( capacidad == 1)
				salida = numAleatorio(1000000, 10000000);
			else
				salida = 1000000;
		else if ( marcadorNumeros == 4 )
			if ( capacidad == 1 )
				salida = 10000;
			else
				salida = 100;
		else if ( marcadorNumeros == 3 )
			if ( capacidad == 1 )
				salida = 100;
			else
				salida = 7;
		else if ( marcadorNumeros == 2 && capacidad == 1)
			salida = 7;
		else if ( capacidad == 1 )
			salida = 4;
		else
			salida = 0;

		return salida;
	}
}