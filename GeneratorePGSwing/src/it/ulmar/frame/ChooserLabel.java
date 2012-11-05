package it.ulmar.frame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChooserLabel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton go;
	private JFileChooser chooser;
	private JTextField tf;
	private JLabel label  = new JLabel("Scegli la cartella: ");
	private URL URL;
	
	private ImageIcon createImageIcon(){
		URL = ClassLoader.getSystemResource("it/ulmar/images/save.png");
		return new ImageIcon(URL);
	}
	
	public ChooserLabel(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() != go){
			return;
		}
		
		int returnVal = chooser.showOpenDialog(this);
		
		File file = null;
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}else{
			return;
		}
		
		tf.setText(file.getAbsolutePath());
		
	}

	public JPanel fillChooser(GridLayout g) {
		this.setLayout(g);
		
		tf = new JTextField();
		tf.setSize(5, 20);
		tf.setEditable(false);
		
		go = new JButton(createImageIcon());
		go.addActionListener(this);
		
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		this.add(label);
		this.add(tf);
		this.add(go);

		return this;
	}

	public String getDirToSave() {
		return tf.getText();
	}

	public void reset() {
		tf.setText("");
	}

}
