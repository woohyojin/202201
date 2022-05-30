package org.comstudy21;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventEx05 extends Frame{
	
	public FrameEventEx05() {
		setTitle("익명 내부 클래스를 활용한 이벤트 핸들러 구현");
		setSize(640, 480);
		setVisible(true);
		
		// 인터페이스를 구현 하면서 인스턴스 생성 가능(익명 내부클래스 객체)
		// 1회용으로 사용이 끝난다.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new FrameEventEx05();

	}

}
