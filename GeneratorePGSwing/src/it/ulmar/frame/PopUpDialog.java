package it.ulmar.frame;

import java.awt.Toolkit;

import javax.swing.JPanel;

public class PopUpDialog extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PopUpDialog(){
		setLocation();
	}
	
	private void setLocation(){
		int larghezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int altezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		setLocation((int)((larghezza/2) - (getWidth()/2)), (int)((altezza/2) - (getHeight()/2)));
	}

}
