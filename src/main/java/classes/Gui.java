package classes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

/**
 * <h1>GUI for the calculator</h1>
 * 
 * @author
 * @version 1.0
 * @since 2016-11-02
 */
public class Gui extends JFrame implements ActionListener {

	AdvancedOperations ao = new AdvancedOperations();
	
	JFrame frmCalculator;
	private String value1 = null, value2 = null, sAnswer;
	// String value1 = "";
	// String value2 = "";

	// double number1 = 0;
	// double number2 = 0;

	private double answer = 0.0;
	boolean equalsClicked = false;
	boolean opChosen = false;
	char operation = ' ';

	/**
	 * Setting serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// Instanciating the buttons
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn0 = new JButton("0");
	private JButton btn_squirt = new JButton("Sqr");
	private JButton btn_pow = new JButton("Pow");
	private JButton btn_degrees = new JButton("Dgr");
	private JButton btn_radian = new JButton("Radian");
	private JButton btn_clear = new JButton("C");
	private JButton btn_addition = new JButton("+");
	private JButton btn_subtraction = new JButton("-");
	private JButton btn_division = new JButton("/");
	private JButton btn_multiply = new JButton("*");
	private JButton btn_random = new JButton("Random");
	private JButton btn_mod = new JButton("Mod");
	private JButton btn_equals = new JButton("=");

	// Instanciating the textfields
	private JTextField field_input1 = new JTextField();
	private JTextField field_input2 = new JTextField();
	private JTextField field_result = new JTextField();

	// Instanciating the labels
	JLabel label_equals = new JLabel("=");
	JLabel label_choosenOperation = new JLabel("");
	private final JLabel lblInput = new JLabel("Input1");
	private final JLabel lblInput_1 = new JLabel("input2");

	/**
	 * Create the application.
	 */
	public Gui() {
		createGUI();
		addComponentsToFrame();
		addActionListners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createGUI() {
		frmCalculator = new JFrame();

		frmCalculator.setTitle("Calculator By Rickard and Daniel S");
		frmCalculator.setBounds(100, 100, 470, 526);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

	}

	/**
	 * Method for adding the components to the frame
	 */
	public void addComponentsToFrame() {

		btn7.setBounds(121, 220, 58, 49);
		frmCalculator.getContentPane().add(btn7);

		btn8.setBounds(191, 220, 58, 49);
		frmCalculator.getContentPane().add(btn8);

		btn9.setBounds(261, 220, 58, 49);
		frmCalculator.getContentPane().add(btn9);

		btn4.setBounds(121, 282, 58, 49);
		frmCalculator.getContentPane().add(btn4);

		btn5.setBounds(191, 282, 58, 49);
		frmCalculator.getContentPane().add(btn5);

		btn6.setBounds(261, 282, 58, 49);
		frmCalculator.getContentPane().add(btn6);

		btn1.setBounds(121, 344, 58, 49);
		frmCalculator.getContentPane().add(btn1);

		btn2.setBounds(191, 344, 58, 49);
		frmCalculator.getContentPane().add(btn2);

		btn3.setBounds(261, 344, 58, 49);
		frmCalculator.getContentPane().add(btn3);

		btn0.setBounds(191, 406, 58, 49);
		frmCalculator.getContentPane().add(btn0);

		btn_squirt.setBounds(12, 112, 79, 49);
		frmCalculator.getContentPane().add(btn_squirt);

		btn_pow.setBounds(12, 174, 79, 49);
		frmCalculator.getContentPane().add(btn_pow);

		btn_degrees.setBounds(12, 230, 79, 49);
		frmCalculator.getContentPane().add(btn_degrees);

		btn_radian.setBounds(12, 292, 79, 49);
		frmCalculator.getContentPane().add(btn_radian);

		btn_clear.setBounds(121, 406, 58, 49);
		frmCalculator.getContentPane().add(btn_clear);

		btn_addition.setBounds(349, 279, 58, 49);
		frmCalculator.getContentPane().add(btn_addition);

		btn_subtraction.setBounds(349, 344, 58, 49);
		frmCalculator.getContentPane().add(btn_subtraction);

		btn_division.setBounds(349, 406, 58, 49);
		frmCalculator.getContentPane().add(btn_division);

		btn_multiply.setBounds(349, 217, 58, 49);
		frmCalculator.getContentPane().add(btn_multiply);

		btn_random.setBounds(12, 351, 79, 49);
		frmCalculator.getContentPane().add(btn_random);
		btn_random.setToolTipText("Generates a number between 0-1");

		btn_mod.setBounds(12, 406, 79, 49);
		frmCalculator.getContentPane().add(btn_mod);
		field_input1.setBackground(Color.WHITE);
		field_input1.setEditable(false);

		field_input1.setBounds(165, 26, 154, 40);
		frmCalculator.getContentPane().add(field_input1);
		field_input1.setColumns(10);
		field_input2.setBackground(Color.WHITE);
		field_input2.setEditable(false);

		field_input2.setColumns(10);
		field_input2.setBounds(165, 79, 154, 40);
		frmCalculator.getContentPane().add(field_input2);
		field_result.setBackground(Color.WHITE);
		field_result.setEditable(false);

		field_result.setColumns(10);
		field_result.setBounds(165, 154, 231, 40);
		frmCalculator.getContentPane().add(field_result);
		label_equals.setFont(new Font("Tahoma", Font.PLAIN, 15));

		label_equals.setBounds(135, 165, 15, 16);
		frmCalculator.getContentPane().add(label_equals);
		label_choosenOperation.setFont(new Font("Tahoma", Font.PLAIN, 20));

		label_choosenOperation.setBounds(331, 26, 58, 40);
		frmCalculator.getContentPane().add(label_choosenOperation);

		btn_equals.setBounds(261, 406, 58, 49);
		frmCalculator.getContentPane().add(btn_equals);
		lblInput.setBounds(86, 38, 56, 16);
		
		frmCalculator.getContentPane().add(lblInput);
		lblInput_1.setBounds(86, 83, 56, 16);
		
		frmCalculator.getContentPane().add(lblInput_1);
	}

	public void addActionListners() {
		// add actionlistner to the buttons
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn0.addActionListener(this);
		btn_squirt.addActionListener(this);
		btn_pow.addActionListener(this);
		btn_degrees.addActionListener(this);
		btn_radian.addActionListener(this);
		btn_clear.addActionListener(this);
		btn_addition.addActionListener(this);
		btn_subtraction.addActionListener(this);
		btn_division.addActionListener(this);
		btn_multiply.addActionListener(this);
		btn_random.addActionListener(this);
		btn_mod.addActionListener(this);
		btn_equals.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// Button 7

		if (e.getSource() == btn7) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "7";
				} else {
					value1 += "7";
				}
			} else {
				if (value2 == null) {
					value2 = "7";
				} else {
					value2 += "7";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 8
		if (e.getSource() == btn8) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "8";
				} else {
					value1 += "8";
				}
			} else {
				if (value2 == null) {
					value2 = "8";
				} else {
					value2 += "8";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 9
		if (e.getSource() == btn9) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "9";
				} else {
					value1 += "9";
				}
			} else {
				if (value2 == null) {
					value2 = "9";
				} else {
					value2 += "9";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 4
		if (e.getSource() == btn4) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "4";
				} else {
					value1 += "4";
				}
			} else {
				if (value2 == null) {
					value2 = "4";
				} else {
					value2 += "4";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 5
		if (e.getSource() == btn5) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "5";
				} else {
					value1 += "5";
				}
			} else {
				if (value2 == null) {
					value2 = "5";
				} else {
					value2 += "5";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 6
		if (e.getSource() == btn6) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "6";
				} else {
					value1 += "6";
				}
			} else {
				if (value2 == null) {
					value2 = "6";
				} else {
					value2 += "6";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 1
		if (e.getSource() == btn1) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "1";
				} else {
					value1 += "1";
				}
			} else {
				if (value2 == null) {
					value2 = "1";
				} else {
					value2 += "1";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 2
		if (e.getSource() == btn2) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "2";
				} else {
					value1 += "2";
				}
			} else {
				if (value2 == null) {
					value2 = "2";
				} else {
					value2 += "2";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 3
		if (e.getSource() == btn3) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "3";
				} else {
					value1 += "3";
				}
			} else {
				if (value2 == null) {
					value2 = "3";
				} else {
					value2 += "3";
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}
		}
		// Button 0
		if (e.getSource() == btn0) {
			if (opChosen == false) {
				if (value1 == null) {
					value1 = "0";
				} else {
					value1 += "0";
				}
			} else {
				if (value2 == null) {
					value2 = "0";
				} else {
					value2 += "0";
				}
			}

			if (equalsClicked == false) {
				if (opChosen == false) {
					field_input1.setText(value1);
				} else {
					field_input2.setText(value2);
				}
			}

		}
		// Button sqr
		if (e.getSource() == btn_squirt) {
				if (value1==null) {
					JOptionPane.showMessageDialog(frmCalculator, "Pick the nr to get sqrt of", "Info", JOptionPane.INFORMATION_MESSAGE);
				}else if (value1 != null){
					opChosen = true;
					equalsClicked = true;
					label_choosenOperation.setText("Sqrt");
					operation = 'S';
					value2 = "0";

					double number1 = 0.0;
					number1 = Double.parseDouble(value1);
					answer = ao.SquareRoot(number1);
					sAnswer = Double.toString(answer);
					field_result.setText(sAnswer);
					
				}
				else if (value1 != null && value2 != null){
					JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
				}
		}
		// Button pow
		if (e.getSource() == btn_pow) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("Pow");
				operation = 'P';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Button degrees
		if (e.getSource() == btn_degrees) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the nr to convert to degrees", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null){
				opChosen = true;
				equalsClicked = true;
				label_choosenOperation.setText("toDgr");
				operation = 'D';
				value2 = "0";
				

