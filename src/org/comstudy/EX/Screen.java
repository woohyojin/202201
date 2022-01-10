package org.comstudy.EX;

import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.font.TextLayout;

import javax.swing.border.Border;

import java.awt.TextArea;

import org.comstudy.guiex.myframe.MyFrame;

public class Screen extends MyFrame {
	TextField tf1;
	TextField tf2;
	TextField tf3;
	TextField tf4;

	Panel southPan = new Panel(new FlowLayout());
	Panel westPan = new Panel(new GridLayout(4, 2, 5, 5));
	Panel centerPan = new Panel(new FlowLayout());
	Label Lb1 = new Label("번호");
	Label Lb2 = new Label("이름");
	Label Lb3 = new Label("이메일");
	Label Lb4 = new Label("전화번호");

	Button btn1 = new Button("전체보기");
	Button btn2 = new Button("추가");
	Button btn3 = new Button("삭제");
	Button btn4 = new Button("검색");
	Button btn5 = new Button("취소");

	TextArea area = new TextArea("", 10, 10, 2);

	public Screen() {
		FlowLayoutEx();
		GridLayoutEx();
		CenterEx();

	}

	public void CenterEx() {
		add(BorderLayout.CENTER, centerPan);
		centerPan.add(area);
	}

	public void GridLayoutEx() {
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);
		tf4 = new TextField(20);

		westPan.add(Lb1);
		westPan.add(tf1);
		westPan.add(Lb2);
		westPan.add(tf2);
		westPan.add(Lb3);
		westPan.add(tf3);
		westPan.add(Lb4);
		westPan.add(tf4);
		this.add(BorderLayout.WEST, westPan);

	}

	public void FlowLayoutEx() {
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(btn3);
		southPan.add(btn4);
		southPan.add(btn5);
		this.add(BorderLayout.SOUTH, southPan);

	}

	public static void main(String[] args) {
		new Screen().setVisible(true);

	}

}
