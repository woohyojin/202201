package org.comstudy.EX;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.GridBagConstraints;

import org.comstudy.guiex.myframe.MyFrame;

public class Calculator extends MyFrame {
	
	
	public Button btn1 = new Button("MC");
	public Button btn2 = new Button("MR");
	public Button btn3 = new Button("MS");
	public Button btn4 = new Button("M+");
	public Button btn5 = new Button("M-");
	public Button btn6 = new Button("<");
	public Button btn7 = new Button("CE");
	public Button btn8 = new Button("C");
	public Button btn9 = new Button("±");
	public Button btn10 = new Button("√");
	public Button btn11 = new Button("7");
	public Button btn12 = new Button("8");
	public Button btn13 = new Button("9");
	public Button btn14 = new Button("/");
	public Button btn15 = new Button("%");
	public Button btn16 = new Button("4");
	public Button btn17 = new Button("5");
	public Button btn18 = new Button("6");
	public Button btn19 = new Button("*");
	public Button btn20 = new Button("1/x");
	public Button btn21 = new Button("1");
	public Button btn22 = new Button("2");
	public Button btn23 = new Button("3");
	public Button btn24 = new Button("-");
	public Button btn25 = new Button("0");
	public Button btn26 = new Button(".");
	public Button btn27 = new Button("+");
	public Button btn28 = new Button("=");

	public Calculator() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
	
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn2, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn3, gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn4, gbc);

		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn5, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn6, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn7, gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn8, gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn9, gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn10, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn11, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn12, gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn13, gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn14, gbc);

		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn15, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn16, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn17, gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn18, gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn19, gbc);

		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn20, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn21, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn22, gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn23, gbc);

		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn24, gbc);

		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		add(btn25, gbc);

		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn26, gbc);

		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(btn27, gbc);

		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		add(btn28, gbc);
		


	}

	public static void main(String[] args) {
		new Calculator().setVisible(true);

	}

}
