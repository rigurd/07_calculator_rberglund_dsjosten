package classes;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * <h1>GUI for the calculator</h1>
 * 
 * @author
 * @version 1.0
 * @since 2016-11-02
 */
public class Gui extends JFrame implements ActionListener {

	AdvancedOperations ao = new AdvancedOperations();
	
	private JFrame frmCalculator;
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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				Gui window = new Gui();
				window.frmCalculator.setVisible(true);

			}
		});
	}

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

		btn7.setBounds(121, 112, 58, 49);
		frmCalculator.getContentPane().add(btn7);

		btn8.setBounds(191, 112, 58, 49);
		frmCalculator.getContentPane().add(btn8);

		btn9.setBounds(261, 112, 58, 49);
		frmCalculator.getContentPane().add(btn9);

		btn4.setBounds(121, 174, 58, 49);
		frmCalculator.getContentPane().add(btn4);

		btn5.setBounds(191, 174, 58, 49);
		frmCalculator.getContentPane().add(btn5);

		btn6.setBounds(261, 174, 58, 49);
		frmCalculator.getContentPane().add(btn6);

		btn1.setBounds(121, 230, 58, 49);
		frmCalculator.getContentPane().add(btn1);

		btn2.setBounds(191, 230, 58, 49);
		frmCalculator.getContentPane().add(btn2);

		btn3.setBounds(261, 230, 58, 49);
		frmCalculator.getContentPane().add(btn3);

		btn0.setBounds(191, 292, 58, 49);
		frmCalculator.getContentPane().add(btn0);

		btn_squirt.setBounds(12, 112, 79, 49);
		frmCalculator.getContentPane().add(btn_squirt);

		btn_pow.setBounds(12, 174, 79, 49);
		frmCalculator.getContentPane().add(btn_pow);

		btn_degrees.setBounds(12, 230, 79, 49);
		frmCalculator.getContentPane().add(btn_degrees);

		btn_radian.setBounds(12, 292, 79, 49);
		frmCalculator.getContentPane().add(btn_radian);

		btn_clear.setBounds(121, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_clear);

		btn_addition.setBounds(349, 174, 58, 49);
		frmCalculator.getContentPane().add(btn_addition);

		btn_subtraction.setBounds(349, 230, 58, 49);
		frmCalculator.getContentPane().add(btn_subtraction);

		btn_division.setBounds(349, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_division);

		btn_multiply.setBounds(349, 112, 58, 49);
		frmCalculator.getContentPane().add(btn_multiply);

		btn_random.setBounds(12, 351, 79, 49);
		frmCalculator.getContentPane().add(btn_random);
		btn_random.setToolTipText("Generates a number between 0-1");

		btn_mod.setBounds(12, 406, 79, 49);
		frmCalculator.getContentPane().add(btn_mod);
		field_input1.setBackground(Color.WHITE);
		field_input1.setEditable(false);

		field_input1.setBounds(12, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input1);
		field_input1.setColumns(10);
		field_input2.setBackground(Color.WHITE);
		field_input2.setEditable(false);

		field_input2.setColumns(10);
		field_input2.setBounds(201, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input2);
		field_result.setBackground(Color.WHITE);
		field_result.setEditable(false);

		field_result.setColumns(10);
		field_result.setBounds(332, 27, 108, 40);
		frmCalculator.getContentPane().add(field_result);
		label_equals.setFont(new Font("Tahoma", Font.PLAIN, 15));

		label_equals.setBounds(315, 38, 15, 16);
		frmCalculator.getContentPane().add(label_equals);
		label_choosenOperation.setFont(new Font("Tahoma", Font.PLAIN, 20));

		label_choosenOperation.setBounds(131, 27, 58, 40);
		frmCalculator.getContentPane().add(label_choosenOperation);

		btn_equals.setBounds(261, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_equals);
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
					JOptionPane.showMessageDialog(frmCalculator, "Now click the equalsbutton", "Info", JOptionPane.INFORMATION_MESSAGE);
				}else if (value1 != null && value2 != null){
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
				
				double n1 = 0.0;
				n1 = Double.parseDouble(value1);
				answer = ao.toDegrees(n1);
				sAnswer = Double.toString(answer);
				field_result.setText(sAnswer);
//				JOptionPane.showMessageDialog(frmCalculator, "Now click the equalsbutton", "Info", JOptionPane.INFORMATION_MESSAGE);
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
				JOptionPane.showMessageDialog(frmCalculator, "Now click the equalsbutton", "Info", JOptionPane.INFORMATION_MESSAGE);
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
				case 'S':
					answer = ao.SquareRoot(number1);
					break;
				case 'D':
					answer = ao.toDegrees(number1);
					break;
				case 'R':
					answer = ao.toRadians(number1);
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

} // Class
