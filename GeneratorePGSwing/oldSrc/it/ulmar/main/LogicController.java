package it.ulmar.main;

import it.ulmar.classi.Barbaro;
import it.ulmar.classi.Bardo;
import it.ulmar.classi.Chierico;
import it.ulmar.classi.Druido;
import it.ulmar.classi.Guerriero;
import it.ulmar.classi.Ladro;
import it.ulmar.classi.Mago;
import it.ulmar.classi.Monaco;
import it.ulmar.classi.Paladino;
import it.ulmar.classi.Ranger;
import it.ulmar.classi.Stregone;
import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.dto.TalentoDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Personaggio;
import it.ulmar.mainClasses.Razza;
import it.ulmar.razze.Elfo;
import it.ulmar.razze.Gnomo;
import it.ulmar.razze.Halfling;
import it.ulmar.razze.Mezzelfo;
import it.ulmar.razze.Mezzorco;
import it.ulmar.razze.Nano;
import it.ulmar.razze.Umano;

import java.util.ArrayList;
import java.util.HashMap;

public class LogicController {
	
	public static Razza chosenRace(int forz, int des, int cos, int inte, int sag, int car, String s){
		
		HashMap<String, Razza> mappaRazze = new HashMap<String, Razza>();
		
		mappaRazze.put(Elfo.class.getSimpleName().toLowerCase(), new Elfo(forz, des, cos, inte, sag, car));
		mappaRazze.put(Gnomo.class.getSimpleName().toLowerCase(), new Gnomo(forz, des, cos, inte, sag, car));
		mappaRazze.put(Halfling.class.getSimpleName().toLowerCase(), new Halfling(forz, des, cos, inte, sag, car));
		mappaRazze.put(Mezzelfo.class.getSimpleName().toLowerCase(), new Mezzelfo(forz, des, cos, inte, sag, car));
		mappaRazze.put(Mezzorco.class.getSimpleName().toLowerCase(), new Mezzorco(forz, des, cos, inte, sag, car));
		mappaRazze.put(Nano.class.getSimpleName().toLowerCase(), new Nano(forz, des, cos, inte, sag, car));
		mappaRazze.put(Umano.class.getSimpleName().toLowerCase(), new Umano(forz, des, cos, inte, sag, car));
		
		Razza result = mappaRazze.get(s);
		
		return result;
	}
	
	public static Classe chosenClass(Razza razza, int livello, String s){
		
		HashMap<String, Classe> mappaClassi = new HashMap<String, Classe>();
		mappaClassi.put(Barbaro.class.getSimpleName().toLowerCase(), new Barbaro(livello, razza));
		mappaClassi.put(Bardo.class.getSimpleName().toLowerCase(), new Bardo(livello, razza));
		mappaClassi.put(Chierico.class.getSimpleName().toLowerCase(), new Chierico(livello, razza));
		mappaClassi.put(Druido.class.getSimpleName().toLowerCase(), new Druido(livello, razza));
		mappaClassi.put(Guerriero.class.getSimpleName().toLowerCase(), new Guerriero(livello, razza));
		mappaClassi.put(Ladro.class.getSimpleName().toLowerCase(), new Ladro(livello, razza));
		mappaClassi.put(Mago.class.getSimpleName().toLowerCase(), new Mago(livello, razza));
		mappaClassi.put(Monaco.class.getSimpleName().toLowerCase(), new Monaco(livello, razza));
		mappaClassi.put(Paladino.class.getSimpleName().toLowerCase(), new Paladino(livello, razza));
		mappaClassi.put(Ranger.class.getSimpleName().toLowerCase(), new Ranger(livello, razza));
		mappaClassi.put(Stregone.class.getSimpleName().toLowerCase(), new Stregone(livello, razza));
		
		Classe result = mappaClassi.get(s);
		
		return result;
	}
	
	public static void handlerIncrementoCaratteristica(Personaggio p, ArrayList<String> listaIncrementi){
		
		
		if(listaIncrementi == null || listaIncrementi.size() <= 0){
			return;
		}
		
		int incrementiCaratteristica = listaIncrementi.size();	
			
		for(int i=0; i<incrementiCaratteristica; i++){
			String s = listaIncrementi.get(i);
			incrementiCaratteristica(s, p, incrementiCaratteristica);
		}
	}
	
