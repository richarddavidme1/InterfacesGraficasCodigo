package ventanas1;

import javax.swing.*;

public class Ventanas1 extends JFrame{
	
	//Constructor
	public Ventanas1() {
		setLayout(null);
	}
	public static void main(String[] args) {
		Ventanas1 interfaces=new Ventanas1();
		interfaces.setBounds(0,150,300,500);
		interfaces.setVisible(true);
		//Ubicar al centro de la pantalla siempre
		interfaces.setLocationRelativeTo(null);
		//Modificar tamaño de la ventana
		interfaces.setResizable(false);
		
	}
}
