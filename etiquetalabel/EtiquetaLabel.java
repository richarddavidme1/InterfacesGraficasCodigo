package etiquetalabel;

import javax.swing.*;

public class EtiquetaLabel extends JFrame {
	
	private JLabel label1,label2;
	//constructor
	public EtiquetaLabel()
	{
		setLayout(null);
		label1=new JLabel("Vamos a darle");
		label1.setBounds(200,0,300,20);
		add(label1);
		label2=new JLabel("Se gano un Iphone 14");
		label2.setBounds(0,400,300,100);
		add(label2);
	}
	
	public static void main(String[] args) {
		EtiquetaLabel ventana=new EtiquetaLabel();
		ventana.setBounds(0,150,300,500);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);

		
	}

}
