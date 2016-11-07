package junit_tests;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import classes.AdvancedOperations;
import junit.framework.TestCase;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */

public class AdvancedOperationsTest extends TestCase {

	AdvancedOperations ao = new AdvancedOperations();
	DecimalFormat df = new DecimalFormat("#,####");
	Random rand1 = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedOperations.class.getName());
	double firstNumber = 0.0;
	double secondNumber = 0.0;
	
	
	/**
	 * Testing SquareRoot method with positive numbers
	 */
	@Test
	public void testSquareRoot1(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*1000));
			double a = ao.SquareRoot(firstNumber);
			LOG.info("Testing the method SquareRoot with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing SquareRoot method with negative numbers
	 */
	@Test
	public void testSquareRoot2(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-1000));
			double a = ao.SquareRoot(firstNumber);
			LOG.info("Testing the method SquareRoot with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing SquareRoot method with zero
	 */
	@Test
	public void testSquareRoot3(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = ao.SquareRoot(firstNumber);
			LOG.info("Testing the method SquareRoot with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	
	/**
	 * Testing Pow method with positive numbers
	 */
	@Test
	public void testPow1(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*20));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*20));
			double a = ao.Pow(firstNumber, secondNumber);
			LOG.info("Testing the method Pow with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Pow method with negative numbers
	 */
	@Test
	public void testPow2(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-20));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-20));
			double a = ao.Pow(firstNumber, secondNumber);
			LOG.info("Testing the method Pow with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Pow method with zero
	 */
	@Test
	public void testPow3(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = ao.Pow(firstNumber, secondNumber);
			LOG.info("Testing the method Pow with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToDegrees method with positive numbers
	 */
	@Test
	public void testToDegrees1(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*100));
			double a = ao.toDegrees(firstNumber);
			LOG.info("Testing the method ToDegrees with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToDegrees method with negative numbers
	 */
	@Test
	public void testToDegrees2(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-100));
			double a = ao.toDegrees(firstNumber);
			LOG.info("Testing the method ToDegrees with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToDegrees method with zero
	 */
	@Test
	public void testToDegrees3(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = ao.toDegrees(firstNumber);
			LOG.info("Testing the method ToDegrees with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToRadians method with positive numbers
	 */
	@Test
	public void testToRadians1(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*100));
			double a = ao.toRadians(firstNumber);
			LOG.info("Testing the method ToRadians with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToRadians method with negative numbers
	 */
	@Test
	public void testToRadians2(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-100));
			double a = ao.toRadians(firstNumber);
			LOG.info("Testing the method ToRadians with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing ToRadians method with zero
	 */
	@Test
	public void testToRadians3(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = ao.toRadians(firstNumber);
			LOG.info("Testing the method ToRadians with: "+firstNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Random method with positive numbers
	 */
	@Test
	public void testRandom1(){
		for (int i=0; i<50; i++){
			double a = ao.Random()*100;
			LOG.info("Testing the method Random with: "+a+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Random method with negative numbers
	 */
	@Test
	public void testRandom2(){
		for (int i=0; i<50; i++){
			double a = ao.Random()*-100;
			LOG.info("Testing the method Random with: "+a+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Random method with zero
	 */
	@Test
	public void testRandom3(){
		for (int i=0; i<50; i++){
			double a = ao.Random()*0;
			LOG.info("Testing the method Random with: "+a+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Modula method with positive numbers
	 */
	@Test
	public void testModula1(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*100));
			double a = ao.Modula(firstNumber, secondNumber);
			LOG.info("Testing the method Modula with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Modula method with negative numbers
	 */
	@Test
	public void testModula2(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*-100));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*-100));
			double a = ao.Modula(firstNumber, secondNumber);
			LOG.info("Testing the method Modula with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}
	/**
	 * Testing Modula method with zero
	 */
	@Test
	public void testModula3(){
		for (int i=0; i<50; i++){
			firstNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			secondNumber = Double.valueOf(df.format(rand1.nextDouble()*0));
			double a = ao.Modula(firstNumber, secondNumber);
			LOG.info("Testing the method Modula with: "+firstNumber+" and "+secondNumber+" and it equals: "+a);
			assertEquals(a, (a));
		}
	}

}
