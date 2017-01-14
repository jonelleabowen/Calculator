import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**This class implements the graphical user
 * interface for a calculator
 * 
 * @author Jonelle Bowen
 *
 */
public class GUI extends JFrame
{
	private final int WIDTH = 800;
	private final int HEIGHT = 600;

	// GUI components
	//private JPanel textPanel; 
	private JPanel operationsPanel; 
	private JPanel numbersPanel;
	
	private JTextArea textArea;

	// the numbers buttons
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	private JButton b_dot;
	private JButton b_equ;
	
	//the operations buttons
	private JButton plus;
	private JButton minus;
	private JButton multiply;
	private JButton divide;
	private JButton mod;
	private JButton sqrt;	
	private JButton back;
	private JButton clear;
	
	Calculator calculator;
	Font font;
	
	//this constructor is a panel
	public GUI()
	{
		calculator = new Calculator(); // calculator object
		font = new Font("Arial", Font.PLAIN, 40); // font object
		
		setTitle("My Calculator");  //sets window title
		setSize(WIDTH, HEIGHT);	//800 x 6800		// sets window size
		setLayout(new BorderLayout());	//sets frame layout
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // specifies behavior of exit button	
		
		//setBackground(Color.BLUE);
		
		operationsPanel(); 
		numbersPanel();
		
		//textPanel
		textArea = new JTextArea(4,35);
		//textArea.setText("" + -3.4);
		//textArea.setCaretPosition(textArea.getText().length());  
		textArea.setBorder(BorderFactory.createLineBorder(Color.black,5));
		textArea.setFont(new Font("Arial", Font.PLAIN, 26));
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		add(textArea, BorderLayout.PAGE_START);	
		add(Box.createRigidArea(new Dimension(0,30)));
		add(numbersPanel, BorderLayout.LINE_START);
		add(Box.createRigidArea(new Dimension(15,0)));
		add(operationsPanel, BorderLayout.LINE_END);
		
//		add(textArea);	
//		add(Box.createRigidArea(new Dimension(0,5)));
//		add(numbersPanel);
//		add(Box.createRigidArea(new Dimension(5,0)));
//		add(operationsPanel);
		
		setVisible(true);	//makes frame visible
	}
			
	public void numbersPanel()
	{
		numbersPanel = new JPanel();
		numbersPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		numbersPanel.setPreferredSize(new Dimension(360,30));
		numbersPanel.setLayout(new GridLayout(3,4));
		
		numbersPanel. setBackground(Color.BLUE);

		//making button objects
		b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3");		
		b4 = new JButton("4"); b5 = new JButton("5"); b6 = new JButton("6");
		b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("9");
		b0 = new JButton("0"); b_dot = new JButton("."); b_equ = new JButton("=");				
		
		// setting font for buttons
		b1.setFont(font); b2.setFont(font); b3.setFont(font); b4.setFont(font);
		b5.setFont(font); b6.setFont(font); b7.setFont(font); b8.setFont(font);
		b9.setFont(font); b0.setFont(font); b_dot.setFont(font); b_equ.setFont(font);
		
		//adding action listeners to buttons
		b1.addActionListener(new B1());	b2.addActionListener(new B2());
		b3.addActionListener(new B3()); b4.addActionListener(new B4());
		b5.addActionListener(new B5());	b6.addActionListener(new B6());
		b7.addActionListener(new B7());	b8.addActionListener(new B8());
		b9.addActionListener(new B9());	b0.addActionListener(new B0());
		b_dot.addActionListener(new B_dot()); b_equ.addActionListener(new B_equ());
		
		//adding numbers to panel
		numbersPanel.add(b1); numbersPanel.add(b2);	numbersPanel.add(b3);
		numbersPanel.add(b4); numbersPanel.add(b5);	numbersPanel.add(b6);
		numbersPanel.add(b7); numbersPanel.add(b8); numbersPanel.add(b9);
		numbersPanel.add(b0); numbersPanel.add(b_dot); numbersPanel.add(b_equ);
	}
	
	public void operationsPanel()
	{	
		//making/customizing panel
		operationsPanel = new JPanel();
		operationsPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		operationsPanel.setPreferredSize(new Dimension(360,30));
		operationsPanel.setLayout(new GridLayout(5,2));
		
		//making button objects
		back = new JButton("Back");
		clear = new JButton("Clear");
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		mod = new JButton("%");
		
		back.setFont(font); clear.setFont(font); plus.setFont(font); minus.setFont(font);
		divide.setFont(font); multiply.setFont(font); mod.setFont(font);
		
		//adding operation buttons to panel
		operationsPanel.add(back); operationsPanel.add(clear);
		operationsPanel.add(plus); operationsPanel.add(minus);
		operationsPanel.add(multiply); operationsPanel.add(divide);
		operationsPanel.add(mod);
		
		plus.addActionListener(new Plus());
		minus.addActionListener(new Minus());
		multiply.addActionListener(new Multiply());
		divide.addActionListener(new Divide());
		mod.addActionListener(new Mod());
		clear.addActionListener(new Clear());
		back.addActionListener(new Back());

		//sqrt.addActionListener(new BothInterestListener());

	}
	
	private class B1 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("1");
		}
	}
	
	private class B2 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("2");
		}
	}
	
	private class B3 implements ActionListener {
		public void actionPerformed(ActionEvent j) {

			textArea.append("3");
		}
	}
	
	private class B4 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("4");
		}
	}
	private class B5 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("5");
		}
	}
	private class B6 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("6");
		}
	}
	private class B7 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("7");
		}
	}
	private class B8 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("8");
		}
	}
	private class B9 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("9");
		}
	}
	private class B0 implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append("0");
		}
	}
	private class B_dot implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.append(".");
		}
	}
	private class B_equ implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum2(textArea.getText());
			calculator.calculate();
			System.out.println(""+calculator.getResult());
			textArea.setText(""+calculator.getResult());
			
		}
	}
	
	private class Plus implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum1(textArea.getText());
			calculator.setOperation("add");
			textArea.setText("");
		}
	}
	
	private class Minus implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum1(textArea.getText());
			calculator.setOperation("subtract");
			textArea.setText("");
		}
	}
	
	private class Divide implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum1(textArea.getText());
			calculator.setOperation("divide");
			textArea.setText("");
			
		}
	}
	
	private class Multiply implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum1(textArea.getText());
			calculator.setOperation("multiply");
			textArea.setText("");
		}
	}
	
	private class Mod implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			calculator.setNum1(textArea.getText());
			calculator.setOperation("mod");
			textArea.setText("");
			
		}
	}	
	
	private class Clear implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			textArea.setText(null);
			calculator.setResult(0.0);
		}
	}
	
	private class Back implements ActionListener {
		public void actionPerformed(ActionEvent j) {
			
			
		}
	}

	/** Main method calls GUI constructor */
	public static void main(String[] args)
	{
		new GUI();
	}
	

}
