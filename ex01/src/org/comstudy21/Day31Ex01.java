package org.comstudy21;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Day31Ex01 {

	public static void main(String[] args) {
		// 프레임 실행
		// 1. 단독으로 생성하기 / 상속을 받아서 생성하기
		// 2. 상속을 받아서 생성하기
		Frame frame = new Frame();
		
		frame.setLayout(new FlowLayout());
		
		frame.add(new Label("Hello : "));
		frame.add(new Button("WORLD"));
		
		frame.setSize(640,480);
		frame.setVisible(true);

	}

}
