package classes;

import interfaces.CalculatorBasicOperationsInterface;

public class BasicOperations implements CalculatorBasicOperationsInterface{

	public double Addition(double firstNumber, double secondNumber) {
		return firstNumber+secondNumber;
	}

	public double Subtraction(double firstNumber, double secondNumber) {
		return firstNumber-secondNumber;
	}

	public double Multiplication(double firstNumber, double secondNumber) {
		return firstNumber*secondNumber;
	}

	public double Division(double firstNumber, double secondNumber) {
		return firstNumber/secondNumber;
	}



}
