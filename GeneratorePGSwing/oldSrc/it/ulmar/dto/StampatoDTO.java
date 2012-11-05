package it.ulmar.dto;

import it.ulmar.mainClasses.Personaggio;

import java.util.ArrayList;

public class StampatoDTO {
	
	private Personaggio personaggio;
	private ArrayList<LivelloIncantesimoDTO> listaIncantesimiDTO;
	private TalentoDTO talentoDTO;
	
	public Personaggio getPersonaggio() {
		return personaggio;
	}
	public void setPersonaggio(Personaggio personaggio) {
		this.personaggio = personaggio;
	}
	public ArrayList<LivelloIncantesimoDTO> getListaIncantesimiDTO() {
		return listaIncantesimiDTO;
	}
	public void setListaIncantesimiDTO(
			ArrayList<LivelloIncantesimoDTO> listaIncantesimiDTO) {
		this.listaIncantesimiDTO = listaIncantesimiDTO;
	}
	public TalentoDTO getTalentoDTO() {
		return talentoDTO;
	}
	public void setTalentoDTO(TalentoDTO talentoDTO) {
		this.talentoDTO = talentoDTO;
	}
	
}
