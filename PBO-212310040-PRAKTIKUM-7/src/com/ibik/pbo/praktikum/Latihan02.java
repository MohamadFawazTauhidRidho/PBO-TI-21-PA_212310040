package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Latihan02 extends JFrame {
	Latihan02() {
		setTitle("Latihan 02");
		setVisible(true);
		pack();
		setSize(350,450);
		setLocationRelativeTo(null);
		setResizable(false);
		GenerateUI(this);
		
	}
	public static void main(String args[]) {
		new Latihan02();
	}
	
	private void GenerateUI(JFrame frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
		
		JLabel fullName = new JLabel("Fullname");
		fullName.setBounds(25, 20, 80, 30);
		frame.add(fullName, BorderLayout.WEST);
		
		JTextField textFullName = new JTextField();
		textFullName.setBounds(100, 20, 160, 30);
		frame.add(textFullName);
		
		JLabel email = new JLabel("email");
		email.setBounds(20, 75, 80, 30);
		frame.add(email, BorderLayout.WEST);
		
		JTextField textEmail = new JTextField();
		textEmail.setBounds(100, 75, 160, 30);
		frame.add(textEmail);
		
		JLabel phone = new JLabel("phone");
		phone.setBounds(20, 130, 80, 30);
		frame.add(phone, BorderLayout.WEST);
		
		JTextField textPhone = new JTextField();
		textPhone.setBounds(100, 130, 160, 30);
		frame.add(textPhone);
		
		JLabel gender = new JLabel("gender");
		gender.setBounds(20,175, 80, 30);
		frame.add(gender, BorderLayout.WEST);
		
		JRadioButton radioGender1 = new JRadioButton("female");
		radioGender1.setBounds(105, 175, 100, 30);
		frame.add(radioGender1);
		
		JRadioButton radioGender2 = new JRadioButton("male");
		radioGender2.setBounds(200, 175, 100, 30);
		frame.add(radioGender2);
		
		JLabel citizenship = new JLabel("citizenship");
		citizenship.setBounds(20, 215, 80, 30);
		frame.add(citizenship, BorderLayout.WEST);
		
		String country[] = {"Indonesia", "India", "Australia", "Japan", "USA"};
		JComboBox<String> selectCitizen = new JComboBox<String>(country);
		selectCitizen.setBounds(100, 215, 169, 30);
		frame.add(selectCitizen);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(100, 260, 169, 30);
		frame.add(submit);
		
		frame.setLayout(null);
	}
}