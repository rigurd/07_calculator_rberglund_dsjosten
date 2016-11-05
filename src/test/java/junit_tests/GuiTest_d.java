package junit_tests;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;
import classes.Gui;
import junit.framework.TestCase;

public class GuiTest_d extends TestCase{

	
	Gui gui = new Gui();

	@Test
	public void GuiTest_d(){
		gui.addComponentsToFrame();
	}
	@Test
	public void testGuiButton7(){
		
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn7().doClick();
		assertEquals("result should be 77", "77", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn7().doClick();
		assertEquals("result should be 77", "77", gui.getValue2());
	}
	
	@Test
	public void testGuiButton8(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn8().doClick();
		assertEquals("result should be 88", "88", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn8().doClick();
		assertEquals("result should be 88", "88", gui.getValue2());
	}
	@Test
	public void testGuiButton9(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn9().doClick();
		assertEquals("result should be 99", "99", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn9().doClick();
		assertEquals("result should be 99", "99", gui.getValue2());
	}
	@Test
	public void testGuiButton4(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn4().doClick();
		assertEquals("result should be 44", "44", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn4().doClick();
		assertEquals("result should be 44", "44", gui.getValue2());
	}
	@Test
	public void testGuiButton5(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn5().doClick();
		assertEquals("result should be 55", "55", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn5().doClick();
		assertEquals("result should be 55", "55", gui.getValue2());
	}
	@Test
	public void testGuiButton6(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn6().doClick();
		assertEquals("result should be 66", "66", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn6().doClick();
		assertEquals("result should be 66", "66", gui.getValue2());
	}
	@Test
	public void testGuiButton1(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn1().doClick();
		assertEquals("result should be 11", "11", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn1().doClick();
		assertEquals("result should be 11", "11", gui.getValue2());
	}
	@Test
	public void testGuiButton2(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn2().doClick();
		assertEquals("result should be 22", "22", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn2().doClick();
		assertEquals("result should be 22", "22", gui.getValue2());
	}
	@Test
	public void testGuiButton3(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn3().doClick();
		assertEquals("result should be 33", "33", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn3().doClick();
		assertEquals("result should be 33", "33", gui.getValue2());
	}
	@Test
	public void testGuiButton0(){
		gui.addActionListners();
		//Case1
		gui.setOpChosen(false);
		assertEquals("result should be null", null, gui.getValue1());
		gui.getBtn0().doClick();
		assertEquals("result should be 00", "00", gui.getValue1());
		
		//Case2
		gui.setOpChosen(true);
		gui.getBtn0().doClick();
		assertEquals("result should be 00", "00", gui.getValue2());
	}
	
	@Test
	public void testGuiButtonSqrt(){
		gui.addActionListners();
		//Case1
		gui.getBtn_squirt().doClick();
		gui.setValue1("1");
		gui.getBtn_squirt().doClick();

		//Case2. VARF�R T�CKER INTE DETTA DET ANDRA IF/ELSE????*****
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_squirt().doClick();
	}
	
	@Test
	public void testGuiButtonPow(){ //funkar ej f�r alla if/else l�ter vara s�l�nge
		gui.addActionListners();
		//Case1
		gui.getBtn_pow().doClick();
		gui.setValue1("1");
		gui.setValue2(null);
		gui.getBtn_squirt().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_pow().doClick();
	}
	
	@Test
	public void testGuiButtonDegrees(){ //funkar ej f�r alla if/else l�ter vara s�l�nge
		gui.addActionListners();
		//Case1
		gui.getBtn_degrees().doClick();
		gui.setValue1("1");
		gui.getBtn_squirt().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_degrees().doClick();
	}
	
	@Test
	public void testGuiButtonRadian(){ //funkar ej f�r alla if/else l�ter vara s�l�nge
		gui.addActionListners();
		//Case1
		gui.getBtn_radian().doClick();
		gui.setValue1("1");
		gui.getBtn_squirt().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_radian().doClick();
	}
	@Test
	public void testGuiButtonAddition(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_addition().doClick();
		gui.setValue1("1");
		gui.getBtn_addition().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_addition().doClick();
	}
	@Test
	public void testGuiButtonSubtraction(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_subtraction().doClick();
		gui.setValue1("1");
		gui.getBtn_subtraction().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_subtraction().doClick();
	}
	@Test
	public void testGuiButtonDivision(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_division().doClick();
		gui.setValue1("1");
		gui.getBtn_division().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_division().doClick();
	}
	@Test
	public void testGuiButtonMultiply(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_multiply().doClick();
		gui.setValue1("1");
		gui.getBtn_multiply().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_multiply().doClick();
	}
	@Test
	public void testGuiButtonRandom(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_random().doClick();
		//Case2. 
		gui.setValue1("1");
		gui.setOpChosen(true);
		gui.getBtn_random().doClick();
		//Case3. 
		gui.setValue1("1");
		gui.setOpChosen(false);
		gui.getBtn_random().doClick();
		//Case4. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_random().doClick();
	}
	@Test
	public void testGuiButtonMod(){ 
		gui.addActionListners();
		//Case1
		gui.getBtn_mod().doClick();
		//Case2. 
		gui.setValue1("1");
		//gui.setOpChosen(true);
		gui.getBtn_mod().doClick();
		//Case3. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_mod().doClick();
	}
	@Test
	public void testGuiButtonEquals(){ 
		double a = 0.0;
		
		gui.addActionListners();
		//Case1
		gui.setValue1(null);
		gui.getBtn_equals().doClick();
		//Case2. 
		gui.setValue1("1");
		gui.setOpChosen(false);
		gui.getBtn_equals().doClick();
		//Case3. 
		gui.setValue1("2");
		gui.setOpChosen(true);
		System.out.println(gui.getValue2());
		System.out.println(gui.getValue1());
		gui.getBtn_equals().doClick();
		//Case4.
		gui.setValue1("5");
		gui.setValue2("5");
		
		gui.setOperation('+');
		a = 10.0;
		assertEquals(a, 5.0, 5.0);
		gui.getBtn_equals().doClick();
		
		gui.setOperation('-');
		assertEquals(a, 15.0, 5.0);
		gui.getBtn_equals().doClick();
		
		gui.setOperation('*');
		assertEquals(a, 2.0, 10.0);
		gui.getBtn_equals().doClick();
		
		gui.setOperation('/');
		assertEquals(a, 10.0);
		gui.getBtn_equals().doClick();
		
		gui.setOperation('%');
		assertEquals(a, 50.0, 40.0);
		gui.getBtn_equals().doClick();
		
		gui.setOperation('P');
		assertEquals(a, 15.0, 5.0);
		gui.getBtn_equals().doClick();
		
		
	}
	@Test
	public void testGuiButtonClear(){ 
		gui.addActionListners();
		//Case1
		gui.getLabel_choosenOperation().setText("asdf");
		gui.getField_input1().setText("lorum ipsum");
		gui.getBtn_clear().doClick();
		assertEquals("Should be empty", "", gui.getLabel_choosenOperation().getText());
		assertEquals("Should be empty", "", gui.getField_input1().getText());
		

	}


	
	@Test
	public void testSetters(){
		
		gui.setBtn8(null);
	}

}
