package menusOpciones;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MenuOpciones extends JFrame implements ActionListener{
	private JMenuBar   menubar1;
	private JMenu      menu1,menu2,menu3;
	private JMenuItem  menuitem1,menuitem2,menuitem3;


	public MenuOpciones  ()
	{
		setLayout(null);
		setTitle("Menus");
		
		menubar1=new JMenuBar();
		setJMenuBar(menubar1);
		
		menu1=new JMenu("Opciones");
		menu2=new JMenu("Configuracion");
		menu3=new JMenu("Ayuda");
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);
		
		menuitem1=new JMenuItem("rojo");
		menuitem1.addActionListener(this);
		menu1.add(menuitem1);
		
		menuitem2=new JMenuItem("azul");
		menuitem2.addActionListener(this);
		menu1.add(menuitem2);
		
		menuitem3=new JMenuItem("verde");
		menuitem3.addActionListener(this);
		menu1.add(menuitem3);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Container fondo=this.getContentPane();
		if(e.getSource()==menuitem1)
		{
			System.out.println("color rojo");
			fondo.setBackground(new Color(255, 0, 0));
		}
		else if (e.getSource()==menuitem2) 
		{
			System.out.println("color azul");
			fondo.setBackground(new Color(0, 0, 255));
		}
		else if (e.getSource()==menuitem3) 
		{
			System.out.println("color verde");
			fondo.setBackground(new Color (0, 255, 0));
		}
		
	}
	

	public static void main (String [] arg)
	{
		MenuOpciones  ventana=new MenuOpciones();
		ventana.setBounds(0,0,500,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}
	
	

}
