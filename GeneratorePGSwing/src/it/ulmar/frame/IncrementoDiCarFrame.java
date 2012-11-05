package it.ulmar.frame;

import it.ulmar.dto.TransferDTO;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncrementoDiCarFrame extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> listaStats = populateStats();
	private ArrayList<String> listaIncrementi;
	
	private GridLayout G = new GridLayout();
	
	private Generatore GENERATORE = new Generatore();
	private TransferDTO dto;
	
	private URL URL;
	private Image image;
	
	JPanel primo_IncrPanel= null;
	JLabel primo_IncrLabel= null;
	JComboBox primo_IncrCombo;
	JPanel secondo_IncrPanel= null;
	JLabel secondo_IncrLabel= null;
	JComboBox secondo_IncrCombo;
	JPanel terzo_IncrPanel= null;
	JLabel terzo_IncrLabel= null;
	JComboBox terzo_IncrCombo;
	JPanel quarto_IncrPanel= null;
	JLabel quarto_IncrLabel= null;
	JComboBox quarto_IncrCombo;
	JPanel quinto_IncrPanel= null;
	JLabel quinto_IncrLabel= null;
	JComboBox quinto_IncrCombo = null;
	
	private JButton jb;
	
	private ArrayList<String> populateStats(){
		listaStats = new ArrayList<String>();
		this.listaStats.add("for");
		this.listaStats.add("des");
		this.listaStats.add("cos");
		this.listaStats.add("int");
		this.listaStats.add("sag");
		this.listaStats.add("car");
		return this.listaStats;
	}
	
	public IncrementoDiCarFrame(){
		
	}
	
	private JPanel populateFrame(int j){
		
		JPanel p = new JPanel(new GridLayout(j+2, 2));
		
		String [] lista = new String[listaStats.size()];
		
		listaStats.toArray(lista);
		
		int cont = 1;
		
		if(j > 0){
			primo_IncrPanel = new JPanel(G);
			primo_IncrLabel = new JLabel(cont+"° incremento ");
			primo_IncrPanel.add(primo_IncrLabel);
			primo_IncrCombo = new JComboBox(lista);
			primo_IncrPanel.add(primo_IncrCombo);
			p.add(primo_IncrPanel);
			j--;
			cont++;
		}
		
		if(j > 0){
			secondo_IncrPanel = new JPanel(G);
			secondo_IncrLabel = new JLabel(cont+"° incremento ");
			secondo_IncrPanel.add(secondo_IncrLabel);
			secondo_IncrCombo = new JComboBox(lista);
			secondo_IncrPanel.add(secondo_IncrCombo);
			p.add(secondo_IncrPanel);
			j--;
			cont++;
		}
		
		if(j > 0){
			terzo_IncrPanel = new JPanel(G);
			terzo_IncrLabel = new JLabel(cont+"° incremento ");
			terzo_IncrPanel.add(terzo_IncrLabel);
			terzo_IncrCombo = new JComboBox(lista);
			terzo_IncrPanel.add(terzo_IncrCombo);
			p.add(terzo_IncrPanel);
			j--;
			cont++;
		}
		
		if(j > 0){
			quarto_IncrPanel = new JPanel(G);
			quarto_IncrLabel = new JLabel(cont+"° incremento ");
			quarto_IncrPanel.add(quarto_IncrLabel);
			quarto_IncrCombo = new JComboBox(lista);
			quarto_IncrPanel.add(quarto_IncrCombo);
			p.add(quarto_IncrPanel);
			j--;
			cont++;
		}
		
		if(j > 0){
			quinto_IncrPanel = new JPanel(G);
			quinto_IncrLabel = new JLabel(cont+"° incremento ");
			quinto_IncrPanel.add(quinto_IncrLabel);
			quinto_IncrCombo = new JComboBox(lista);
			quinto_IncrPanel.add(quinto_IncrCombo);
			p.add(quinto_IncrPanel);
			j--;
			cont++;
		}
		
		JPanel panel = new JPanel();
		p.add(panel);
//		
		jb = new JButton("Assegna");
		p.add(jb);
		
		jb.addActionListener(this);
		
		return p;
	}
	
	public IncrementoDiCarFrame(int b, TransferDTO dto){
		
		this.dto = dto;
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(populateFrame(b));
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setTitle("Incrementatore di caratteristica");
		setResizable(false);
		setVisible(true);
		setImage();
		setLocation();
		pack();
		
	}

	public ArrayList<String> getListaIncrementi() {
		return listaIncrementi;
	}

	public void setListaIncrementi(ArrayList<String> listaIncrementi) {
		this.listaIncrementi = listaIncrementi;
	}
	
	private void setImage(){
		URL = ClassLoader.getSystemResource("it/ulmar/images/logo.gif");
		image = Toolkit.getDefaultToolkit().getImage(URL);
		setIconImage(image);
	}
	
	private void setLocation(){
		int larghezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int altezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		setLocation((int)((larghezza/2) - (getWidth()/2)), (int)((altezza/2) - ((int) getHeight() / 2)));
	}

	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getSource());	
		
//		System.out.println((String) primo_IncrCombo.getSelectedItem());
		
		if(e.getSource() != jb){
			return;
		}
		
		if(primo_IncrCombo != null){
			listaIncrementi = new ArrayList<String>();
			listaIncrementi.add((String) primo_IncrCombo.getSelectedItem());
		}
		
		if(secondo_IncrCombo != null){
			listaIncrementi.add((String) secondo_IncrCombo.getSelectedItem());
		}
		
		if(terzo_IncrCombo != null){
			listaIncrementi.add((String) terzo_IncrCombo.getSelectedItem());
		}
		
		if(quarto_IncrCombo != null){
			listaIncrementi.add((String) quarto_IncrCombo.getSelectedItem());
		}
		
		if(quinto_IncrCombo != null){
			listaIncrementi.add((String) quarto_IncrCombo.getSelectedItem());
		}
		
		setVisible(false);
		setEnabled(false);
		
		dto.setListaIncrementi(listaIncrementi);
		
		GENERATORE.init(dto);
		
	}

}
