package it.ulmar.frame;

import it.ulmar.frame.interfacce.GeneratoreInputInterface;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GeneratoreInput extends JPanel implements GeneratoreInputInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField FOR;
	private JTextField NOME;
	private JTextField DES;
	private JTextField COS;
	private JTextField INT;
	private JTextField SAG;
	private JTextField CAR;
	private JComboBox INPUT_RAZZA;
	private JTextField INPUT_LIVELLO;
	private JComboBox INPUT_CLASSE;
	private JLabel FORZA = new JLabel("Forza: ");
	private JLabel NOME_LABEL = new JLabel("Nome: ");
	private JLabel DESTREZZA = new JLabel("Destrezza: ");
	private JLabel COSTITUZIONE = new JLabel("Costituzione: ");
	private JLabel INTELLIGENZA = new JLabel("Intelligenza: ");
	private JLabel SAGGEZZA = new JLabel("Saggezza: ");
	private JLabel CARISMA = new JLabel("Carisma: ");
	private JLabel LIVELLO = new JLabel("Livello: ");
	private JLabel CLASSE = new JLabel("Classe: ");
	private JLabel RAZZA = new JLabel("Razza: ");
	private JPanel p = new JPanel();
	private GridLayout G;
	private ChooserLabel CHOOSER = new ChooserLabel();
	private String[] ELENCO_RAZZE = {"Elfo", "Gnomo","Halfling","Mezzelfo","Mezzorco","Nano","Umano"};
    private String[] ELENCO_CLASSI = {"Barbaro","Bardo","Chierico","Druido","Guerriero","Ladro","Mago","Monaco","Paladino","Ranger","Stregone"};
//	private String[] COST_DADI_VITA = {"d4", "d6", "d8", "d10", "d12"};
//	private ValidatoreListener LISTENER = new ValidatoreListener();
    
	private void initAll(){
		G = new GridLayout();
	}
	
	public GeneratoreInput() {
	}
	
	private void fillStats(){
		JPanel panelNome = new JPanel(G);
		panelNome.add(NOME_LABEL);
		NOME = new JTextField(10);
		NOME.setAutoscrolls(true);
		panelNome.add(NOME);
		add(panelNome);
		
		JPanel panelFor = new JPanel(G);
		panelFor.add(FORZA);
		FOR = new JTextField(4);
		panelFor.add(FOR);
		add(panelFor);
		
		JPanel panelDes = new JPanel(G);
		panelDes.add(DESTREZZA);
		DES = new JTextField(4);
		panelDes.add(DES);
		add(panelDes);
		
		JPanel panelCos = new JPanel(G);
		panelCos.add(COSTITUZIONE);
		COS = new JTextField(4);
		panelCos.add(COS);
		add(panelCos);
		
		JPanel panelInt = new JPanel(G);
		panelInt.add(INTELLIGENZA);
		INT = new JTextField(4);
		panelInt.add(INT);
		add(panelInt);
		
		JPanel panelSag = new JPanel(G);
		panelSag.add(SAGGEZZA);
		SAG = new JTextField(4);
		panelSag.add(SAG);
		add(panelSag);
		
		JPanel panelCar = new JPanel(G);
		panelCar.add(CARISMA);
		CAR = new JTextField(4);
		panelCar.add(CAR);
		add(panelCar);
		
		add(p);
		
		JPanel panelRace = new JPanel(G);
		panelRace.add(RAZZA);
		INPUT_RAZZA = new JComboBox(ELENCO_RAZZE);
		panelRace.add(INPUT_RAZZA);
		add(panelRace);
		
		JPanel panelClass = new JPanel(G);
		panelClass.add(CLASSE);
		INPUT_CLASSE = new JComboBox(ELENCO_CLASSI);
		panelClass.add(INPUT_CLASSE);
		add(panelClass);
		
		JPanel panelLiv = new JPanel(G);
		panelLiv.add(LIVELLO);
		INPUT_LIVELLO = new JTextField(4);
//		INPUT_LIVELLO.addFocusListener(LISTENER);
		panelLiv.add(INPUT_LIVELLO);
		add(panelLiv);
		
		add(p);
		
		add(CHOOSER.fillChooser(G));

	}
	
	public GeneratoreInput(boolean b) {
		super(new GridLayout(12,2));
		initAll();
		fillStats();
	}

	public String getForza() {
		return FOR.getText();
	}

	public String getDestrezza() {
		return DES.getText();
	}

	public String getCostituzione() {
		return COS.getText();
	}

	public String getIntelligenza() {
		return INT.getText();
	}

	public String getSaggezza() {
		return SAG.getText();
	}

	public String getCarisma() {
		return CAR.getText();
	}

	public String getLivello() {
		return INPUT_LIVELLO.getText();
	}

	public String getClasse() {
		return (String) INPUT_CLASSE.getSelectedItem();
	}

	public String getRazza() {
		return (String) INPUT_RAZZA.getSelectedItem();
	}

	public String getPathToSave() {
		return CHOOSER.getDirToSave();
//		return "";
	}
	
	public String getNome() {
		return NOME.getText();
	}

	public void resetForza() {
		FOR.setText("");		
	}

	public void resetDestrezza() {
		DES.setText("");		
	}

	public void resetCostituzione() {
		COS.setText("");		
	}

	public void resetIntelligenza() {
		INT.setText("");		
	}

	public void resetSaggezza() {
		SAG.setText("");		
	}

	public void resetCarisma() {
		CAR.setText("");		
	}

	public void resetRazza() {
		INPUT_RAZZA.setSelectedIndex(0);
	}

	public void resetClasse() {
		INPUT_CLASSE.setSelectedIndex(0);
	}

	public void resetLivello() {
		INPUT_LIVELLO.setText("");		
	}

	public void resetPathToSave() {
		CHOOSER.reset();		
	}

	public void resetNome() {
		NOME.setText("");		
	}

}
