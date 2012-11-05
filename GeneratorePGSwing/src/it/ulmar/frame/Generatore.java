package it.ulmar.frame;

import it.ulmar.dto.TransferDTO;
import it.ulmar.frame.interfacce.GeneratoreInterface;
import it.ulmar.main.StarterApp;

public class Generatore implements GeneratoreInterface {

	@Override
	public void init(TransferDTO dto) {
		new StarterApp().start(dto);
	}

}
