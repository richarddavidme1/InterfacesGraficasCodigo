package Ventanas;

import javax.swing.*;

public class VentanasInterfaces extends JFrame {
	private JLabel label1;
	
	//Debe tener el mismo nombre de la clase VentanasInterfaces  en la funcion 
	public VentanasInterfaces() 
	{
		setLayout(null);
		label1=new JLabel("Interface Grafica de Usuario");
		label1.setBounds(0,0,200,300);
		add(label1);
	}
	
	public static void main(String[] args) {
		VentanasInterfaces formulario1=new VentanasInterfaces();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);

	}

}
