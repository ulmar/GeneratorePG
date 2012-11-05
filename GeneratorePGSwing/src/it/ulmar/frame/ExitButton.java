package it.ulmar.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ExitButton () {
		super("Exit");
		addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
