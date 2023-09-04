package checkOpcion;

import javax.swing.*;
import javax.swing.event.*;;


public class CheckOpciones extends JFrame implements ChangeListener {
	
	private JCheckBox check1,check2,check3;
	
	public CheckOpciones ()
	{
		setLayout(null);
		//setTitle("Opciones");
		
		check1=new JCheckBox("Hamburguesa");
		check1.setBounds(260,10,100,30);
		check1.addChangeListener(this);
		add(check1);
		
		check2=new JCheckBox("Helado");
		check2.setBounds(260,100,100,30);
		check2.addChangeListener(this);
		add(check2);
		
		check3=new JCheckBox("Papas fritas");
		check3.setBounds(260,200,100,30);
		check3.addChangeListener(this);
		add(check3);

		
	}
	
	public void stateChanged(ChangeEvent e) 
	{
		String mensaje=" ";
		if(check1.isSelected())
		{
			mensaje=mensaje+"Hamburguesa-";
			System.out.println("El pedido añadio una hamburguesa");
		}
		if (check2.isSelected()) 
		{
			mensaje=mensaje+"Helado-";
			System.out.println("El pedido añadio un helado");
			
		}
		if (check3.isSelected()) 
		{
			mensaje=mensaje+"Papas fritas-";
			System.out.println("El pedido añadio papas fritas");
		}
		setTitle(mensaje);
		
	}

	

	public static void main (String [] arg)
	{
		CheckOpciones  ventana=new CheckOpciones();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}


}
