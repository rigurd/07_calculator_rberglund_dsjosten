package classes;

import interfaces.CalculatorBasicOperationsInterface;

/**
 * @author Rickard Bergund & Daniel Sjösten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class BasicOperations implements CalculatorBasicOperationsInterface{

	public double Addition(double firstNumber, double secondNumber) {
		return (firstNumber)+(secondNumber);
	}

	public double Subtraction(double firstNumber, double secondNumber) {
		return (firstNumber)-(secondNumber);
	}

	public double Multiplication(double firstNumber, double secondNumber) {
		return (firstNumber)*(secondNumber);
	}

	public double Division(double firstNumber, double secondNumber) {
		return (firstNumber)/(secondNumber);
	}



}
