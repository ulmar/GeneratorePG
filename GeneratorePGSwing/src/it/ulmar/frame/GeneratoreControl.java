package it.ulmar.frame;

import it.ulmar.dto.TransferDTO;
import it.ulmar.frame.interfacce.GeneratoreInterface;
import it.ulmar.frame.interfacce.GeneratoreViewInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GeneratoreControl extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton BUTTON_GENERA;
	private JButton BUTTON_RESET;
	private JButton BUTTON_INFO;
	private GeneratoreInput INPUT;
	private GeneratoreViewInterface VIEW;
	private GeneratoreInterface GENERATORE = new Generatore();
	private TransferDTO dto;
	
	private String TITOLO_MESSAGGIO_VUOTO = "ERROR!";
	private String TESTO_MESSAGGIO_VUOTO = "Uno o più campi sono vuoti";
	
	public GeneratoreControl(){
		
	}
	
	public GeneratoreControl(GeneratoreInput generatoreInput, GeneratoreViewInterface generatoreViewInterface){
		super(new GridLayout(1,3));
		
		INPUT = generatoreInput;
		VIEW = generatoreViewInterface;
		
		BUTTON_GENERA = new JButton("Genera PNG");
		BUTTON_RESET = new JButton("Reset");
		BUTTON_INFO = new JButton("?");
		
		
		BUTTON_GENERA.addActionListener(this);
		BUTTON_RESET.addActionListener(this);
		BUTTON_INFO.addActionListener(this);
		
		add(BUTTON_RESET);
		add(BUTTON_GENERA);
		add(BUTTON_INFO);
		
	}
	
	private void reset(){
		INPUT.resetCarisma();
		INPUT.resetClasse();
		INPUT.resetCostituzione();
		INPUT.resetDestrezza();
		INPUT.resetForza();
		INPUT.resetIntelligenza();
		INPUT.resetLivello();
		INPUT.resetNome();
		INPUT.resetPathToSave();
		INPUT.resetRazza();
		INPUT.resetSaggezza();
	}
	
	private void controlli(){
		
		int modIncremento;
		int forz;
		int des;
		int cos;
		int inte;
		int sag;
		int car;
		int livello;
		String nome;
		String pathToSave;
		
		try {
			nome = INPUT.getNome();
			if(nome == null || nome.equalsIgnoreCase("")){
				throw new RuntimeException();
			}
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new PopUpDialog(), TESTO_MESSAGGIO_VUOTO, TITOLO_MESSAGGIO_VUOTO, JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if (valorizzoStats(INPUT.getForza()) > 0)
			forz = valorizzoStats(INPUT.getForza());
		else
			return;
		
		if (valorizzoStats(INPUT.getDestrezza()) > 0)
			des = valorizzoStats(INPUT.getDestrezza());
		else
			return;
		
		if (valorizzoStats(INPUT.getCostituzione()) > 0)
			cos = valorizzoStats(INPUT.getCostituzione());
		else
			return;
		
		if (valorizzoStats(INPUT.getIntelligenza()) > 0)
			inte = valorizzoStats(INPUT.getIntelligenza());
		else
			return;
		
		if (valorizzoStats(INPUT.getSaggezza()) > 0)
			sag = valorizzoStats(INPUT.getSaggezza());
		else
			return;
		
		if (valorizzoStats(INPUT.getCarisma()) > 0)
			car = valorizzoStats(INPUT.getCarisma());
		else
			return;
		
		dto = new TransferDTO();
		dto.setCarisma(car);
		dto.setCostituzione(cos);
		dto.setDestrezza(des);
		dto.setForza(forz);
		dto.setIntelligenza(inte);
		dto.setSaggezza(sag);
		dto.setNome(nome);
		dto.setClasse(INPUT.getClasse());
		dto.setRazza(INPUT.getRazza());
		
		try {
			pathToSave = INPUT.getPathToSave();
			if(pathToSave == null || pathToSave.equalsIgnoreCase("")){
				throw new RuntimeException();
			}
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new PopUpDialog(), TESTO_MESSAGGIO_VUOTO, TITOLO_MESSAGGIO_VUOTO, JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		try {
			livello = Integer.parseInt(INPUT.getLivello());
			dto.setLivello(livello);
			modIncremento = (int) livello / 4;
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new PopUpDialog(), TESTO_MESSAGGIO_VUOTO, TITOLO_MESSAGGIO_VUOTO, JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		dto.setPathToSave(pathToSave);
		
		if(modIncremento > 0 ){
			IncrementoDiCarFrame incrementoDiCarFrame = new IncrementoDiCarFrame(modIncremento, dto);
		}else{
			GENERATORE.init(dto);
		}
		
	}
	
	private int valorizzoStats(String s){
		
		int result;
		
		try {
			result = Integer.parseInt(s);
			
			if(result <= 0){
				throw new RuntimeException();
			}
			
			return result;
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new PopUpDialog(), TESTO_MESSAGGIO_VUOTO, TITOLO_MESSAGGIO_VUOTO, JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == BUTTON_RESET){
			reset();
			return;
		}else if(arg0.getSource() == BUTTON_GENERA){
			controlli();
			return;
		}else if(arg0.getSource() == BUTTON_INFO){
			JOptionPane.showMessageDialog(new PopUpDialog(), "Created by ULMAR", "CREDITS", JOptionPane.INFORMATION_MESSAGE);
			return;
		}  else {
			return;
		}
		
	}

}
