package classes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


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
	private JTextField field_input1;
	
	
	// Instanciating the buttons
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn0 = new JButton("0");
	JButton btn_squirt = new JButton("Sqr");
	JButton btn_pow = new JButton("Pow");
	JButton btn_degrees = new JButton("Dgr");
	JButton btn_radian = new JButton("Radian");
	JButton btn_clear = new JButton("C");
	JButton btn_addition = new JButton("+");
	JButton btn_subtraction = new JButton("-");
	JButton btn_division = new JButton("/");
	JButton btn_multiply = new JButton("*");
	JButton btn_random = new JButton("Random");
	JButton btn_cos = new JButton("Cos");
	

	// Instanciating the labels
	private JLabel labelNowPlaying = new JLabel("Now Playing:");
	private JLabel labelSongPlaying = new JLabel("");
	private JTextField field_input2;
	private JTextField field_result;
	

	

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 526);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		field_input1 = new JTextField();
		field_input1.setBounds(12, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input1);
		field_input1.setColumns(10);
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn7.setBounds(86, 112, 58, 49);
		frmCalculator.getContentPane().add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(157, 292, 58, 49);
		frmCalculator.getContentPane().add(btn0);
		
		
		btn_squirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_squirt.setBounds(12, 112, 58, 49);
		frmCalculator.getContentPane().add(btn_squirt);
		
		
		btn_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_pow.setBounds(12, 174, 58, 49);
		frmCalculator.getContentPane().add(btn_pow);
		
		
		btn_degrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_degrees.setBounds(12, 230, 58, 49);
		frmCalculator.getContentPane().add(btn_degrees);
		
		
		btn_radian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_radian.setBounds(12, 292, 71, 49);
		frmCalculator.getContentPane().add(btn_radian);
		
		
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_clear.setBounds(227, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_clear);
		
		
		btn_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_addition.setBounds(313, 174, 58, 49);
		frmCalculator.getContentPane().add(btn_addition);
		
		
		btn_subtraction.setBounds(313, 230, 58, 49);
		frmCalculator.getContentPane().add(btn_subtraction);
		

		btn_division.setBounds(313, 292, 58, 49);
		frmCalculator.getContentPane().add(btn_division);
		
		
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_multiply.setBounds(313, 112, 58, 49);
		frmCalculator.getContentPane().add(btn_multiply);
		
		
		btn_random.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_random.setBounds(12, 351, 79, 49);
		frmCalculator.getContentPane().add(btn_random);
		
		
		btn_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_cos.setBounds(12, 406, 79, 49);
		frmCalculator.getContentPane().add(btn_cos);
		
		field_input2 = new JTextField();
		field_input2.setColumns(10);
		field_input2.setBounds(157, 27, 108, 40);
		frmCalculator.getContentPane().add(field_input2);
		
		field_result = new JTextField();
		field_result.setColumns(10);
		field_result.setBounds(312, 27, 108, 40);
		frmCalculator.getContentPane().add(field_result);
		
		JLabel label_equals = new JLabel("=");
		label_equals.setBounds(285, 39, 15, 16);
		frmCalculator.getContentPane().add(label_equals);
		
		JLabel label_choosenOperation = new JLabel("");
		label_choosenOperation.setBounds(123, 27, 33, 40);
		frmCalculator.getContentPane().add(label_choosenOperation);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
