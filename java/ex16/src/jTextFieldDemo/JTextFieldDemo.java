package jTextFieldDemo;

import javax.swing.*; //���Jswing�M��

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txtCity, txtPhone;
	private JLabel lblCity, lblPhone, lblTitle;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setText("�x����");
		txtCity.setBounds(130, 65, 100, 25);
		contentPane.add(txtCity);

		txtPhone = new JTextField();
		txtPhone.setToolTipText("�п�J����q��");
		txtPhone.setColumns(10);
		txtPhone.setBounds(130, 110, 100, 25);
		contentPane.add(txtPhone);

		lblTitle = new JLabel("�ӤH��T");
		lblTitle.setBounds(50, 20, 100, 15);
		contentPane.add(lblTitle);

		lblCity = new JLabel("�~�����G");
		lblCity.setBounds(50, 70, 100, 15);
		contentPane.add(lblCity);

		lblPhone = new JLabel("����q�ܡG");
		lblPhone.setBounds(50, 115, 100, 15);
		contentPane.add(lblPhone);
		setVisible(true);
	}
}

public class JTextFieldDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
