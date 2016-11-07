package interfaces;

/**
 * @author Rickard Bergund & Daniel Sjösten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public interface CalculatorAdvancedOperationsInterface {
	
	public double SquareRoot(double firstNumber);
	public double Pow(double firstNumber, double secondNumber);
	public double toDegrees(double firstNumber);
	public double toRadians(double firstNumber);
	public double Random();
	public double Modula(double firstNumber, double secondNumber);

}
