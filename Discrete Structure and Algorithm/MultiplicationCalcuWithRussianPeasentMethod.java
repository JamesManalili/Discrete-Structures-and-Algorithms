import java.awt.EventQueue;  
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MultiplicationCalcuWithRussianPeasentMethod {

	private JFrame frame;
	static private JTextField input1;
	private JTextField input2;
	private int int1 = 0, int2 = 0;
	private JLabel resultField;
	private DecimalFormat df = new DecimalFormat("###,###,###.##");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiplicationCalcuWithRussianPeasentMethod window = new MultiplicationCalcuWithRussianPeasentMethod();
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
	public MultiplicationCalcuWithRussianPeasentMethod() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn9.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn9.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn9.setBounds(10, 89, 65, 33);
		frame.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn6.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn6.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(10, 135, 65, 33);
		frame.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn3.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn3.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(10, 181, 65, 33);
		frame.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn0.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn0.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn0.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 225, 65, 33);
		frame.getContentPane().add(btn0);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn2.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn2.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(85, 181, 65, 33);
		frame.getContentPane().add(btn2);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn5.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn5.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(85, 135, 65, 33);
		frame.getContentPane().add(btn5);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn8.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn8.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(85, 89, 65, 33);
		frame.getContentPane().add(btn8);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText("Enter First Number");
				input2.setText("Enter Second Number");
				resultField.setText("Result");
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(235, 181, 118, 33);
		frame.getContentPane().add(btnClear);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn1.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn1.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(160, 181, 65, 33);
		frame.getContentPane().add(btn1);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn4.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn4.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(160, 135, 65, 33);
		frame.getContentPane().add(btn4);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btn7.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btn7.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(160, 89, 65, 33);
		frame.getContentPane().add(btn7);

		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input1.getText().matches("^[a-zA-Z\s]+$") || input1.getText().equals("")) {

				}

				if (input2.getText().matches("^[a-zA-Z\s]+$") || input2.getText().equals("")) {

				} else { // Get the input values
					double num1 = Double.parseDouble(input1.getText());
					double num2 = Double.parseDouble(input2.getText());

					// Calculate the result using the Russian Peasant method
					double result = russianPeasantMultiply(num1, num2);
					String res = df.format(result);
					// Set the result field to the calculated result
					resultField.setText(res);
				}
			}
		});
		btnmultiply.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnmultiply.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnmultiply.setBackground(Color.WHITE);
		btnmultiply.setBounds(235, 89, 118, 80);
		frame.getContentPane().add(btnmultiply);

		input1 = new JTextField();
		input1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char input = e.getKeyChar();
				if ((input < '0' || input > '9') && input != '.' && input != '-' && input != '\b') {
					e.consume();
				}
			}
		});
		input1.setText("Enter First Number");
		input1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int1 = 1;
				int2 = 0;
				if (input1.getText().equals("Enter First Number")) {
					input1.setText(null);
				}
			}
		});
		input1.setHorizontalAlignment(SwingConstants.RIGHT);
		input1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		input1.setBorder(null);
		input1.setBounds(10, 11, 155, 33);
		frame.getContentPane().add(input1);
		input1.setColumns(10);

		JButton btnErase = new JButton("bkspc");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String erase = input1.getText();
					if (erase.length() > 0) {
						input1.setText(erase.substring(0, erase.length() - 1));
					}
				} else if (int2 == 1) {
					String erase = input2.getText();
					if (erase.length() > 0) {
						input2.setText(erase.substring(0, erase.length() - 1));
					}
				}
			}
		});
		btnErase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnErase.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnErase.setBackground(Color.WHITE);
		btnErase.setBounds(160, 225, 193, 33);
		frame.getContentPane().add(btnErase);

		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (int1 == 1) {
					String EnterNumber = input1.getText() + btndot.getText();
					input1.setText(EnterNumber);
				} else if (int2 == 1) {
					String EnterNumber = input2.getText() + btndot.getText();
					input2.setText(EnterNumber);
				}
			}
		});
		btndot.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btndot.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btndot.setBackground(Color.WHITE);
		btndot.setBounds(85, 224, 65, 33);
		frame.getContentPane().add(btndot);

		input2 = new JTextField();
		input2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char input = e.getKeyChar();
				if ((input < '0' || input > '9') && input != '.' && input != '-' && input != '\b') {
					e.consume();
				}
			}
		});
		input2.setText("Enter Second Number");
		input2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int1 = 0;
				int2 = 1;
				if (input2.getText().equals("Enter Second Number")) {
					input2.setText(null);
				}
			}
		});
		input2.setHorizontalAlignment(SwingConstants.RIGHT);
		input2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		input2.setColumns(10);
		input2.setBorder(null);
		input2.setBounds(10, 48, 155, 33);
		frame.getContentPane().add(input2);

		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 36, 46, 21);
		frame.getContentPane().add(lblNewLabel);

		resultField = new JLabel("Result   ");
		resultField.setHorizontalAlignment(SwingConstants.RIGHT);
		resultField.setOpaque(true);
		resultField.setBackground(Color.WHITE);
		resultField.setForeground(Color.BLACK);
		resultField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		resultField.setBounds(204, 30, 149, 33);
		frame.getContentPane().add(resultField);

	}

	public double russianPeasantMultiply(double num1, double num2) {
		double result = 0;
		boolean isNegative = false;
		//-19 -123
		if (num1 < 0) {//kapag negative convert muna sa positive
			num1 *= -1;
			isNegative = true; //set ng boolean na negative siya
		}

		if (num2 < 0) { //kapag negative convert muna sa positive
			num2 *= -1;
			isNegative = !isNegative; //set ng boolean na negative siya
		}
		
		if(num1 == 0) {
			return result;
		}
		
		//10x8.5
		while (num2 > 0) {//8//4//2//1
			if ((int)num2 % 2 == 1) {
				 result += num1; 
			}
			
			num1 *= 2;//(10x2=20) (20x2=40) (40x2=80) (80x2=160)
			num2 = num2/2;//(8/2=4)  (4/2=2) (2/2=1) (1/2=0.5)
		}

		if (isNegative) { //kapag true gawing negative
			result *= -1;
		}

		return result;
	}
}
