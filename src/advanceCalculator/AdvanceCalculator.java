package advanceCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AdvanceCalculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvanceCalculator window = new AdvanceCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdvanceCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtDisplay.setBounds(10, 11, 343, 44);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//Row 01
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtDisplay.getText().length()>0) {
					String btnBackSpace = null;
					StringBuilder stringBuilder = new StringBuilder(txtDisplay.getText());
					stringBuilder.deleteCharAt(txtDisplay.getText().length()-1);
					btnBackSpace = stringBuilder.toString();
					txtDisplay.setText(btnBackSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.BOLD, 40));
		btnBackSpace.setBounds(10, 66, 80, 80);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 60));
		btnClear.setBounds(96, 66, 80, 80);
		frame.getContentPane().add(btnClear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnModulus.setBounds(186, 66, 80, 80);
		frame.getContentPane().add(btnModulus);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
			    operations = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnAdd.setBounds(273, 66, 80, 80);
		frame.getContentPane().add(btnAdd);
		
		//Row 02
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterValue = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterValue);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn7.setBounds(10, 157, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterValue = txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn8.setBounds(96, 157, 80, 80);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn9.setBounds(186, 157, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnMinus.setBounds(273, 157, 80, 80);
		frame.getContentPane().add(btnMinus);
		
		//Row 03
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn4.setBounds(10, 243, 80, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn5.setBounds(96, 243, 80, 80);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn6.setBounds(186, 243, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "X";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 65));
		btnMul.setBounds(273, 243, 80, 80);
		frame.getContentPane().add(btnMul);
		
		//Row 04
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn1.setBounds(10, 328, 80, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn2.setBounds(96, 328, 80, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn3.setBounds(186, 328, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 55));
		btnDiv.setBounds(273, 328, 80, 80);
		frame.getContentPane().add(btnDiv);
		
		//Row 05
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn0.setBounds(10, 415, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnDot.setBounds(96, 415, 80, 80);
		frame.getContentPane().add(btnDot);
		
		JButton btnAddMinus = new JButton("\u00B1");
		btnAddMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double plusMinus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusMinus = plusMinus*(-1);
				txtDisplay.setText(String.valueOf(plusMinus));
			}
		});
		btnAddMinus.setFont(new Font("Tahoma", Font.BOLD, 55));
		btnAddMinus.setBounds(186, 415, 80, 80);
		frame.getContentPane().add(btnAddMinus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondNumber = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "X") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}	
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 55));
		btnEqual.setBounds(273, 415, 80, 80);
		frame.getContentPane().add(btnEqual);
		
	}
}
