package classes;

import interfaces.CalculatorAdvancedOperationsInterface;

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

	public double Cos(double firstNumber) {
		return Math.cos(firstNumber);
	}


}