				double number1 = 0.0;
				number1 = Double.parseDouble(value1);
				answer = ao.toDegrees(number1);
				sAnswer = Double.toString(answer);
				field_result.setText(sAnswer);
				
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Button radian
		if (e.getSource() == btn_radian) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the nr to convert to radians", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null){
				opChosen = true;
				equalsClicked = true;
				label_choosenOperation.setText("toRdn");
				operation = 'R';
				value2 = "0";
				
				double number1 = 0.0;
				number1 = Double.parseDouble(value1);
				answer = ao.toRadians(number1);
				sAnswer = Double.toString(answer);
				field_result.setText(sAnswer);
				
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Button add
		if (e.getSource() == btn_addition) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("+");
				operation = '+';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		// Button subtract
		if (e.getSource() == btn_subtraction) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("-");
				operation = '-';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Button division
		if (e.getSource() == btn_division) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("/");
				operation = '/';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Button multiplication
		if (e.getSource() == btn_multiply) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("*");
				operation = '*';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		// Button random
		if (e.getSource() == btn_random) {
				if (value1==null) {
					double random1 = ao.Random();
					value1 = Double.toString(random1);
					field_input1.setText(value1);
				}else if (value1 != null && value2 == null && opChosen == true){
					double random2 = ao.Random();
					value2 = Double.toString(random2);
					field_input2.setText(value2);
				}else if (value1 != null && value2 == null && opChosen == false) {
					JOptionPane.showMessageDialog(frmCalculator, "Pick operation before generating the second random nr", "Error", JOptionPane.ERROR_MESSAGE);
				}else if (value1 != null && value2 != null){
					JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
				}
		}
		// Button mod
		if (e.getSource() == btn_mod) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && value2 == null){
				opChosen = true;
				label_choosenOperation.setText("%");
				operation = '%';
			}else if (value1 != null && value2 != null){
				JOptionPane.showMessageDialog(frmCalculator, "You can only do calc on 2 numbers..", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		// Button Equals
		if (e.getSource() == btn_equals) {
			if (value1==null) {
				JOptionPane.showMessageDialog(frmCalculator, "Pick the first number", "Info", JOptionPane.INFORMATION_MESSAGE);
			}else if (value1 != null && opChosen == false){
				JOptionPane.showMessageDialog(frmCalculator, "Choose operation", "Info", JOptionPane.INFORMATION_MESSAGE);

			}else if (value1 != null && value2 == null){
				JOptionPane.showMessageDialog(frmCalculator, "Pick the second number", "Info", JOptionPane.INFORMATION_MESSAGE);

			}else if (value1 != null && value2 != null){
				double number1 = 0.0;
				double number2 = 0.0;
				
				number1 = Double.parseDouble(value1);
				number2 = Double.parseDouble(value2);
				
				switch (operation) {
				case '+':
					answer = ao.Addition(number1, number2);
					break;
				case '-':
					answer = ao.Subtraction(number1, number2);
					break;
				case '*':
					answer = ao.Multiplication(number1, number2);
					break;
				case '/':
					answer = ao.Division(number1, number2);
					break;
				case '%':
					answer = ao.Modula(number1, number2);
					break;
				case 'P':
					answer = ao.Pow(number1, number2);
					break;


				default:
					break;
				}
				sAnswer = Double.toString(answer);
				field_result.setText(sAnswer);
			}
		}

		// Button clear, resetting all the variables
		if (e.getSource() == btn_clear) {
			label_choosenOperation.setText("");
			field_input1.setText("");
			field_input2.setText("");
			field_result.setText("");
			value1 = null;
			value2 = null;	
			answer = 0.0;
			equalsClicked = false;
			opChosen = false;
			operation = ' ';
			
		}

	} // Action performed
	
	public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getsAnswer() {
        return sAnswer;
    }

    public void setsAnswer(String sAnswer) {
        this.sAnswer = sAnswer;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public boolean isEqualsClicked() {
        return equalsClicked;
    }

    public void setEqualsClicked(boolean equalsClicked) {
        this.equalsClicked = equalsClicked;
    }

    public boolean isOpChosen() {
        return opChosen;
    }

    public void setOpChosen(boolean opChosen) {
        this.opChosen = opChosen;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    public JButton getBtn_squirt() {
        return btn_squirt;
    }

    public void setBtn_squirt(JButton btn_squirt) {
        this.btn_squirt = btn_squirt;
    }

    public JButton getBtn_pow() {
        return btn_pow;
    }

    public void setBtn_pow(JButton btn_pow) {
        this.btn_pow = btn_pow;
    }

    public JButton getBtn_degrees() {
        return btn_degrees;
    }

    public void setBtn_degrees(JButton btn_degrees) {
        this.btn_degrees = btn_degrees;
    }

    public JButton getBtn_radian() {
        return btn_radian;
    }

    public void setBtn_radian(JButton btn_radian) {
        this.btn_radian = btn_radian;
    }

    public JButton getBtn_clear() {
        return btn_clear;
    }

    public void setBtn_clear(JButton btn_clear) {
        this.btn_clear = btn_clear;
    }

    public JButton getBtn_addition() {
        return btn_addition;
    }

    public void setBtn_addition(JButton btn_addition) {
        this.btn_addition = btn_addition;
    }

    public JButton getBtn_subtraction() {
        return btn_subtraction;
    }

    public void setBtn_subtraction(JButton btn_subtraction) {
        this.btn_subtraction = btn_subtraction;
    }

    public JButton getBtn_division() {
        return btn_division;
    }

    public void setBtn_division(JButton btn_division) {
        this.btn_division = btn_division;
    }

    public JButton getBtn_multiply() {
        return btn_multiply;
    }

    public void setBtn_multiply(JButton btn_multiply) {
        this.btn_multiply = btn_multiply;
    }

    public JButton getBtn_random() {
        return btn_random;
    }

    public void setBtn_random(JButton btn_random) {
        this.btn_random = btn_random;
    }

    public JButton getBtn_mod() {
        return btn_mod;
    }

    public void setBtn_mod(JButton btn_mod) {
        this.btn_mod = btn_mod;
    }

    public JButton getBtn_equals() {
        return btn_equals;
    }

    public void setBtn_equals(JButton btn_equals) {
        this.btn_equals = btn_equals;
    }

    public JTextField getField_input1() {
        return field_input1;
    }

    public void setField_input1(JTextField field_input1) {
        this.field_input1 = field_input1;
    }

    public JTextField getField_input2() {
        return field_input2;
    }

    public void setField_input2(JTextField field_input2) {
        this.field_input2 = field_input2;
    }

    public JTextField getField_result() {
        return field_result;
    }

    public void setField_result(JTextField field_result) {
        this.field_result = field_result;
    }

    public JLabel getLabel_equals() {
        return label_equals;
    }

    public void setLabel_equals(JLabel label_equals) {
        this.label_equals = label_equals;
    }

    public JLabel getLabel_choosenOperation() {
        return label_choosenOperation;
    }

    public void setLabel_choosenOperation(JLabel label_choosenOperation) {
        this.label_choosenOperation = label_choosenOperation;
    }

    public JLabel getLblInput() {
        return lblInput;
    }

    public JLabel getLblInput_1() {
        return lblInput_1;
    }

} // Class
