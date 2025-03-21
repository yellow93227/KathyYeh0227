package jFrameDemo;

import javax.swing.*;	//載入swing套件

class MyJFrame  extends JFrame{
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		setBounds(100, 100, 450, 300);                         
		setTitle("JFrame視窗");  
		setVisible(true);       		
	}
}

public class JFrameDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
