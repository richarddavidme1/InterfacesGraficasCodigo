package areaTexto;

import javax.swing.*;


public class AreaTexto extends JFrame{
	
	private JTextArea area1;
	
	public AreaTexto()
	{
		setLayout(null);
		area1=new JTextArea();
		area1.setBounds(10,10,200,300);
		add(area1);
	}
	
	public static void main(String[] args) 
	{
		AreaTexto ventana=new AreaTexto();
		ventana.setBounds(0,0,800,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
