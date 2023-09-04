package listasDesplegables;


import javax.swing.*;
import java.awt.event.*;

public class ListaDesplegable extends JFrame implements ItemListener {
	
	private JComboBox listado1;
	

	public ListaDesplegable ()
	{
		setLayout(null);
		listado1=new JComboBox();
		listado1.setBounds(260,10,100,30);
		add(listado1);
		
		listado1.addItem("rojo");
		listado1.addItem("verde");
		listado1.addItem("azul");
		listado1.addItem("blanco");
		listado1.addItem("negro");
		
		listado1.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==listado1)
		{
			String seleccionar=listado1.getSelectedItem().toString();
			setTitle(seleccionar);	
		}
	
	}
	

	public static void main (String [] arg)
	{
		ListaDesplegable  ventana=new ListaDesplegable();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
