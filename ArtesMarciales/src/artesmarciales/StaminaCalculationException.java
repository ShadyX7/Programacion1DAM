/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artesmarciales;

/**
 *
 * @author Victor
 */
public class StaminaCalculationException extends Exception {
	
	public StaminaCalculationException(String problem)	// taking in the string with the error message
	{	
		super(problem);						// sending the string to the super(exception class)
	}

}