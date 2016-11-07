package junit_tests;

import org.junit.Test;
import classes.Main;
import junit.framework.TestCase;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class MainTest extends TestCase{
	
	/**
	 * Testing to run the main method
	 */
	@Test
	public void testMain(){
		Main main = new Main();
		main.main(null);
	}
}
