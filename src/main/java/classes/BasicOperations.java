package classes;

import javax.swing.JOptionPane;

import interfaces.CalculatorBasicOperationsInterface;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class BasicOperations implements CalculatorBasicOperationsInterface{
	/**
	 * Addition- Addition of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the addition.
	 * */
	public double Addition(double firstNumber, double secondNumber) {
		return (firstNumber)+(secondNumber);
	}
	/**
	 * Subtraction - Subtraction of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 * */
	public double Subtraction(double firstNumber, double secondNumber) {
		return (firstNumber)-(secondNumber);
	}
	/**
	 * Multiplication - Multiplication of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 * */
	public double Multiplication(double firstNumber, double secondNumber) {
		return (firstNumber)*(secondNumber);
	}
	/**
	 * Division- Division of two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the division.
	 * */
	public double Division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;	
		
		if (Double.isInfinite(result)) {
			JOptionPane.showMessageDialog(null, "Error, division by zero!", "Error", JOptionPane.ERROR_MESSAGE);
			return -0.12313432;
		}else{
		return firstNumber / secondNumber;
		}
	}



}
