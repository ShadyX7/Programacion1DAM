/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria_polimorfismo;

/**
 *
 * @author DAM1
 */
public class LoteriaCasa extends juego implements InterfazJuego {
	public LoteriaCasa()
	{
		this.limiteSeleccionado = 75;
		this.limiteCapacidad = 15;
		this.CapacidadNombre = "reintegro de (La loteria de la casa)";
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
				salida = 5000;
			else
				salida = 500;
		else if ( marcadorNumeros == 3 )
			if ( capacidad == 1 )
				salida = 50;
			else
				salida = 5;
		else if ( marcadorNumeros == 2 && capacidad == 1)
			salida = 5;
		else if ( marcadorNumeros == 1 && capacidad == 1 )
			salida = 2;
		else if ( capacidad == 1 )
			salida = 1;
		else
			salida = 0;
		return salida;
	}
}