	private static void incrementiCaratteristica(String s, Personaggio p, int modIncrementoCaratteristica){

		Classe classeOld = p.getClasse();
		Razza razzaOld = classeOld.getRazza();

		if(s.equalsIgnoreCase(CostantiPG.FORZA)){
			razzaOld.setForz(razzaOld.getForz() + 1);
		}else if(s.equalsIgnoreCase(CostantiPG.DESTREZZA)){
			razzaOld.setDes(razzaOld.getDes() + 1);
		}else if(s.equalsIgnoreCase(CostantiPG.COSTITUZIONE)){
			razzaOld.setCos(razzaOld.getCos() + 1);
		}else if(s.equalsIgnoreCase(CostantiPG.INTELLIGENZA)){
			razzaOld.setInte(razzaOld.getInte() + 1);
		}else if(s.equalsIgnoreCase(CostantiPG.SAGGEZZA)){
			razzaOld.setSag(razzaOld.getSag() + 1);
		}else if(s.equalsIgnoreCase(CostantiPG.CARISMA)){
			razzaOld.setCar(razzaOld.getCar() + 1);
		}
		
		razzaOld.setModificatoriDTO(new ModificatoriDTO(razzaOld.getForz(), razzaOld.getDes(), razzaOld.getCos(), razzaOld.getInte(), razzaOld.getSag(), razzaOld.getCar()));
		classeOld.setRazza(razzaOld);
		
		if(s.equalsIgnoreCase(CostantiPG.INTELLIGENZA)){
			calcoloNuoviPtiAbilita(classeOld, modIncrementoCaratteristica);
		}
		
		p = new Personaggio(p.getNome(), classeOld);
//		System.out.println(p.getClasse().getPtiAbilita());
	}
	
	private static void calcoloNuoviPtiAbilita(Classe c, int modIncrementoCaratteristica){
		int liv = c.getLiv();
		int ptiAbilitaOld = c.getPtiAbilita();
		int ptiAbilitaNew = 0;
		
		switch (modIncrementoCaratteristica) {
		case 1:
			ptiAbilitaNew = ptiAbilitaOld + (liv - CostantiPG.QUATTRO) + 1;
			break;
		case 2:
			ptiAbilitaNew = ptiAbilitaOld + (liv - CostantiPG.OTTO) + 1;
			break;
		case 3:
			ptiAbilitaNew = ptiAbilitaOld + (liv - CostantiPG.DODICI) + 1;
			break;
		case 4:
			ptiAbilitaNew = ptiAbilitaOld + (liv - CostantiPG.SEDICI) + 1;
			break;
		case 5:
			ptiAbilitaNew = ptiAbilitaOld + (liv - CostantiPG.VENTI) + 1;
			break;
		}
		
		c.setPtiAbilita(ptiAbilitaNew);
	}
	
	public static ArrayList<LivelloIncantesimoDTO> checkIsACaster(Personaggio p){
		
		Classe c = p.getClasse();
		
		ArrayList<LivelloIncantesimoDTO> result = null;
		
		if(c.isACaster()){
			result = c.getListaIncatesimi(c.getLiv());
		}
		
		if(result == null){
			return result;
		}
		
		int modCaratt = 0;
		
		if(c instanceof Mago){
			modCaratt = c.getRazza().getModificatoriDTO().getModInte();
		}else if( c instanceof Chierico || c instanceof Druido || c instanceof Paladino || c instanceof Ranger){
			modCaratt = c.getRazza().getModificatoriDTO().getModSag();
		}else if(c instanceof Bardo || c instanceof Stregone){
			modCaratt = c.getRazza().getModificatoriDTO().getModCar();
		}
		
		LivelloIncantesimoDTO.addIncantesimiBonus(modCaratt, result);
		
		return result;
	}
	
	public static TalentoDTO handlerTalenti(Personaggio p) {
		TalentoDTO result = new TalentoDTO();

		int livello = p.getClasse().getLiv();

		int nTalenti = 0;
		int nTalentiBonus = 0;

		if (p.getClasse().getRazza() instanceof Umano) {
			nTalenti++;
		}

		if (livello >= CostantiPG.UNO) {
			nTalenti++;
		}

		if (livello >= CostantiPG.TRE) {
			nTalenti++;
		}

		if (livello >= CostantiPG.SEI) {
			nTalenti++;
		}

		if (livello >= CostantiPG.NOVE) {
			nTalenti++;
		}

		if (livello >= CostantiPG.DODICI) {
			nTalenti++;
		}

		if (livello >= CostantiPG.QUINDICI) {
			nTalenti++;
		}

		if (livello >= CostantiPG.DICIOTTO) {
			nTalenti++;
		}

		if (p.getClasse() instanceof Mago && livello >= CostantiPG.CINQUE) {
			nTalentiBonus++;
		}
		if (p.getClasse() instanceof Mago && livello >= CostantiPG.DIECI) {
			nTalentiBonus++;
		}
		if (p.getClasse() instanceof Mago && livello >= CostantiPG.QUINDICI) {
			nTalentiBonus++;
		}

		boolean isAWarrior = p.getClasse() instanceof Guerriero;
		
		if (isAWarrior && livello >= CostantiPG.UNO) {
			nTalentiBonus++;
		}

		for (int k = 2; k <= livello && isAWarrior; k = k + 2) {
			nTalentiBonus++;
		}

		result.setNumeroTalenti(nTalenti);
		result.setNumeroTalentiBonus(nTalentiBonus);

		return result;
	}
}
