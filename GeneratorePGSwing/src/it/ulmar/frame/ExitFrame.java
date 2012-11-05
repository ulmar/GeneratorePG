package it.ulmar.frame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitFrame extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
