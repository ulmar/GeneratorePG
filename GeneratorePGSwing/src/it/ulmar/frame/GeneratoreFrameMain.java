package it.ulmar.frame;

import it.ulmar.frame.interfacce.GeneratoreInterface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JDialog;

public class GeneratoreFrameMain extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private URL URL;
	private Image image;
	private GeneratoreInterface GENERATORE;
	private GeneratoreView VIEW;
	
	public GeneratoreFrameMain(){
		
	}
	
	public GeneratoreFrameMain(String s){
		GENERATORE = new Generatore();
		VIEW = new GeneratoreView(GENERATORE);
		setTitle(s);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(VIEW, BorderLayout.CENTER);
		c.add(new ExitButton(), BorderLayout.SOUTH);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		pack();
		setLocation();
		URL = ClassLoader.getSystemResource("it/ulmar/images/logo.gif");
		image = Toolkit.getDefaultToolkit().getImage(URL);
		setIconImage(image);
	}
	
	private void setLocation(){
		int larghezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int altezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		setLocation((int)((larghezza/2) - (getWidth()/2)), (int)((altezza/2) - (getHeight()/2)));
	}

}
