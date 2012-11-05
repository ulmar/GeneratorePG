package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Monaco extends Classe{
	
	private final int modAbilita = CostantiPG.QUATTRO;
	private final int modDadiMO = CostantiPG.CINQUE;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	private HashMap<Integer, TSndBABDTO> populateMap(){
		int i = 1;
		HashMap<Integer, TSndBABDTO> valori = new HashMap<Integer, TSndBABDTO>();
		valori.put(i++, new TSndBABDTO	(0, 2, 2, 2));
		valori.put(i++, new TSndBABDTO	(1, 3, 3, 3));
		valori.put(i++, new TSndBABDTO	(2, 3, 3, 3));
		valori.put(i++, new TSndBABDTO	(3, 4, 4, 4));
		valori.put(i++, new TSndBABDTO	(3, 4, 4, 4));
		valori.put(i++, new TSndBABDTO	(4, 5, 5, 5));
		valori.put(i++, new TSndBABDTO	(5, 5, 5, 5));
		valori.put(i++, new TSndBABDTO	(6, 6, 6, 6));
		valori.put(i++, new TSndBABDTO	(6, 6, 6, 6));
		valori.put(i++, new TSndBABDTO	(7, 7, 7, 7));
		valori.put(i++, new TSndBABDTO	(8, 7, 7, 7));
		valori.put(i++, new TSndBABDTO	(9, 8, 8, 8));
		valori.put(i++, new TSndBABDTO	(9, 8, 8, 8));
		valori.put(i++, new TSndBABDTO	(10, 9, 9, 9));
		valori.put(i++, new TSndBABDTO	(11, 9, 9, 9));
		valori.put(i++, new TSndBABDTO	(12, 10, 10, 10));
		valori.put(i++, new TSndBABDTO	(12, 10, 10, 10));
		valori.put(i++, new TSndBABDTO	(13, 11, 11, 11));
		valori.put(i++, new TSndBABDTO	(14, 11, 11, 11));
		valori.put(i++, new TSndBABDTO	(15, 12, 12, 12));
		
		return valori;
	}
	
	public Monaco(int liv, Razza razza){
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
		return "d8";
	}
}
