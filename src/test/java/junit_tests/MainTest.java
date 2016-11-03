package junit_tests;

import org.junit.Test;
import classes.Main;
import junit.framework.TestCase;

public class MainTest extends TestCase{
	
	@Test
	public void testMain(){
		Main main = new Main();
		main.main(null);
	}
}
