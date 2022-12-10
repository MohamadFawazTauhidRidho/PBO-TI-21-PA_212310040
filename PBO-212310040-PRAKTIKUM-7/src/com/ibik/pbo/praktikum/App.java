package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class App extends JFrame implements ActionListener{

	private JButton lat1;
	private JButton lat2;
	private JButton lat3;
	private JButton lat4;

	App() {
		setTitle("Menu Latihan");
		setVisible(true);
		pack();
		setSize(300, 120);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		GenerateUI(this);
	}

	public static void main(String[] args) {
		new App();
	}
	
	private void GenerateUI(App frame) {
		JPanel panel1 = new JPanel();
		lat1 = new JButton("Latihan 01");
		lat2 = new JButton("Latihan 02");
		
		panel1.add(lat1);
		panel1.add(lat2);
		
		JPanel panel2 = new JPanel();
		lat3 = new JButton("Latihan 03");
		lat4 = new JButton("Latihan 04");
		
		panel2.add(lat3);
		panel2.add(lat4);
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		
		lat1.addActionListener(this);
		lat2.addActionListener(this);
		lat3.addActionListener(this);
		lat4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lat1) {
			Latihan01.main(null);
		} else if(e.getSource() == lat2) {
			Latihan02.main(null);
		} else if(e.getSource() == lat3) {
			Latihan03.main(null);
		} else if(e.getSource() == lat4) {
			Latihan04.main(null);
		}
	}
	
	
}