package org.comstudy21;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx05_1 extends Frame {
	public FrameEventEx05_1() {
		setTitle("익명 내부 클래스를 활용");
		setSize(500, 500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new FrameEventEx05_1();

	}

}
