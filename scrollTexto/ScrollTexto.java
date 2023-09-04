package scrollTexto;

import javax.swing.*;


public class ScrollTexto extends JFrame{
	private JTextArea area1;
	private JTextField texto1;
	private JScrollPane panel1;
	
	public ScrollTexto()
	{
		setLayout(null);
		
		texto1=new JTextField( );
		texto1.setBounds(10,10,100,30);
		add(texto1);
		
		area1=new JTextArea();
		panel1=new JScrollPane(area1);
		panel1.setBounds(10,70,200,270);
		add(panel1);
		
		
	}
	
	public static void main(String[] args) 
	{
		ScrollTexto ventana=new ScrollTexto();
		ventana.setBounds(0,0,800,400);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}

}
