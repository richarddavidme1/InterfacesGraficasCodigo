package boton;
import javax.swing.*;
import java.awt.event.*;


public class BotonFuncionamiento extends JFrame implements ActionListener {
	
	JButton boton1;
	
	public BotonFuncionamiento() 
	{
		//Para agregar coordenadas
		setLayout(null);
		boton1=new JButton("Salir");
		//x.y,largo,ancho
		boton1.setBounds(300,240,200,70);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==boton1)
		{
			System.out.println("Usted presiono el boton");
			System.out.println("Saliendo del sistema");
			System.exit(0);
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		BotonFuncionamiento ventana=new BotonFuncionamiento();
		ventana.setBounds(0,0,700,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);

	}

}
