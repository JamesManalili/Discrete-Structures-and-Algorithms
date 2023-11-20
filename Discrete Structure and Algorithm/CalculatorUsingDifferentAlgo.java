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
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.Component;

public class CalculatorUsingDifferentAlgo {

	public JFrame frame;
	public JTextField input1;
	double remainder;
	public DecimalFormat df = new DecimalFormat("###,###,###.##");
	DecimalFormat df2 = new DecimalFormat(".##");

	public Double result = null;
	public JButton btnmultiply;
	Double first = null, second = null;
	String ans, operation;
	double rem;
	private JTextArea textAreaSolAdd;
	private JTextArea textAreaSolSub;
	private JTextArea textAreaSolMul;
	private JTextArea textAreaSolDiv;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUsingDifferentAlgo window = new CalculatorUsingDifferentAlgo();
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
	public CalculatorUsingDifferentAlgo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1185, 309);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn9.getText();
				input1.setText(EnterNumber);
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn9.setBounds(160, 89, 65, 33);
		frame.getContentPane().add(btn9);

		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn6.getText();
				input1.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(160, 135, 65, 33);
		frame.getContentPane().add(btn6);

		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn3.getText();
				input1.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(160, 181, 65, 33);
		frame.getContentPane().add(btn3);

		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn0.getText();
				input1.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn0.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 225, 65, 33);
		frame.getContentPane().add(btn0);

		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn2.getText();
				input1.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(85, 181, 65, 33);
		frame.getContentPane().add(btn2);

		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn5.getText();
				input1.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(85, 135, 65, 33);
		frame.getContentPane().add(btn5);

		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn8.getText();
				input1.setText(EnterNumber);
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
				input1.setText("");
				first = null;
				second = null;
				result = null;
				textAreaSolAdd.setText(null);
				textAreaSolSub.setText(null);
				textAreaSolMul.setText(null);
				textAreaSolDiv.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(235, 210, 80, 48);
		frame.getContentPane().add(btnClear);

		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn1.getText();
				input1.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 181, 65, 33);
		frame.getContentPane().add(btn1);

		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn4.getText();
				input1.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 135, 65, 33);
		frame.getContentPane().add(btn4);

		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btn7.getText();
				input1.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btn7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 89, 65, 33);
		frame.getContentPane().add(btn7);

		btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + " * ";
				input1.setText(EnterNumber);
				if(textAreaSolAdd != null && textAreaSolSub != null && textAreaSolMul != null && textAreaSolDiv != null ) {
					textAreaSolAdd.setText(null);
					textAreaSolSub.setText(null);
					textAreaSolMul.setText(null);
					textAreaSolDiv.setText(null);
				}
			}
		});
		btnmultiply.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnmultiply.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnmultiply.setBackground(Color.WHITE);
		btnmultiply.setBounds(235, 89, 80, 48);
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
		input1.setText("0");
		input1.setHorizontalAlignment(SwingConstants.RIGHT);
		input1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		input1.setBorder(null);
		input1.setBounds(10, 11, 395, 67);
		frame.getContentPane().add(input1);
		input1.setColumns(10);

		JButton btnErase = new JButton("bkspc");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erase = input1.getText();
				if (erase.length() > 1) {
					input1.setText(erase.substring(0, erase.length() - 3));
				} else {
					input1.setText("");
				}
			}
		});
		btnErase.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnErase.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnErase.setBackground(Color.WHITE);
		btnErase.setBounds(160, 225, 65, 33);
		frame.getContentPane().add(btnErase);

		final JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + btndot.getText();
				input1.setText(EnterNumber);
			}
		});
		btndot.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btndot.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btndot.setBackground(Color.WHITE);
		btndot.setBounds(85, 224, 65, 33);
		frame.getContentPane().add(btndot);

		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + " + ";
				input1.setText(EnterNumber);
				if(textAreaSolAdd != null && textAreaSolSub != null && textAreaSolMul != null && textAreaSolDiv != null ) {
					textAreaSolAdd.setText(null);
					textAreaSolSub.setText(null);
					textAreaSolMul.setText(null);
					textAreaSolDiv.setText(null);
				}
			}
		});
		btnAddition.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAddition.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAddition.setBackground(Color.WHITE);
		btnAddition.setBounds(325, 89, 80, 48);
		frame.getContentPane().add(btnAddition);

		JButton btnsubtraction = new JButton("-");
		btnsubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + " - ";
				input1.setText(EnterNumber);
				if(textAreaSolSub != null && textAreaSolAdd != null && textAreaSolMul != null && textAreaSolDiv != null) {
					textAreaSolSub.setText(null);
					textAreaSolAdd.setText(null);
					textAreaSolMul.setText(null);
					textAreaSolDiv.setText(null);
				}
			}
		});
		btnsubtraction.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnsubtraction.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnsubtraction.setBackground(Color.WHITE);
		btnsubtraction.setBounds(235, 148, 80, 48);
		frame.getContentPane().add(btnsubtraction);

		JButton btndivision = new JButton("/");
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = input1.getText() + " / ";
				input1.setText(EnterNumber);
				if(textAreaSolSub != null && textAreaSolAdd != null && textAreaSolMul != null && textAreaSolDiv != null) {
					textAreaSolSub.setText(null);
					textAreaSolAdd.setText(null);
					textAreaSolMul.setText(null);
					textAreaSolDiv.setText(null);
				}
			}
		});
		btndivision.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btndivision.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btndivision.setBackground(Color.WHITE);
		btndivision.setBounds(325, 148, 80, 48);
		frame.getContentPane().add(btndivision);

		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String infix = input1.getText();
				if (!checker(infix) || containsDivisorZero(infix)) {
					JOptionPane.showMessageDialog(null, "Invalid expression Please try again");
					input1.setText(null);
				} else {
					String prefix = infix_to_prefix(infix);
					evaluate_prefix(prefix);
					if (rem == 0) {
						input1.setText(ans);
					} else {
						input1.setText(ans + df2.format(rem));
						rem = 0;
					}
				}

			}
		});
		btnequal.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnequal.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnequal.setBackground(Color.WHITE);
		btnequal.setBounds(325, 210, 80, 48);
		frame.getContentPane().add(btnequal);
		
		textAreaSolAdd = new JTextArea();
		textAreaSolAdd.setRows(10);
		textAreaSolAdd.setTabSize(100);
		textAreaSolAdd.setBounds(415, 11, 183, 249);
		frame.getContentPane().add(textAreaSolAdd);
		
		JScrollPane scrollPane = new JScrollPane(textAreaSolAdd);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(415, 37, 180, 223);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("ADDITION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(418, 12, 177, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textAreaSolSub = new JTextArea();
		textAreaSolSub.setTabSize(100);
		textAreaSolSub.setRows(10);
		textAreaSolSub.setBounds(606, 41, 161, 204);
		frame.getContentPane().add(textAreaSolSub);
		
		JScrollPane scrollPaneSub = new JScrollPane(textAreaSolSub);
		scrollPaneSub.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneSub.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSub.setBounds(605, 37, 176, 223);
		frame.getContentPane().add(scrollPaneSub);
		
		JLabel lblSubtraction = new JLabel("SUBTRACTION");
		lblSubtraction.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtraction.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSubtraction.setBounds(605, 11, 177, 21);
		frame.getContentPane().add(lblSubtraction);
		
		textAreaSolMul = new JTextArea();
		textAreaSolMul.setTabSize(100);
		textAreaSolMul.setRows(10);
		textAreaSolMul.setBounds(791, 41, 157, 204);
		frame.getContentPane().add(textAreaSolMul);
		
		JLabel lblMultiplication = new JLabel("MULTIPLICATION");
		lblMultiplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiplication.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMultiplication.setBounds(791, 11, 177, 21);
		frame.getContentPane().add(lblMultiplication);
		
		JScrollPane scrollPane_1 = new JScrollPane(textAreaSolMul);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(791, 37, 177, 221);
		frame.getContentPane().add(scrollPane_1);
		
		textAreaSolDiv = new JTextArea();
		textAreaSolDiv.setTabSize(100);
		textAreaSolDiv.setRows(10);
		textAreaSolDiv.setBounds(978, 37, 158, 202);
		frame.getContentPane().add(textAreaSolDiv);
		
		JScrollPane scrollPane_2 = new JScrollPane(textAreaSolDiv);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(978, 37, 176, 221);
		frame.getContentPane().add(scrollPane_2);
		
		JLabel lblDivision = new JLabel("DIVISION");
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivision.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDivision.setBounds(977, 11, 177, 21);
		frame.getContentPane().add(lblDivision);

	}

	public void evaluate_prefix(String prefix) {
		Stacks operan = new Stacks(prefix.length());

		String[] array = prefix.split(" ");
		String[] reversed = new String[array.length];

		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			reversed[j] = array[i];
			j++;
		}
		for (String item : reversed) {
			if (item.matches("-?[0-9.]+")) {
				operan.push(Double.parseDouble(item));
			} else {
				double a = operan.pop();
				double b = operan.pop();

				double result = evaluation(a, b, item.charAt(0));

				operan.push(result);
			}
		}
		ans = df.format(operan.topValue());
	}

	public double evaluation(double first, double second, char operator) {
		double result = 0;

		switch (operator) {
		case '+':
			result = sum(first, second);
			break;
		case '-':
			result = sub(first, second);
			break;
		case '*':
			result = russianPeasantMultiply(first, second);
			break;
		case '/':
			result = shiftAndSub(first, second);
			break;
		case '^':
			result = Math.pow(first, second);
			break;
		default:
			return 0;
		}
		return result;
	}

	public String print_array(String[] array) {
		String stre = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				stre += " " + array[i];
			}
		}
		return stre.trim();
	}

	public boolean containsDivisorZero(String infix) {
		String[] express = infix.split("\\s+");
		for (int i = 0; i < express.length - 1; i++) {
			if (express[i].equals("/") && express[i + 1].equals("0")) {
				return true;
			}
		}
		return false;
	}

	public boolean checker(String infix) {
		String openss = "";

		for (int i = 0; i < infix.length(); i++) {
			char letter = infix.charAt(i);

			if (letter == '(') {
				openss += letter;
			}

			else if (letter == ')') {
				if (openss.length() == 0) {
					return false;
				} else {
					openss = openss.substring(0, openss.length() - 1);
				}
			}
		}

		if (openss.length() != 0)
			return false;

		infix = infix.replaceAll("[(]\\s[+\\-/*^]", " ");
		infix = infix.replaceAll("[+\\-/*^]\\s[)]", " ");
		infix = infix.replaceAll("[(]\\s", "");
		infix = infix.replaceAll("\\s[)]", "");
		String[] infix_array = infix.split(" ");
		int array_size = infix_array.length;

		boolean[] cheOperator = new boolean[array_size];
		boolean[] cheOperand = new boolean[array_size];
		;

		for (int i = 0; i < infix_array.length; i++) {
			if (infix_array[i].equals("+") || "-".equals(infix_array[i]) || "*".equals(infix_array[i])
					|| infix_array[i].equals("/") || infix_array[i].equals("^")) {
				cheOperator[i] = true;
				cheOperand[i] = false;
			} else {
				cheOperand[i] = true;
				cheOperator[i] = false;
			}
		}

		for (int che = 0; che < infix_array.length; che++) {
			if (cheOperator[0] == true || cheOperator[infix_array.length - 1] == true) {
				return false;
			}
			if (cheOperand[che] == true) {
				if (infix_array[che].matches("-?[a-zA-Z0-9.]+") == false) {//&
					return false;
				}

				if (che + 1 < infix_array.length) {
					if (cheOperand[che + 1] == true) {
						return false;
					}
				}
			}

			if (cheOperator[che] == true) {
				if (che + 1 < infix_array.length) {
					if (cheOperator[che + 1] == true) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public String infix_to_prefix(String notation) {
		String[] ope = notation.split(" ");

		int ps = 1;
		int md = 2;
		int c = 3;
		int runner4operators = 0, runner4operands = 0;
		int counter[] = new int[ope.length];
		// stack operat precedence
		int operat_precedence[] = new int[ope.length];

		String rev[] = new String[ope.length];
		String operat[] = new String[ope.length];
		String operan[] = new String[ope.length];
		String counterS[] = new String[ope.length];

		int reA = ope.length - 1;
		int a = 0;
		while (reA > -1) {
			rev[reA] = ope[a];
			reA--;
			a++;
		}
		a = 0;
		reA = ope.length - 1;
		while (reA > -1) {
			if (rev[a].equals("+") || rev[a].equals("-")) {
				counter[a] = 1;
				counterS[a] = "cba";
			} else if (rev[a].equals("*") || rev[a].equals("/")) {
				counter[a] = 2;
				counterS[a] = "cba";

			} else if (rev[a].equals("^")) {
				counter[a] = 3;
				counterS[a] = "cba";
			}

			// opening parenthesis
			else if (rev[a].equals(")")) {
				counter[a] = 0;
				counterS[a] = "paren";
			}

			// closing parenthesis
			else if (rev[a].equals("(")) {//
				counter[a] = 5;
				counterS[a] = "paren";
			} else {
				counterS[a] = "abc";
			}
			a++;
			reA--;
		}

		for (int po = 0; po < rev.length; po++) {
			if (counterS[po].equals("abc")) {
				operan[runner4operands] = rev[po];
				runner4operands++;
			}

			// parenthesis
			else if (counterS[po].equals("paren")) {
				if (counter[po] == 0) {
					operat[runner4operators] = rev[po];
					operat_precedence[runner4operators] = counter[po];

					runner4operators++;
				} else {
					String operat_top = operat[runner4operators - 1];
					int operat_top_precedence = operat_precedence[runner4operators - 1];
					operat[runner4operators - 1] = "";
					operat_precedence[runner4operators - 1] = 0;

					runner4operators--;

					while (operat_top_precedence != 0) {
						operan[runner4operands] = operat_top;
						runner4operands++;

						operat_top = operat[runner4operators - 1];
						operat_top_precedence = operat_precedence[runner4operators - 1];
						operat[runner4operators - 1] = "";
						operat_precedence[runner4operators - 1] = 0;

						runner4operators--;
					}
				}
			}

			// operator
			if (counterS[po].equals("cba")) {

				// case 1
				if (counter[po] == ps) {

					if (runner4operators == 0) {
						operat[runner4operators] = rev[po];
						operat_precedence[runner4operators] = counter[po];

						runner4operators++;
					} else if (counter[po] < operat_precedence[runner4operators - 1]) {

						operan[runner4operands] = operat[runner4operators - 1];
						operat[runner4operators - 1] = "";
						operat_precedence[runner4operators - 1] = 0;

						runner4operands++;
						runner4operators--;
						po--;
						continue;
					} else if (counter[po] == ps) {
						operat[runner4operators] = rev[po];
						operat_precedence[runner4operators] = counter[po];
						runner4operators++;
					}

				}

				// case 2
				if (counter[po] == md) {
					if (runner4operators == 0) {
						operat[runner4operators] = rev[po];
						operat_precedence[runner4operators] = counter[po];

						runner4operators++;
					} else if (counter[po] < operat_precedence[runner4operators - 1]) {

						operan[runner4operands] = operat[runner4operators - 1];

						operat[runner4operators - 1] = "";
						operat_precedence[runner4operators - 1] = 0;

						runner4operands++;
						runner4operators--;
						po--;
						continue;
					} else if (counter[po] == md) {

						operat[runner4operators] = rev[po];
						operat_precedence[runner4operators] = counter[po];
						runner4operators++;
					}
				}

				// case 3
				if (counter[po] == c) {
					operat[runner4operators] = rev[po];
					operat_precedence[runner4operators] = counter[po];
					runner4operators++;
				}

			}
		}

		while (runner4operators > 0) {
			operan[runner4operands] = operat[runner4operators - 1];
			runner4operands++;
			runner4operators--;
		}

		a = 0;
		reA = ope.length - 1;
		while (reA > -1) {
			rev[reA] = operan[a];
			reA--;
			a++;
		}

		return print_array(rev);
	}

	private class Stacks {
		private int topIndex = -1;
		private int size = 0;
		private double[] array;

		public Stacks(int size) {
			this.size = size;
			this.array = new double[size];
		}

		public boolean push(double data) {
			// check if the stack is full
			if (topIndex != size - 1) {
				topIndex++;
				array[topIndex] = data;
				return true;
			} else {
				return false;
			}
		}

		public double pop() {
			// check if the stack is empty
			if (topIndex > -1) {
				double data = array[topIndex];
				array[topIndex] = 0;
				topIndex--;
				return data;
			} else {
				return 0;
			}
		}

		public double topValue() {
			if (topIndex > -1) {
				return array[topIndex];
			} else {
				return 0;
			}
		}

		public int size() {
			return this.size;
		}

		public boolean empty() {
			if (topIndex < 0) {
				return true;
			} else {
				return false;
			}
		}

		public void displayStack() {
			if (topIndex < 0) {
				System.out.print("The Stack is empty");
			} else {
				System.out.print("\nThe stacks contains: ");
				for (int i = 0; i <= topIndex; i++) {
					System.out.print(array[i] + " ");
				}
			}
			System.out.println();
		}
	}

	public double russianPeasantMultiply(double num1, double num2) {
		double result = 0;
		boolean isNegative = false;
		// -19 -123
		if (num1 < 0) {// kapag negative convert muna sa positive
			num1 *= -1;
			isNegative = true; // set ng boolean na negative siya
		}

		if (num2 < 0) { // kapag negative convert muna sa positive
			num2 *= -1;
			isNegative = !isNegative; // set ng boolean na negative siya
		}

		if (num1 == 0) {
			return result;
		}

		// 10x8
		while ((int)num2 > 0) {// 8//4//2//1
			if ((int) num2 % 2 == 1) {
				result += num1;
				textAreaSolMul.setText(textAreaSolMul.getText()+"Result: "+result +"\n");
			}
			
			num1 *= 2;// (10x2=20) (20x2=40) (40x2=80) (80x2=160)
			num2 = num2 / 2;// (8/2=4) (4/2=2) (2/2=1) (1/2=0.5)
			textAreaSolMul.setText(textAreaSolMul.getText()+"Num 1= "+ num1 +" Num 2= "+ num2+" \n");
			if(num2 < 0) {
				textAreaSolMul.setText(textAreaSolMul.getText()+"Product: "+result);
				return result;
			}
		}

		if (isNegative) { // kapag true gawing negative
			result *= -1;
		}
		textAreaSolMul.setText(textAreaSolMul.getText()+"Product: "+result);
		return result;
	}

	public double sum(double num1, double num2) {	
		if (num2 == 0) {
			textAreaSolAdd.setText(textAreaSolAdd.getText()+"Sum: "+num1);
			return num1;
		} else {
			String pnum1 = df.format(num1+1);
			String pnum2 = df.format(num2-1);
			textAreaSolAdd.setText(textAreaSolAdd.getText()+"Num 1= "+ pnum1 +" Num 2= "+ pnum2+" \n");
			return sum(num1 + 1, (int)num2 - 1);
		}
	}

	public double sub(double num1, double num2) {
		if (num2 == 0) {
			textAreaSolSub.setText(textAreaSolSub.getText()+"Difference: "+num1);
			return num1;
		} else {
			String pnum1 = df.format(num1-1);
			String pnum2 = df.format(num2-1);
			textAreaSolSub.setText(textAreaSolSub.getText()+"Num 1= "+ pnum1 +" Num 2= "+ pnum2+" \n");
			return sub(num1 - 1, (int)num2-1);
		}
	}

	public double shiftAndSub(double dividend, double divisor) {
		// Handle division by zero
		if (divisor == 0.0) {
		}
		// Initialize quotient to zero
		double quotient = 0.0;
		remainder = 0;
		// Handle negative values
		boolean negativeResult = false;
		if (dividend < 0.0) {
			negativeResult = !negativeResult;
			dividend = -dividend;
		}
		if (divisor < 0.0) {
			negativeResult = !negativeResult;
			divisor = -divisor;
		}

		// Perform division using shift and subtract algorithm
		for (int i = 5; i >= 0; i--) {
			remainder = ((int) remainder << 1) + ((int) dividend >> i & 1);
			textAreaSolDiv.setText(textAreaSolDiv.getText()+"Remainder: "+ remainder +"\n");
			if (remainder >= divisor) {
				remainder -= divisor;
				quotient += 1 << i;
			}
		}

		// Handle negative result
		if (negativeResult) {
			quotient = -quotient;
		}
		rem = remainder / divisor;
		// Return quotient
		textAreaSolDiv.setText(textAreaSolDiv.getText()+"Quotient: "+ quotient +"\n");
		return quotient;
	}
}
