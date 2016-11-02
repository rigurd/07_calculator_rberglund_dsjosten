package classes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;


/**
* <h1>GUI for the calculator</h1>
* 
* @author  
* @version 1.0
* @since   2016-11-02
*/
public class Gui extends JFrame implements ActionListener{

	/**
	 * Setting serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JFrame frmCalculator;	
	
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
	private JButton btn_cos = new JButton("Cos");
	

	// Instanciating the textfields
	private JTextField field_input1 = new JTextField();
	private JTextField field_input2 = new JTextField();
	private JTextField field_result = new JTextField();
	
	// Instanciating the labels
	JLabel label_equals = new JLabel("=");
	JLabel label_choosenOperation = new JLabel("");

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 526);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
	}
	
		/**
		 * Method for adding the components to the frame
		 */
		public void addComponentsToFrame() {
		
		btn7.setBounds(86, 112, 58, 49);
		frmCalculator.getContentPane().add(btn7);
		
		btn8.setBounds(157, 112, 58, 49);
		frmCalculator.getContentPane().add(btn8);
		
		btn9.setBounds(227, 112, 58, 49);
		frmCalculator.getContentPane().add(btn9);
		
		btn4.setBounds(86, 174, 58, 49);
		frmCalculator.getContentPane().add(btn4);
		
		btn5.setBounds(157, 174, 58, 49);
		frmCalculator.getContentPane().add(btn5);
				
		btn6.setBounds(227, 174, 58, 49);
		frmCalculator.getContentPane().add(btn6);
				
		btn1.setBounds(86, 230, 58, 49);
		frmCalculator.getContentPane().add(btn1);
				
		btn2.setBounds(157, 230, 58, 49);
		frmCalculator.getContentPane().add(btn2);
				
		btn3.setBounds(227, 230, 58, 49);
		frmCalculator.getContentPane().add(btn3);

		btn0.setBounds(157, 292, 58, 49);
		frmCalculator.getContentPane().add(btn0);

		btn_squirt.setBounds(12, 112, 58, 49);
		frmCalculator.getContentPane().add(btn_squirt);

		btn_pow.setBounds(12, 174, 58, 49);
		frmCalculator.getContentPane().add(btn_pow);

		btn_degrees.setBounds(12, 230, 58, 49);
		frmCalculator.getContentPane().add(btn_degrees);

		btn_radian.setBounds(12, 292, 71, 49);
		frmCalculator.getContentPane().add(btn_radian);

		btn_clear.setBounds(227, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_clear);

		btn_addition.setBounds(313, 174, 58, 49);
		frmCalculator.getContentPane().add(btn_addition);
				
		btn_subtraction.setBounds(313, 230, 58, 49);
		frmCalculator.getContentPane().add(btn_subtraction);
		
		btn_division.setBounds(313, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_division);
		
		btn_multiply.setBounds(313, 112, 58, 49);
		frmCalculator.getContentPane().add(btn_multiply);

		btn_random.setBounds(12, 351, 79, 49);
		frmCalculator.getContentPane().add(btn_random);
		
		btn_cos.setBounds(12, 406, 79, 49);
		frmCalculator.getContentPane().add(btn_cos);
			
		field_input1.setBounds(12, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input1);
		field_input1.setColumns(10);
		
		field_input2.setColumns(10);
		field_input2.setBounds(157, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input2);
		
		field_result.setColumns(10);
		field_result.setBounds(312, 27, 108, 40);
		frmCalculator.getContentPane().add(field_result);
				
		label_equals.setBounds(285, 39, 15, 16);
		frmCalculator.getContentPane().add(label_equals);
		label_choosenOperation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		label_choosenOperation.setBounds(131, 27, 33, 40);
		frmCalculator.getContentPane().add(label_choosenOperation);
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
			btn_cos.addActionListener(this);

		}

	public void actionPerformed(ActionEvent e) {
				//Button 7
				if (e.getSource() == btn7) {

				}
				//Button 8
				if (e.getSource() == btn8) {

				}
				//Button 9
				if (e.getSource() == btn9) {

				}
				//Button 4
				if (e.getSource() == btn4) {

				}
				//Button 5
				if (e.getSource() == btn5) {

				}
				//Button 6
				if (e.getSource() == btn6) {

				}
				//Button 1
				if (e.getSource() == btn1) {

				}
				//Button 2
				if (e.getSource() == btn2) {

				}
				//Button 3
				if (e.getSource() == btn3) {

				}
				//Button 0
				if (e.getSource() == btn0) {

				}
				//Button sqr
				if (e.getSource() == btn_squirt) {

				}
				//Button pow
				if (e.getSource() == btn_pow) {

				}
				//Button degrees
				if (e.getSource() == btn_degrees) {

				}
				//Button radian
				if (e.getSource() == btn_radian) {

				}
				//Button add
				if (e.getSource() == btn_addition) {
					
					label_choosenOperation.setText("+");
					
				}
				//Button subtract
				if (e.getSource() == btn_subtraction) {
					label_choosenOperation.setText("-");

				}
				//Button division
				if (e.getSource() == btn_division) {
					label_choosenOperation.setText("/");

				}
				//Button multiplication
				if (e.getSource() == btn_multiply) {
					label_choosenOperation.setText("*");

				}
				//Button random
				if (e.getSource() == btn_random) {

				}
				//Button cos
				if (e.getSource() == btn_cos) {

				}
				//Button clear
				if (e.getSource() == btn_clear) {
					label_choosenOperation.setText("");
				}
	
				
			} // Action performed
		
	}

