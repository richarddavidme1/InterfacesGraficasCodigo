package botonrgb;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class BotonRGB extends JFrame implements ActionListener {
	
    private JComboBox  listado1,listado2,listado3;
	private JButton    boton1;
	private JLabel     label1,label2,label3;

	
	public BotonRGB  ()
	{
		setLayout(null);
		setTitle("Codigo RGB");
		
		label1=new JLabel("Valor de R:");
		label1.setBounds(100,10,100,30);
		add(label1);
		
		listado1=new JComboBox();
		listado1.setBounds(260,10,100,30);
		for(int i=0; i<=255;i++)
		{
			listado1.addItem(String.valueOf(i));
			
		}
		add(listado1);
		
		label2=new JLabel("Valor de G:");
		label2.setBounds(100,100,100,30);
		add(label2);
		
		listado2=new JComboBox();
		listado2.setBounds(260,100,100,30);
		
		for(int i=0; i<=255;i++)
		{
			listado2.addItem(String.valueOf(i));
			
		}
		add(listado2);
		
		label3=new JLabel("Valor de B:");
		label3.setBounds(100,200,100,30);
		add(label3);
		
		listado3=new JComboBox();
		listado3.setBounds(260,200,100,30);
		
		for(int i=0; i<=255;i++)
		{
			listado3.addItem(String.valueOf(i));
			
		}
		add(listado3);
		
		boton1=new JButton("Colores");
		boton1.setBounds(140,260,200,70);
		add(boton1);
		boton1.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==boton1)
		{
			String datolista1=listado1.getSelectedItem().toString();
			String datolista2=listado2.getSelectedItem().toString();
			String datolista3=listado3.getSelectedItem().toString();
			
			int rojo  = Integer.parseInt(datolista1);
			int verde = Integer.parseInt(datolista2);
			int azul  = Integer.parseInt(datolista3);
			
			Color colorrgb=new Color(rojo,verde,azul);
			boton1.setBackground(colorrgb);
			
		}
		
	}
	


	public static void main (String [] arg)
	{
		BotonRGB  ventana=new BotonRGB();
		ventana.setBounds(0,0,500,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
