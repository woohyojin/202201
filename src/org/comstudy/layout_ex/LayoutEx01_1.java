package org.comstudy.layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import org.comstudy.guiex.myframe.MyFrame;

public class LayoutEx01_1 extends MyFrame {

	public Button btn1 = new Button("BTN1");
	public Button btn2 = new Button("BTN2");
	public Button btn3 = new Button("BTN3");
	public Button btn4 = new Button("BTN4");
	public Button btn5 = new Button("BTN5");

	public LayoutEx01_1() {
		super("기본 배치관리자 연습", 500, 500);

		 GridLayoutEx();
		// GridBagLayoutEx();
		// FlowLayoutEx();
		// BorderLayoutEx();

	}

	public void BorderLayoutEx() {
		add(BorderLayout.EAST, btn1);
		add(BorderLayout.NORTH, btn2);
		add(BorderLayout.SOUTH, btn3);
		add(BorderLayout.WEST, btn4);
		add(BorderLayout.CENTER, btn5);

	}

	public void FlowLayoutEx() {
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);

	}

	public void GridBagLayoutEx() {
		this.setLayout(new GridBagLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);

	}

	public void GridLayoutEx() {
		this.setLayout(new GridLayout(2, 2, 10, 10));
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);

	}

	public static void main(String[] args) {
		new LayoutEx01_1().setVisible(true);

	}

}
