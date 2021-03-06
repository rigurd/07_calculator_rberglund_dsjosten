package junit_tests;

import org.junit.Test;
import classes.Gui;
import junit.framework.TestCase;

/**
 * @author Rickard Bergund and Daniel Sjosten
 * @since 9/11 - 2016
 * @version 1.0
 * 
 */
public class GuiTest_d extends TestCase{

	
	Gui gui = new Gui();

	/**
	 * Testing the method AddComponentsToFrame
	 */
	@Test
	public void testAddComponentsToFrame(){
		gui.addComponentsToFrame();
	}
	
	/**
	 * Testing GuiButton7 with 2 cases
	 */
	@Test
	public void testGuiButton7(){
		
		gui.addActionListeners();
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
	
	/**
	 * Testing GuiButton8 with 2 cases
	 */
	@Test
	public void testGuiButton8(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton9 with 2 cases
	 */
	@Test
	public void testGuiButton9(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton4 with 2 cases
	 */
	@Test
	public void testGuiButton4(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton5 with 2 cases
	 */
	@Test
	public void testGuiButton5(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton6 with 2 cases
	 */
	@Test
	public void testGuiButton6(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton1 with 2 cases
	 */
	@Test
	public void testGuiButton1(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton2 with 2 cases
	 */
	@Test
	public void testGuiButton2(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton3 with 2 cases
	 */
	@Test
	public void testGuiButton3(){
		gui.addActionListeners();
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
	/**
	 * Testing GuiButton0 with 2 cases
	 */
	@Test
	public void testGuiButton0(){
		gui.addActionListeners();
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
	
	/**
	 * Testing GuiButtonSqrt with 2 cases
	 */
	@Test
	public void testGuiButtonSqrt(){
		gui.addActionListeners();
		//Case1
		gui.getBtn_squirt().doClick();
		gui.setValue1("1");
		gui.getBtn_squirt().doClick();

		//Case2
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_squirt().doClick();
	}
	
	/**
	 * Testing GuiButtonPow with 2 cases
	 */
	@Test
	public void testGuiButtonPow(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_pow().doClick();
		gui.setValue1("1");
		gui.setValue2(null);
		gui.getBtn_pow().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_pow().doClick();
	}
	/**
	 * Testing GuiButtonDegrees with 2 cases
	 */
	@Test
	public void testGuiButtonDegrees(){
		gui.addActionListeners();
		//Case1
		gui.getBtn_degrees().doClick();
		gui.setValue1("1");
		gui.getBtn_squirt().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_degrees().doClick();
	}
	/**
	 * Testing GuiButtonRadian with 2 cases
	 */
	@Test
	public void testGuiButtonRadian(){
		gui.addActionListeners();
		//Case1
		gui.getBtn_radian().doClick();
		gui.setValue1("1");
		gui.getBtn_radian().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_radian().doClick();
	}
	/**
	 * Testing GuiButtonAddition with 2 cases
	 */
	@Test
	public void testGuiButtonAddition(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_addition().doClick();
		gui.setValue1("1");
		gui.getBtn_addition().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_addition().doClick();
	}
	/**
	 * Testing GuiButtonSubtraction with 2 cases
	 */
	@Test
	public void testGuiButtonSubtraction(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_subtraction().doClick();
		gui.setValue1("1");
		gui.getBtn_subtraction().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_subtraction().doClick();
	}
	/**
	 * Testing GuiButtonDivision with 2 cases
	 */
	@Test
	public void testGuiButtonDivision(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_division().doClick();
		gui.setValue1("1");
		gui.getBtn_division().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_division().doClick();
	}
	/**
	 * Testing GuiButtonMultiply with 2 cases
	 */
	@Test
	public void testGuiButtonMultiply(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_multiply().doClick();
		gui.setValue1("1");
		gui.getBtn_multiply().doClick();

		//Case2. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_multiply().doClick();
	}
	/**
	 * Testing GuiButtonRandom with 4 cases
	 */
	@Test
	public void testGuiButtonRandom(){ 
		gui.addActionListeners();
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
	/**
	 * Testing GuiButtonMod with 3 cases
	 */
	@Test
	public void testGuiButtonMod(){ 
		gui.addActionListeners();
		//Case1
		gui.getBtn_mod().doClick();
		//Case2. 
		gui.setValue1("1");
		gui.getBtn_mod().doClick();
		//Case3. 
		gui.setValue1("1");
		gui.setValue2("2");
		gui.getBtn_mod().doClick();
	}
	/**
	 * Testing GuiButtonEquals with 4 cases
	 */
	@Test
	public void testGuiButtonEquals(){ 
		
		gui.addActionListeners();
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
		gui.getBtn_equals().doClick();
		//Case4.
		gui.setValue1("5");
		gui.setValue2("5");
		
		gui.setOperation('+');
		gui.getBtn_equals().doClick();
		
		gui.setOperation('-');
		gui.getBtn_equals().doClick();
		
		gui.setOperation('*');
		gui.getBtn_equals().doClick();
		
		gui.setOperation('/');
		gui.getBtn_equals().doClick();
		
		gui.setOperation('%');
		gui.getBtn_equals().doClick();
		
		gui.setOperation('P');
		gui.getBtn_equals().doClick();
		
		
	}
	/**
	 * Testing GuiButtonClear with 1 case
	 */
	@Test
	public void testGuiButtonClear(){ 
		gui.addActionListeners();
		//Case1
		gui.getLabel_choosenOperation().setText("asdf");
		gui.getField_input1().setText("lorum ipsum");
		gui.getBtn_clear().doClick();
		assertEquals("Should be empty", "", gui.getLabel_choosenOperation().getText());
		assertEquals("Should be empty", "", gui.getField_input1().getText());
		

	}


	
	/**
	 * Testing all getters and setters
	 */
	@Test
	public void testSetters(){
		
		gui.setBtn1(null);
		gui.getBtn1();
		gui.setBtn2(null);
		gui.getBtn2();
		gui.setBtn3(null);
		gui.getBtn3();
		gui.setBtn4(null);
		gui.getBtn4();
		gui.setBtn5(null);
		gui.getBtn5();
		gui.setBtn6(null);
		gui.getBtn6();
		gui.setBtn7(null);
		gui.getBtn7();
		gui.setBtn8(null);
		gui.getBtn8();
		gui.setBtn9(null);
		gui.getBtn9();
		gui.setBtn0(null);
		gui.getBtn0();
		gui.setBtn_addition(null);
		gui.getBtn_addition();
		gui.setBtn_subtraction(null);
		gui.getBtn_subtraction();
		gui.setBtn_division(null);
		gui.getBtn_division();
		gui.setBtn_multiply(null);
		gui.getBtn_multiply();
		gui.setBtn_squirt(null);
		gui.getBtn_squirt();
		gui.setBtn_degrees(null);
		gui.getBtn_degrees();
		gui.setBtn_radian(null);
		gui.getBtn_radian();
		gui.setBtn_random(null);
		gui.getBtn_random();
		gui.setBtn_pow(null);
		gui.getBtn_pow();
		gui.setBtn_mod(null);
		gui.getBtn_mod();
		gui.setBtn_equals(null);
		gui.getBtn_equals();
		gui.setBtn_clear(null);
		gui.getBtn_clear();
		gui.setAnswer(10.0);
		gui.getAnswer();
		gui.setsAnswer("Hej");
		gui.getsAnswer();
		gui.isEqualsClicked();
		gui.isOpChosen();
		gui.setOpChosen(true);
		gui.setOperation('+');
		gui.getOperation();
		gui.setEqualsClicked(true);
		gui.setField_input1(null);
		gui.getField_input1();
		gui.setField_input2(null);
		gui.getField_input2();
		gui.setField_result(null);
		gui.getField_result();
		gui.setLabel_choosenOperation(null);
		gui.getLabel_choosenOperation();
		gui.setLabel_equals(null);
		gui.getLabel_equals();
		gui.setValue1("Hej");
		gui.getValue1();
		gui.setValue2("Hej");
		gui.getValue2();
		
		
	}

}
