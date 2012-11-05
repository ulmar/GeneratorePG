package it.ulmar.main;

import it.ulmar.dto.StampatoDTO;
import it.ulmar.dto.TransferDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Personaggio;
import it.ulmar.mainClasses.Razza;
import it.ulmar.stampaUti.UtilitiesStampa;


public class StarterApp {

	public StarterApp(){
	}
	
	public void start(TransferDTO dto) {
		
//		System.out.println(CostantiSystem.INTRO);
		
//		Classe c = new Bardo(1, new Elfo(1, 1, 1, 1, 1, 1));
//	
//		if(CostantiPG.getListaIncantatori().contains(c.getClass())){
//			System.out.println(true);
//		}
		
		StampatoDTO stampaDTO = new StampatoDTO();
		String nome = dto.getNome();
		Classe classe = null;
		Razza razza = null;
		Integer forz = dto.getForza();
		Integer des = dto.getDestrezza();
		Integer cos = dto.getCostituzione();
		Integer inte = dto.getIntelligenza();
		Integer sag = dto.getSaggezza();
		Integer car = dto.getCarisma();
		Integer liv = dto.getLivello();
		//Scelta della Razza
		razza = LogicController.chosenRace(forz, des, cos, inte, sag, car, dto.getRazza().toLowerCase());
		//Selezione della classe
		classe = LogicController.chosenClass(razza, liv, dto.getClasse().toLowerCase());
		
		Personaggio personaggio = new Personaggio(nome, classe);
		//Gestione incrementi di caratteristica
		LogicController.handlerIncrementoCaratteristica(personaggio, dto.getListaIncrementi());
		//Controllo se è un caster e il numero di incantesimi
		stampaDTO.setListaIncantesimiDTO(LogicController.checkIsACaster(personaggio));
		stampaDTO.setTalentoDTO(LogicController.handlerTalenti(personaggio));
		stampaDTO.setPersonaggio(personaggio);
		
		UtilitiesStampa.creaStampa(stampaDTO, dto.getPathToSave());
		
	}
}
