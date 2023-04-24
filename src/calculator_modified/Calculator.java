package calculator_modified;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JPanel buttonPanel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton subButton;
	JButton addButton, clearButton;
	boolean isOperatorClicked=false;
	String oldValue;
	String operator;
	
	public Calculator(){
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 100);
		
		displayLabel = new JLabel("", SwingConstants.RIGHT);
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBackground(Color.lightGray);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30,130,80,60);
		sevenButton.setFont(new Font("Arial", Font.PLAIN,20));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton = new JButton("8");
		eightButton.setBounds(120,130,80,60);
		eightButton.setFont(new Font("Arial", Font.PLAIN,20));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(210,130,80,60);
		nineButton.setFont(new Font("Arial", Font.PLAIN,20));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30,210,80,60);
		fourButton.setFont(new Font("Arial", Font.PLAIN,20));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120,210,80,60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN,20));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(210,210,80,60);
		sixButton.setFont(new Font("Arial", Font.PLAIN,20));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30,290,80,60);
		oneButton.setFont(new Font("Arial", Font.PLAIN,20));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120,290,80,60);
		twoButton.setFont(new Font("Arial", Font.PLAIN,20));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(210,290,80,60);
		threeButton.setFont(new Font("Arial", Font.PLAIN,20));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(30,380,80,60);
		dotButton.setFont(new Font("Arial", Font.PLAIN,20));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(120,380,80,60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN,20));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(210,380,80,60);
		equalButton.setFont(new Font("Arial", Font.PLAIN,20));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(320,130,80,60);
		divButton.setFont(new Font("Arial", Font.PLAIN,20));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton = new JButton("*");
		mulButton.setBounds(320,210,80,60);
		mulButton.setFont(new Font("Arial", Font.PLAIN,20));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		subButton = new JButton("-");
		subButton.setBounds(320,290,80,60);
		subButton.setFont(new Font("Arial", Font.PLAIN,20));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton = new JButton("+");
		addButton.setBounds(320,380,80,60);
		addButton.setFont(new Font("Arial", Font.PLAIN,20));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(420,380,80,60);
		clearButton.setFont(new Font("Arial", Font.PLAIN,15));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//jf.getContentPane().setBackground(Color.BLUE);
		
		if (e.getSource() == sevenButton) {
	        displayLabel.setText(displayLabel.getText() + "7");
	    } else if (e.getSource() == eightButton) {
	        displayLabel.setText(displayLabel.getText() + "8");
	    } else if (e.getSource() == nineButton) {
	        displayLabel.setText(displayLabel.getText() + "9");
	    } else if (e.getSource() == fourButton) {
	        displayLabel.setText(displayLabel.getText() + "4");
	    } else if (e.getSource() == fiveButton) {
	        displayLabel.setText(displayLabel.getText() + "5");
	    } else if (e.getSource() == sixButton) {
	        displayLabel.setText(displayLabel.getText() + "6");
	    } else if (e.getSource() == oneButton) {
	        displayLabel.setText(displayLabel.getText() + "1");
	    } else if (e.getSource() == twoButton) {
	        displayLabel.setText(displayLabel.getText() + "2");
	    } else if (e.getSource() == threeButton) {
	        displayLabel.setText(displayLabel.getText() + "3");
	    } else if (e.getSource() == dotButton) {
	        displayLabel.setText(displayLabel.getText() + ".");
	    } else if (e.getSource() == zeroButton) {
	        displayLabel.setText(displayLabel.getText() + "0");
	    }
		
		
	    else if (e.getSource() == divButton) {
	        operator = "/";
	        oldValue = displayLabel.getText();
	        displayLabel.setText("");
	        isOperatorClicked = true;
	    } else if (e.getSource() == mulButton) {
	        operator = "*";
	        oldValue = displayLabel.getText();
	        displayLabel.setText("");
	        isOperatorClicked = true;
	    } else if (e.getSource() == subButton) {
	        operator = "-";
	        oldValue = displayLabel.getText();
	        displayLabel.setText("");
	        isOperatorClicked = true;
	    } else if (e.getSource() == addButton) {
	        operator = "+";
	        oldValue = displayLabel.getText();
	        displayLabel.setText("");
	        isOperatorClicked = true;
	    } else if (e.getSource() == equalButton) {
	        double newValue = Double.parseDouble(displayLabel.getText());
	        double result = 0;
	        if (operator.equals("/")) {
	            result = Double.parseDouble(oldValue) / newValue;
	        } else if (operator.equals("*")) {
	            result = Double.parseDouble(oldValue) * newValue;
	        } else if (operator.equals("-")) {
	            result = Double.parseDouble(oldValue) - newValue;
	        } else if (operator.equals("+")) {
	            result = Double.parseDouble(oldValue) + newValue;
	        }
	        displayLabel.setText(String.valueOf(result));
	        isOperatorClicked = false;
	    } else if (e.getSource() == clearButton) {
	        displayLabel.setText("");
	        isOperatorClicked = false;
	    }

}
}
