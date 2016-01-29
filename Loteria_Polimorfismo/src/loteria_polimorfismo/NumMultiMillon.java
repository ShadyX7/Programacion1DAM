
package loteria_polimorfismo;

/**
 *
 * @author DAM1
 */
public class NumMultiMillon extends juego implements InterfazJuego {
	public NumMultiMillon()
	{
		this.limiteSeleccionado = 47;
		this.limiteCapacidad = 19;
		this.CapacidadNombre = "reintegro de MultiMillon";
		this.bonus = "la Bola mágica";
	}
	public int calcularGanancias()
	{
		multiplicador = usarBonus ? 3 : 1;
		if ( marcadorNumeros == 5 )
			if ( capacidad == 1)
				salida = numAleatorio(30000, 300000);
			else
				salida = 30000;
		else if ( marcadorNumeros == 4 )
			if ( capacidad == 1 )
				salida = 3000;
			else
				salida = 100;
		else if ( marcadorNumeros == 3 )
			if ( capacidad == 1 )
				salida = 50;
			else
				salida = 6;
		else if ( marcadorNumeros == 2 && capacidad == 1)
			salida = 6;
		else if ( marcadorNumeros == 1 && capacidad == 1 )
			salida = 3;
		else if ( capacidad == 1 )
			salida = 2;
		else
			salida = 0;
		return salida;
	}
}
