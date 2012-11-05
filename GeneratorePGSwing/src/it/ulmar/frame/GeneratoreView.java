package it.ulmar.frame;

import it.ulmar.frame.interfacce.GeneratoreInterface;
import it.ulmar.frame.interfacce.GeneratoreViewInterface;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class GeneratoreView extends JPanel implements GeneratoreViewInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GeneratoreInterface GENERATORE;
	private GeneratoreControl CONTROL;

	public GeneratoreView(){
		
	}
	
	public GeneratoreView(GeneratoreInterface generatoreInterface){
		super(new BorderLayout());
		GENERATORE = generatoreInterface;
		
		GeneratoreInput generatoreInput = new GeneratoreInput(true);
		add(generatoreInput, BorderLayout.PAGE_START);
		
		JPanel lastPanel = new JPanel();
		CONTROL = new GeneratoreControl(generatoreInput, this);
		lastPanel.add(CONTROL);
		add(lastPanel, BorderLayout.PAGE_END);
	}

}
