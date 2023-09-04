package botonesEtiqueta;

import java.awt.event.*;

import javax.swing.*;



public class BotonesEtiqueta extends JFrame implements ActionListener {
	private JButton boton1,boton2,boton3;
	private JLabel  label1;
	
	public BotonesEtiqueta() 
	{
		setLayout(null);
		
		boton1=new JButton("Atras");
		boton1.setBounds(300,40,200,70);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2=new JButton("Ingreso");
		boton2.setBounds(300,140,200,70);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3=new JButton("Adelante");
		boton3.setBounds(300,240,200,70);
		add(boton3);
		boton3.addActionListener(this);
		
		label1=new JLabel("En espera....");
		label1.setBounds(40,120,100,100);
		add(label1);
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==boton1)
		{
		    label1.setText("Atras");
			System.out.println("Usted presiono el boton 1");
			
		}
		else if (e.getSource()==boton2) 
		{
			label1.setText("Ingreso");
			System.out.println("Usted presiono el boton 2");
		}
		else if (e.getSource()==boton3) 
		{
			label1.setText("Adelante");
			System.out.println("Usted presiono el boton 3");
		}

	}
	

	public static void main (String [] arg )
	{
		BotonesEtiqueta ventana=new BotonesEtiqueta();
		ventana.setBounds(0,0,800,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);

	}

}
