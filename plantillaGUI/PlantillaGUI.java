package plantillaGUI;

import javax.swing.*;

public class PlantillaGUI  extends JFrame{
	
	public PlantillaGUI ()
	{
		setLayout(null);
		setTitle("Plantilla GUI");

		
	}

	

	public static void main (String [] arg)
	{
		PlantillaGUI ventana=new PlantillaGUI();
		ventana.setBounds(0,0,600,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}


}
