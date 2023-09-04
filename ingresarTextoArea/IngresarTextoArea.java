package ingresarTextoArea;

import java.awt.event.*;

import javax.swing.*;

import scrollTexto.ScrollTexto;

public class IngresarTextoArea extends JFrame implements ActionListener{
	private JTextArea area1;
	private JTextField texto1;
	private JScrollPane panel1;
	private JButton boton1;
	
	String ingreso="";
	
	public IngresarTextoArea()
	{
		setLayout(null);
		
		texto1=new JTextField( );
		texto1.setBounds(10,10,100,30);
		add(texto1);
		
		boton1=new JButton("Ingresar");
		boton1.setBounds(300,40,200,70);
		add(boton1);
		boton1.addActionListener(this);
		
		area1=new JTextArea();
		panel1=new JScrollPane(area1);
		panel1.setBounds(10,70,200,270);
		add(panel1);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==boton1)
		{
			ingreso +=texto1.getText() + "\n";
			area1.setText(ingreso);
			texto1.setText("");
			System.out.println("Usted presiono el boton 1: "+ ingreso);
			
		}
		
	}
	public static void main (String [] arg)
	{
		IngresarTextoArea ventana=new IngresarTextoArea();
		ventana.setBounds(0,0,800,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
