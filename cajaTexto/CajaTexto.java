package cajaTexto;

import java.awt.event.*;
import javax.swing.*;


public class CajaTexto extends JFrame implements ActionListener
{
	private JLabel label1;
	private JButton boton1;
	private JTextField texto1;

	public CajaTexto() 
	{
        setLayout(null);
		
		boton1=new JButton("Ingresar");
		boton1.setBounds(300,170,200,70);
		add(boton1);
		boton1.addActionListener(this);
		
		label1=new JLabel("Usuario: ");
		label1.setBounds(70,40,100,100);
		add(label1);
		
		texto1=new JTextField( );
		texto1.setBounds(200,40,200,100);
		add(texto1);
		
		
	
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==boton1)
		{
			String datos=texto1.getText();
			System.out.println("Usted presiono el boton 1 : "+ datos);
			setTitle(datos);
			
		}
		
	}
	
	public static void main (String []arg)
	{
		CajaTexto ventana=new CajaTexto();
		ventana.setBounds(0,0,800,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
