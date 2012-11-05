package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Barbaro extends Classe{
	
	private final int modAbilita = CostantiPG.QUATTRO;
	private final int modDadiMO = CostantiPG.QUATTRO;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	private HashMap<Integer, TSndBABDTO> populateMap(){
		int i = 1;
		HashMap<Integer, TSndBABDTO> valori = new HashMap<Integer, TSndBABDTO>();
		valori.put(i++, new TSndBABDTO	(1, 2, 0, 0));
		valori.put(i++, new TSndBABDTO	(2, 3, 0, 0));
		valori.put(i++, new TSndBABDTO	(3, 3, 1, 1));
		valori.put(i++, new TSndBABDTO	(4, 4, 1, 1));
		valori.put(i++, new TSndBABDTO	(5, 4, 1, 1));
		valori.put(i++, new TSndBABDTO	(6, 5, 2, 2));
		valori.put(i++, new TSndBABDTO	(7, 5, 2, 2));
		valori.put(i++, new TSndBABDTO	(8, 6, 2, 2));
		valori.put(i++, new TSndBABDTO	(9, 6, 3, 3));
		valori.put(i++, new TSndBABDTO	(10, 7, 3, 3));
		valori.put(i++, new TSndBABDTO	(11, 7, 3, 3));
		valori.put(i++, new TSndBABDTO	(12, 8, 4, 4));
		valori.put(i++, new TSndBABDTO	(13, 8, 4, 4));
		valori.put(i++, new TSndBABDTO	(14, 9, 4, 4));
		valori.put(i++, new TSndBABDTO	(15, 9, 5, 5));
		valori.put(i++, new TSndBABDTO	(16, 10, 5, 5));
		valori.put(i++, new TSndBABDTO	(17, 10, 5, 5));
		valori.put(i++, new TSndBABDTO	(18, 11, 6, 6));
		valori.put(i++, new TSndBABDTO	(19, 11, 6, 6));
		valori.put(i++, new TSndBABDTO	(20, 12, 6, 6));
		
		return valori;
	}
	
	public Barbaro(int liv, Razza razza){
		super.setRazza(razza);
		super.setValori(populateMap());
		super.setLiv(liv);
		super.setTsdto(getStatBase(liv));
		super.setModDadiMO(modDadiMO);
		super.setTipoDadoMO(tipoDadoMO);
		super.setMo(getMoneteOro());
		super.setPtiAbilita(getNumeroAbilita(modAbilita));
		super.setMap(null);
	}
	
	public String getDenominazione(){
		return "il "+this.getClass().getSimpleName().toUpperCase();
	}

	public String getDV() {
		return "d12";
	}
}
