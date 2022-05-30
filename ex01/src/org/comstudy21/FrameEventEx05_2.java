package org.comstudy21;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx05_2 extends Frame {
	public FrameEventEx05_2() {
		setTitle("~이벤트 처리 실습~");
		setSize(600, 600);
		setVisible(true);
		
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
		
	}

	public static void main(String[] args) {
		new FrameEventEx05_2();

	}

}
