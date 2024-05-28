import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
public class MyFrame extends JFrame implements ActionListener  {
	double firstnum;
	double secondnum;
	String strnum = "";

	
	JButton plusButton;
	JButton MinusButton;
	JButton divideButton;
	JButton MultiplyButton;
	JButton sqrtButton;
	JButton powButton;
	JButton powByTwoButton;
	JButton logButton;
	JButton EqualButton; 

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;


	// calculator 
	MyFrame(){

		ImageIcon plusImage = new ImageIcon("");
		ImageIcon MinusImage = new ImageIcon("");
		ImageIcon divideImage = new ImageIcon("");
		ImageIcon MultiplyImage = new ImageIcon("");
		ImageIcon sqrtImage = new ImageIcon("");
		ImageIcon powImage = new ImageIcon("");
		ImageIcon powByTwoImage = new ImageIcon("");
		ImageIcon logImage = new ImageIcon("");

		ImageIcon Image1 = new ImageIcon("");
		ImageIcon Image2 = new ImageIcon("");
		ImageIcon Image3 = new ImageIcon("");
		ImageIcon Image4 = new ImageIcon("");
		ImageIcon Image5 = new ImageIcon("");
		ImageIcon Image6 = new ImageIcon("");
		ImageIcon Image7 = new ImageIcon("");
		ImageIcon Image8 = new ImageIcon("");
		ImageIcon Image9 = new ImageIcon("");
		ImageIcon Image0 = new ImageIcon("");



			
		button0  = new JButton();
		button0.setBounds(0,240,240,80);
		button0.addActionListener(this);
		button0.setText("0");
		button0.setFocusable(false);// cancels the square around the text 
		button0.setIcon(Image0);

		button1  = new JButton();
		button1.setBounds(0,160,80,80);
		button1.addActionListener(this);
		button1.setText("1");
		button1.setFocusable(false);// cancels the square around the text 
		button1.setIcon(Image1);

		button2  = new JButton();
		button2.setBounds(80,160,80,80);
		button2.addActionListener(this);
		button2.setText("2");
		button2.setFocusable(false);// cancels the square around the text 
		button2.setIcon(Image2);

		button3  = new JButton();
		button3.setBounds(160,160,80,80);
		button3.addActionListener(this);
		button3.setText("3");
		button3.setFocusable(false);// cancels the square around the text 
		button3.setIcon(Image3);

		button4  = new JButton();
		button4.setBounds(0,80,80,80);
		button4.addActionListener(this);
		button4.setText("4");
		button4.setFocusable(false);// cancels the square around the text 
		button4.setIcon(Image4);

		button5  = new JButton();
		button5.setBounds(80,80,80,80);
		button5.addActionListener(this);
		button5.setText("5");
		button5.setFocusable(false);// cancels the square around the text 
		button5.setIcon(Image5);

		button6  = new JButton();
		button6.setBounds(160,80,80,80);
		button6.addActionListener(this);
		button6.setText("6");
		button6.setFocusable(false);// cancels the square around the text 
		button6.setIcon(Image6);

		button7  = new JButton();
		button7.setBounds(0,0,80,80);
		button7.addActionListener(this);
		button7.setText("7");
		button7.setFocusable(false);// cancels the square around the text 
		button7.setIcon(Image7);

		button8  = new JButton();
		button8.setBounds(80,0,80,80);
		button8.addActionListener(this);
		button8.setText("8");
		button8.setFocusable(false);// cancels the square around the text 
		button8.setIcon(Image8);

		button9  = new JButton();
		button9.setBounds(160,0,80,80);
		button9.addActionListener(this);
		button9.setText("9");
		button9.setFocusable(false);// cancels the square around the text 
		button9.setIcon(Image9);

		JPanel numPanel = new JPanel();// 
		numPanel.setLayout(null);
		numPanel.setBounds(0,140,240,330);
		numPanel.add(button0);
		numPanel.add(button1);
		numPanel.add(button2);
		numPanel.add(button3);
		numPanel.add(button4);
		numPanel.add(button5);
		numPanel.add(button6);
		numPanel.add(button7);
		numPanel.add(button8);
		numPanel.add(button9);
		numPanel.setBackground(Color.black);
		numPanel.setOpaque(true);
		numPanel.setVisible(true);

		plusButton = new JButton();
		plusButton.setBounds(0,0,80,80);// setting the x y locatio in frame and the size of the button 
		plusButton.addActionListener(this); // inserting the listener to the button 
		plusButton.setText("+");// sets the text 
		plusButton.setFocusable(false);// cancels the square around the text 
		plusButton.setIcon(plusImage);
		plusButton.setBackground(Color.LIGHT_GRAY);


		MinusButton = new JButton();
		MinusButton.setBounds(80,0,80,80);
		MinusButton.addActionListener(this);
		MinusButton.setText("-");
		MinusButton.setFocusable(false);// cancels the square around the text 
		MinusButton.setIcon(MinusImage);
		MinusButton.setBackground(Color.LIGHT_GRAY);


		divideButton = new JButton();
		divideButton.setBounds(0,80,80,80);
		divideButton.addActionListener(this);
		divideButton.setText("/");
		divideButton.setFocusable(false);// cancels the square around the text 
		divideButton.setIcon(divideImage); 
		divideButton.setBackground(Color.LIGHT_GRAY);

		MultiplyButton = new JButton();
		MultiplyButton.setBounds(80,80,80,80);
		MultiplyButton.addActionListener(this);
		MultiplyButton.setText("*");
		MultiplyButton.setFocusable(false);// cancels the square around the text 
		MultiplyButton.setIcon(MultiplyImage);
		MultiplyButton.setBackground(Color.LIGHT_GRAY);

		sqrtButton = new JButton();
		sqrtButton.setBounds(0,160,80,80);
		sqrtButton.addActionListener(this);
		sqrtButton.setText("SQRT");
		sqrtButton.setFocusable(false);// cancels the square around the text 
		sqrtButton.setIcon(sqrtImage);
		sqrtButton.setBackground(Color.LIGHT_GRAY);


		powButton = new JButton();
		powButton.setBounds(80,160,80,80);
		powButton.addActionListener(this);
		powButton.setText("X**");
		powButton.setFocusable(false);// cancels the square around the text 
		powButton.setIcon(powImage);
		powButton.setBackground(Color.LIGHT_GRAY);


		powByTwoButton = new JButton();
		powByTwoButton.setBounds(0,240,80,80);
		powByTwoButton.addActionListener(this);
		powByTwoButton.setText("X**2");
		powByTwoButton.setFocusable(false);// cancels the square around the text 
		powByTwoButton.setIcon(powByTwoImage);
		powByTwoButton.setBackground(Color.LIGHT_GRAY);


		logButton = new JButton();
		logButton.setBounds(80,240,80,80);
		logButton.addActionListener(this);
		logButton.setText("Log");
		logButton.setFocusable(false);// cancels the square around the text 
		logButton.setIcon(logImage);
		logButton.setBackground(Color.LIGHT_GRAY);

		EqualButton = new JButton();
		EqualButton.setBounds(160,0,85,320);
		EqualButton.addActionListener(this);
		EqualButton.setText("=");
		EqualButton.setFocusable(false);// cancels the square around the text 
		EqualButton.setIcon(MultiplyImage);
		EqualButton.setBackground(Color.LIGHT_GRAY);

		JPanel operatorsPanel = new JPanel();
		operatorsPanel.setLayout(null);
		operatorsPanel.setBounds(240,140,245,330);
		operatorsPanel.add(plusButton);
		operatorsPanel.add(MinusButton);
		operatorsPanel.add(divideButton);
		operatorsPanel.add(MultiplyButton);
		operatorsPanel.add(sqrtButton);
		operatorsPanel.add(powButton);
		operatorsPanel.add(powByTwoButton);
		operatorsPanel.add(logButton);
		operatorsPanel.add(EqualButton);
		operatorsPanel.setVisible(true);


		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(null);
		displayPanel.setBounds(0,0,500,140);
		JTextField input = new JTextField();
		input.setText(strnum);
		displayPanel.add(input);
		displayPanel.setVisible(true);
		
		
		
		
		this.add(displayPanel);
		this.add(operatorsPanel);
		this.add(numPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(500,490);
		this.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strnum = "";
		if (e.getSource()== plusButton) {
			System.out.println("plus button");			
		}
		if (e.getSource()== MinusButton) {
			System.out.println("minus button");	
		}
		if (e.getSource()== divideButton) {
			System.out.println("divide button");	
		}
		if (e.getSource()== MultiplyButton) {
			System.out.println("multiply button");	
		}
		if (e.getSource()== sqrtButton) {
			System.out.println("squre root button");	
		}
		if (e.getSource()== powButton) {
			System.out.println("power button");	
		}
		if (e.getSource()== powByTwoButton) {
			System.out.println("power by two button");	
		}
		if (e.getSource()== logButton) {
			System.out.println("log button");	
		}
		if (e.getSource()== EqualButton) {
			System.out.println("Equal button");	
		}
		if (e.getSource()== button1) {
			strnum = strnum+"1";
			System.out.println("1");
		}
		if (e.getSource()== button2) {
			strnum = strnum+"2";
			System.out.println("2");

		}
		if (e.getSource()== button3) {
			strnum = strnum+"3";
			System.out.println("3");

		}
		if (e.getSource()== button4) {
			strnum = strnum+"4";
			System.out.println("4");

		}
		if (e.getSource()== button5) {
			strnum = strnum+"5";
			System.out.println("5");

		}
		if (e.getSource()== button6) {
			strnum = strnum+"6";
			System.out.println("6");
		}
		if (e.getSource()== button7) {
			strnum = strnum+"7";
			System.out.println("7");
		}
		if (e.getSource()== button8) {
			strnum = strnum+"8";
			System.out.println("8");
		}
		if (e.getSource()== button9) {
			strnum = strnum+"9";
			System.out.println("9");
		}
		if (e.getSource()== button0) {
			strnum = strnum+"0";
			System.out.println("0");
		}

	}

}
