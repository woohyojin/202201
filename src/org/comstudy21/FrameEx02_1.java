package org.comstudy21;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEx02_1 extends Frame implements WindowListener {
	public FrameEx02_1() {
		setTitle("window 실습");
		setSize(500,500);
		setVisible(true);
		
		this.addWindowListener(this);
	}

	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("닫기 버튼을 눌러서 창 종료");
		dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	

	public static void main(String[] args) {
		new FrameEx02_1();
	}
}
