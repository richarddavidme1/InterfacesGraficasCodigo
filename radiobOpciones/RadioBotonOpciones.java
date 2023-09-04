package radiobOpciones;

import javax.swing.*;
import javax.swing.event.*;



public class RadioBotonOpciones extends JFrame implements ChangeListener{
	
	private JRadioButton radiobt1,radiobt2,radiobt3;
	private ButtonGroup  btgrupo1;
	
	public RadioBotonOpciones ()
	{
		setLayout(null);
		setTitle("Radio Boton");
		
		btgrupo1=new ButtonGroup();
		
		radiobt1=new JRadioButton("300x200");
		radiobt1.setBounds(200,20,200,30);
		radiobt1.addChangeListener(this);
		add(radiobt1);
		btgrupo1.add(radiobt1);
		
		radiobt2=new JRadioButton("400x500");
		radiobt2.setBounds(200,110,200,30);
		radiobt2.addChangeListener(this);
		add(radiobt2);
		btgrupo1.add(radiobt2);
		
		radiobt3=new JRadioButton("800x700");
		radiobt3.setBounds(200,200,200,30);
		radiobt3.addChangeListener(this);
		add(radiobt3);
		btgrupo1.add(radiobt3);
		
	}
	
	public void stateChanged(ChangeEvent e) 
	{
		
		if(radiobt1.isSelected())
		{
			System.out.println("Pantalla de 300x200");
			setSize(300,200);
		}
		if(radiobt2.isSelected())
		{
			System.out.println("Pantalla de 400x500");
			setSize(400,500);
		}
		if(radiobt3.isSelected())
		{
			System.out.println("Pantalla de 800x700");
			setSize(800,700);
		}
		
		
	}
	

	public static void main (String [] arg)
	{
		RadioBotonOpciones  ventana=new RadioBotonOpciones();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
