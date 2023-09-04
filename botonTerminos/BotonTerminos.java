package botonTerminos;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;

public class BotonTerminos extends JFrame implements ActionListener, ChangeListener{

	private JCheckBox check1,check2,check3;
	private JLabel label1;
	private JButton boton1;
	
	public BotonTerminos ()
	{
		setLayout(null);
		setTitle("Terminos y condiciones");
		
		label1=new JLabel("Terminos y condiciones de uso");
		label1.setBounds(200,40,300,20);
		add(label1);
		
		check1=new JCheckBox("Estoy de acuerdo");
		check1.setBounds(200,100,200,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1=new JButton("Aceptar");
		boton1.setBounds(200,180,100,40);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		
	}
	
	public void stateChanged(ChangeEvent e) 
	{
		
		if(check1.isSelected())
		{
			boton1.setEnabled(true);
			System.out.println("Selecionado");
		}else {
			boton1.setEnabled(false);
			System.out.println("No Selecionado");
		}
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==boton1)
		{
			System.out.println("Gracias por aceptar terminos y condiciones");
			label1.setText("Gracias por aceptar terminos y condiciones");
			System.exit(0);
		
		}
		
	}

	

	public static void main (String [] arg)
	{
		BotonTerminos  ventana=new BotonTerminos();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
