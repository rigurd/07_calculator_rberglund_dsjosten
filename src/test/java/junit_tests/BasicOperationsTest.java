package junit_tests;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import classes.BasicOperations;
import junit.framework.TestCase;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class BasicOperationsTest extends TestCase {

	BasicOperations bo = new BasicOperations();
	DecimalFormat df = new DecimalFormat("#,####");
	Random rand1 = new Random();
	public static final Logger LOG = Logger.getLogger(BasicOperations.class.getName());
	double firstNumber = 0.0;
	double secondNumber = 0.0;
	
	
	/**
	 * Testing Addition method with positive numbers
	 */
	@Test
	public void testAddition1() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			double a = bo.Addition(firstNumber, secondNumber);
			LOG.info("Testing the method Addition with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)+(secondNumber));
			
		}
	}
	/**
	 * Testing Addition method with negative numbers
	 */
	@Test
	public void testAddition2() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			double a = bo.Addition(firstNumber, secondNumber);
			LOG.info("Testing the method Addition with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)+(secondNumber));
			
		}
	}
	/**
	 * Testing Addition method with zero
	 */
	@Test
	public void testAddition3() {
		for (int i=0; i<50; i++){
			firstNumber = rand1.nextDouble()*0;
			secondNumber = rand1.nextDouble()*0;
			double a = bo.Addition(firstNumber, secondNumber);
			LOG.info("Testing the method Addition with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)+(secondNumber));
			
		}
	}
	/**
	 * Testing Subtraction method with positive numbers
	 */
	@Test
	public void testSubtraction1() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			double a = bo.Subtraction(firstNumber, secondNumber);
			LOG.info("Testing the method Subtraction with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)-(secondNumber));
			
		}
	}
	/**
	 * Testing Subtraction method with negative numbers
	 */
	@Test
	public void testSubtraction2() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			double a = bo.Subtraction(firstNumber, secondNumber);
			LOG.info("Testing the method Subtraction with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)-(secondNumber));
			
		}
	}
	/**
	 * Testing Subtraction method with zero
	 */
	@Test
	public void testSubtraction3() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = bo.Subtraction(firstNumber, secondNumber);
			LOG.info("Testing the method Subtraction with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)-(secondNumber));
			
		}
	}
	/**
	 * Testing Multiplication method with positive numbers
	 */
	@Test
	public void testMultiplication1() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			double a = bo.Multiplication(firstNumber, secondNumber);
			LOG.info("Testing the method Multiplication with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)*(secondNumber));
			
		}
	}
	/**
	 * Testing Multiplication method with negative numbers
	 */
	@Test
	public void testMultiplication2() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			double a = bo.Multiplication(firstNumber, secondNumber);
			LOG.info("Testing the method Multiplication with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)*(secondNumber));
			
		}
	}
	/**
	 * Testing Multiplication method with zero
	 */
	@Test
	public void testMultiplication3() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = bo.Multiplication(firstNumber, secondNumber);
			LOG.info("Testing the method Multiplication with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)*(secondNumber));
			
		}
	}
	/**
	 * Testing Division method with positive numbers
	 */
	@Test
	public void testDivision1() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			double a = bo.Division(firstNumber, secondNumber);
			LOG.info("Testing the method Division with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)/(secondNumber));
			
		}
	}
	/**
	 * Testing Multiplication method with negative numbers
	 */
	@Test
	public void testDivision2() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			double a = bo.Division(firstNumber, secondNumber);
			LOG.info("Testing the method Division with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)/(secondNumber));
			
		}
	}
	/**
	 * Testing Multiplication method with zero
	 */
	@Test
	public void testDivision3() {
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = bo.Division(firstNumber, secondNumber);
			LOG.info("Testing the method Division with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (firstNumber)/(secondNumber));
		}
	}
}
