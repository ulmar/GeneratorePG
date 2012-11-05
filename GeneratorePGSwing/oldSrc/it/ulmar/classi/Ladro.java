package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Ladro extends Classe{
	
	private final int modAbilita = CostantiPG.OTTO;
	private final int modDadiMO = CostantiPG.CINQUE;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	private HashMap<Integer, TSndBABDTO> populateMap(){
		int i = 1;
		HashMap<Integer, TSndBABDTO> valori = new HashMap<Integer, TSndBABDTO>();
		valori.put(i++, new TSndBABDTO	(0, 0, 2, 0));
		valori.put(i++, new TSndBABDTO	(1, 0, 3, 0));
		valori.put(i++, new TSndBABDTO	(2, 1, 3, 1));
		valori.put(i++, new TSndBABDTO	(3, 1, 4, 1));
		valori.put(i++, new TSndBABDTO	(3, 1, 4, 1));
		valori.put(i++, new TSndBABDTO	(4, 2, 5, 2));
		valori.put(i++, new TSndBABDTO	(5, 2, 5, 2));
		valori.put(i++, new TSndBABDTO	(6, 2, 6, 2));
		valori.put(i++, new TSndBABDTO	(6, 3, 6, 3));
		valori.put(i++, new TSndBABDTO	(7, 3, 7, 3));
		valori.put(i++, new TSndBABDTO	(8, 3, 7, 3));
		valori.put(i++, new TSndBABDTO	(9, 4, 8, 4));
		valori.put(i++, new TSndBABDTO	(9, 4, 8, 4));
		valori.put(i++, new TSndBABDTO	(10,4, 9, 4));
		valori.put(i++, new TSndBABDTO	(11,5, 9, 5));
		valori.put(i++, new TSndBABDTO	(12,5, 10, 5));
		valori.put(i++, new TSndBABDTO	(12,5, 10, 5));
		valori.put(i++, new TSndBABDTO	(13,6, 11, 6));
		valori.put(i++, new TSndBABDTO	(14,6, 11, 6));
		valori.put(i++, new TSndBABDTO	(15,6, 12, 6));
		
		return valori;
	}
	
	public Ladro(int liv, Razza razza){
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
		return "d6";
	}
}
