package sumarIngreso;

import java.awt.event.*;

import javax.swing.*;

public class SumarIngreso extends JFrame implements ActionListener {
	
	
	private JTextField texto1,texto2;
	private JButton boton1;
	private JLabel  label1,label2,label3;
	
	String ingreso="";
	
	public SumarIngreso()
	{
		setLayout(null);
		
		texto1=new JTextField( );
		texto1.setBounds(260,10,100,30);
		add(texto1);
		
		label1=new JLabel("Valor 1: ");
		label1.setBounds(140,10,100,30);
		add(label1);
		
		texto2=new JTextField( );
		texto2.setBounds(260,100,100,30);
		add(texto2);
		
		label2=new JLabel("Valor 2: ");
		label2.setBounds(140,100,100,30);
		add(label2);
		
		boton1=new JButton("Ingresar");
		boton1.setBounds(70,170,200,70);
		add(boton1);
		boton1.addActionListener(this);
		
		label3=new JLabel("El resultado es : ");
		label3.setBounds(340,180,200,70);
		add(label3);
		
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==boton1)
		{
			int valor1=0,valor2=0,resultado=0;
			
			valor1=Integer.parseInt(texto1.getText());
			valor2=Integer.parseInt(texto2.getText());
			resultado=valor1+valor2;
			label3.setText("El resultado es :"+resultado);
			//texto1.setText("");
			//texto2.setText("");
			
		}
		
	}
	public static void main (String [] arg)
	{
		SumarIngreso ventana=new SumarIngreso();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
