package junit_tests;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;
import classes.Gui;
import junit.framework.TestCase;

public class GuiTest extends TestCase{

	private static final ActionEvent ActionEvent = null;
	Gui gui = new Gui();
	
	@Test
	public void testGui(){
		gui.addComponentsToFrame();
		
	}

}
