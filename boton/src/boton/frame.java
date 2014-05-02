package boton;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class frame extends JFrame{
	public frame(){
		setTitle("Red de Ordenamiento");
		setSize(900,500);
		Container contentpane=getContentPane();
		JPanel panel= new JPanel();
		panel.setLayout(null);
		JButton boton = new JButton();
		boton.setBounds(30,100,30,30);
		panel.add(boton);
		contentpane.add(panel);
		//panel.setBackground(Color.green);
	}

}
