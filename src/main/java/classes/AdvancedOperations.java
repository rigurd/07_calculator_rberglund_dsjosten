package classes;

import interfaces.CalculatorAdvancedOperationsInterface;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class AdvancedOperations extends BasicOperations implements CalculatorAdvancedOperationsInterface{
	/**
	 * SquareRoot - SquareRoot of one double.
	 * @param firstNumber : the first number as a double
	 * 
	 * @return: the result of the SquareRoot.
	 * */
	public double SquareRoot(double firstNumber) {
		return Math.sqrt(firstNumber);
	}
	/**
	 * Pow - Pow of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the Pow.
	 * */
	public double Pow(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}
	/**
	 * toDegrees - toDegrees of one double.
	 * @param firstNumber : the first number as a double
	 * 
	 * @return: the result of toDegrees.
	 * */
	public double toDegrees(double firstNumber) {
		return Math.toDegrees(firstNumber);
	}
	/**
	 * toRadians - toRadians of one double.
	 * @param firstNumber : the first number as a double
	 * 
	 * @return: the result of toRadians.
	 * */
	public double toRadians(double firstNumber) {
		return Math.toRadians(firstNumber);
	}
	/**
	 * Random - Generates a random number that can be use for operations in the calculator.
	 * 
	 * @return: nothing.
	 * */
	public double Random() {
		return Math.random();
	}
	/**
	 * Modula - Modula of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the Modula.
	 * */
	public double Modula(double firstNumber, double secondNumber){
		return firstNumber % secondNumber;
	}


}
