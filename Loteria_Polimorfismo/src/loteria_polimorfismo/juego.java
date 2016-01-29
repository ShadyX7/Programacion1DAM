
package loteria_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public abstract class juego implements InterfazJuego {

	protected int limiteSeleccionado, limiteCapacidad, multiplicador, marcadorNumeros, capacidad, salida;
	protected String CapacidadNombre, bonus;
	protected boolean usarBonus;
	
	protected List<Integer> numerosFavoritos = new ArrayList<Integer>(); 
	protected List<Integer> CapacidadNumFav = new ArrayList<Integer>(); 
	protected List<Integer> numerosGanadores = new ArrayList<Integer>();
	protected List<Integer> capacidadNumGanadores = new ArrayList<Integer>();
	
	public void play() 
	{
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("¿Quieres escoger los números de la suerte tu mismo o "
				+ "prefieres que la máquina genere automáticamente números aleatorios?"
				+ "\n1. Prefiero escogerlos yo."
				+ "\n2. Que los escoja la máquina.");
		int num = entradaDatos.nextInt();
		switch (num)
		{
		case 1:
			EscogeUsuarioNum(numerosFavoritos, 5, limiteSeleccionado );
			EscogeUsuarioNum(CapacidadNumFav, 1, limiteCapacidad );
			break;
		case 2:
		default:
			EscogeMaquinaNum(numerosFavoritos, 5, limiteSeleccionado );
			EscogeMaquinaNum(CapacidadNumFav, 1, limiteCapacidad );
		}
		
		System.out.printf("Para aumentar las probabilidades de ganar, te gustaría añadir %s por solo 1€?\n", bonus);
		System.out.println("1.Si \n2.No");
		int incrementarGanancias = entradaDatos.nextInt();
		switch ( incrementarGanancias )
		{
		case 1:
			usarBonus = true;
			break;
		case 2:
		default:
			usarBonus = false;
			break;
		}
		
		
		EscogeMaquinaNum(numerosGanadores, 5, limiteSeleccionado );
		EscogeMaquinaNum(capacidadNumGanadores, 1, limiteCapacidad );
		
		System.out.printf("Escogiste los números: %s. "
				+ "Su %s es %s.\n", ImprimeNum(numerosFavoritos ), CapacidadNombre, ImprimeNum(CapacidadNumFav) );
		
		System.out.printf("Los números ganadores son: %s "
				+ "y el %s es %s.\n", ImprimeNum(numerosGanadores ), CapacidadNombre, ImprimeNum(capacidadNumGanadores) );
		
		
		salida = 0;
		marcadorNumeros = marcadoresTipoNum(numerosFavoritos, numerosGanadores );
		capacidad = marcadoresTipoNum(CapacidadNumFav, capacidadNumGanadores );
		
                
		int ganancias = calcularGanancias() * multiplicador;

		if ( ganancias > 0 )
		{
			System.out.printf("Felicidades campeón! Has ganado!!! Número ganador: %d.\n", ganancias );
		}
		else
		{
			System.out.println("Lo sentimos!, Has perdido!!! ");
		}
		
		try
		{
			Thread.sleep( 2000 );
		}
		catch(InterruptedException E)
		{
			System.out.println("Parece que hay problemas...");
		}
		
		// Borra las listas y se inicia el menú de nuevo por si el usuario quiere volver a jugar
		numerosFavoritos.clear();
		CapacidadNumFav.clear();
	}

	protected void EscogeUsuarioNum( List<Integer> rangoElegido, int generarNumeros, int capacidadCeldas )
	{		
		Scanner input = new Scanner(System.in);
		boolean UsuarioSelecNumIncorrecto = true;
		char plural = '\0'; 
		if ( generarNumeros > 1 )
		{
			plural = 's';
		}
		do {
			if ( rangoElegido.size() == 0 )
			{
				System.out.printf("Selecciona %d numero%c entre el 1 y el %d para el boleto.\n", generarNumeros, plural, capacidadCeldas, CapacidadNombre);
			}
			else if ( UsuarioSelecNumIncorrecto )
			{
				System.out.printf("Perfecto! Porfavor selecciona otro número entre el 1 y el %d.\n", limiteSeleccionado);
			}
			int num =  input.nextInt();
			if ( num >= 1 && num <= capacidadCeldas)
			{
				if ( ! rangoElegido.contains( num ) )
				{
					rangoElegido.add( num );
					UsuarioSelecNumIncorrecto = true;
				}
				else
				{
					System.out.println("Espera! Creo que ya has seleccionado ese número.");
					UsuarioSelecNumIncorrecto = false;
				}
			}
			else
			{
				System.out.println("Espera! Ese número esta fuera del rango previsto.");
				UsuarioSelecNumIncorrecto = false;
			}
		} while (rangoElegido.size() < generarNumeros );
	}

	
	protected void EscogeMaquinaNum( List<Integer> colocarNum, int generarNumeros, int capacidadCeldas )
	{
		
		List<Integer> numeroDeNum = new ArrayList<Integer>();
		for ( int i = 1; i <= capacidadCeldas; i++ )
		{
			numeroDeNum.add( i );
		}

		// Ahora vamos a generar números aleatorios y generarlos en la lista
		do
		{
			int random = numAleatorio( 0, numeroDeNum.size()); 
			int aleatorio = numeroDeNum.remove( random );
			colocarNum.add( aleatorio );
		} while (colocarNum.size() < generarNumeros );
	}

	public String ImprimeNum( List<Integer> numeros )
	{
		String salida = "";
		for( int i = 0; i < numeros.size(); i++ )
		{
			salida += numeros.get( i );
			if ( i + 1 < numeros.size() )
			{
				salida += ", ";
				if ( i + 2 == numeros.size() )
					salida += "y ";
			}
		}
		return salida;
	}
	
	public int marcadoresTipoNum( List<Integer> lista1, List<Integer> lista2 )
	{
		int num = 0;
		for (int i = 0; i < lista1.size(); i++ )
		{
			if ( lista2.contains( lista1.get(i)))
			{
				num++;
			}
		}
		return num;
	}
	
	public int numAleatorio( int comienzo, int fin )
	{
		// si comienzo = 1 and fin = 10, el número podría ser desde
		// 1 a 10. 
		return new Random().nextInt(fin) + comienzo;
		
	}
}
