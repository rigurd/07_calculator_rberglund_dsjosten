package classes;

import interfaces.CalculatorAdvancedOperationsInterface;

/**
 * @author Rickard Bergund & Daniel Sjösten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class AdvancedOperations extends BasicOperations implements CalculatorAdvancedOperationsInterface{

	public double SquareRoot(double firstNumber) {
		return Math.sqrt(firstNumber);
	}

	public double Pow(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}

	public double toDegrees(double firstNumber) {
		return Math.toDegrees(firstNumber);
	}

	public double toRadians(double firstNumber) {
		return Math.toRadians(firstNumber);
	}

	public double Random() {
		return Math.random();
	}

	public double Modula(double firstNumber, double secondNumber){
		return firstNumber % secondNumber;
	}


}
