package submenusPantalla;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class SubmenusOpciones extends JFrame implements ActionListener {
	
	private JMenuBar   menubar1;
	private JMenu      menu1,menu2,menu3;
	private JMenuItem  menuitem1,menuitem2,menuitem3,menuitem4;


	public SubmenusOpciones  ()
	{
		setLayout(null);
		setTitle("Submenus");
		
		menubar1=new JMenuBar();
		setJMenuBar(menubar1);
		
		menu1=new JMenu("Configuracion");
		menubar1.add(menu1);
		
		menu2=new JMenu("Tamaño de la pantalla");
		menu1.add(menu2);
		
		menu3=new JMenu("Color");
		menu1.add(menu3);
		
		menuitem1=new JMenuItem("300x200");
		menuitem1.addActionListener(this);
		menu2.add(menuitem1);
		
		menuitem2=new JMenuItem("600x400");
		menuitem2.addActionListener(this);
		menu2.add(menuitem2);

		
		menuitem3=new JMenuItem("rojo");
		menuitem3.addActionListener(this);
		menu3.add(menuitem3);
		
		menuitem4=new JMenuItem("azul");
		menuitem4.addActionListener(this);
		menu3.add(menuitem4);
		
	
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==menuitem1)
		{
			System.out.println("Tamaño de la pantalla de 300x200");
			setSize(300,200);
		}
		else if (e.getSource()==menuitem2) 
		{
			System.out.println("Tamaño de la pantalla de 600x400");
			setSize(600,400);
		}
		else if (e.getSource()==menuitem3) 
		{
			System.out.println("color rojo");
			getContentPane().setBackground(new Color(255, 0, 0));
		}
		else if (e.getSource()==menuitem4) 
		{
			System.out.println("color azul");
			getContentPane().setBackground(new Color(0, 0, 255));
		}
		
	}
	

	public static void main (String [] arg)
	{
		SubmenusOpciones  ventana=new SubmenusOpciones();
		ventana.setBounds(0,0,500,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}
	

}
