package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Paladino extends Classe{
	
	private final int modAbilita = CostantiPG.DUE;
	private final int modDadiMO = CostantiPG.SEI;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	LivelloIncantesimoDTO[] quartoLivello = {
			new LivelloIncantesimoDTO(4, 1, 0, 99)};
	
	LivelloIncantesimoDTO[] quintoLivello = {
			new LivelloIncantesimoDTO(5, 1, 0, 99)};
	
	LivelloIncantesimoDTO[] sestoLivello = {
			new LivelloIncantesimoDTO(6, 1, 1, 99)};
	
	LivelloIncantesimoDTO[] settimoLivello = {
			new LivelloIncantesimoDTO(7, 1, 1, 99)};
	
	LivelloIncantesimoDTO[] ottavoLivello = {
			new LivelloIncantesimoDTO(8, 1, 1, 99),
			new LivelloIncantesimoDTO(8, 2, 0, 99)};
	
	LivelloIncantesimoDTO[] nonoLivello = {
			new LivelloIncantesimoDTO(9, 1, 1, 99),
			new LivelloIncantesimoDTO(9, 2, 0, 99)};
	
	LivelloIncantesimoDTO[] decimoLivello = {
			new LivelloIncantesimoDTO(10, 1, 1, 99),
			new LivelloIncantesimoDTO(10, 2, 1, 99)};
	
	LivelloIncantesimoDTO[] undicesimoLivello = {
			new LivelloIncantesimoDTO(11, 1, 1, 99),
			new LivelloIncantesimoDTO(11, 2, 1, 99),
			new LivelloIncantesimoDTO(11, 3, 0, 99)};
	
	LivelloIncantesimoDTO[] dodicesimoLivello = {
			new LivelloIncantesimoDTO(12, 1, 1, 99),
			new LivelloIncantesimoDTO(12, 2, 1, 99),
			new LivelloIncantesimoDTO(12, 3, 1, 99)};
	
	LivelloIncantesimoDTO[] tredicesimoLivello = {
			new LivelloIncantesimoDTO(13, 1, 1, 99),
			new LivelloIncantesimoDTO(13, 2, 1, 99),
			new LivelloIncantesimoDTO(13, 3, 1, 99)};
	
	LivelloIncantesimoDTO[] quattordicesimoLivello = {
			new LivelloIncantesimoDTO(14, 1, 2, 99),
			new LivelloIncantesimoDTO(14, 2, 1, 99),
			new LivelloIncantesimoDTO(14, 3, 1, 99),
			new LivelloIncantesimoDTO(14, 4, 0, 99)};
	
	LivelloIncantesimoDTO[] quindicesimoLivello = {
			new LivelloIncantesimoDTO(15, 1, 2, 99),
			new LivelloIncantesimoDTO(15, 2, 1, 99),
			new LivelloIncantesimoDTO(15, 3, 1, 99),
			new LivelloIncantesimoDTO(15, 4, 1, 99)};
	
	LivelloIncantesimoDTO[] sedicesimoLivello = {
			new LivelloIncantesimoDTO(16, 1, 2, 99),
			new LivelloIncantesimoDTO(16, 2, 2, 99),
			new LivelloIncantesimoDTO(16, 3, 1, 99),
			new LivelloIncantesimoDTO(16, 4, 1, 99)};
	
	LivelloIncantesimoDTO[] diciassettesimoLivello = {
			new LivelloIncantesimoDTO(17, 1, 2, 99),
			new LivelloIncantesimoDTO(17, 2, 2, 99),
			new LivelloIncantesimoDTO(17, 3, 2, 99),
			new LivelloIncantesimoDTO(17, 4, 1, 99)};
	
	LivelloIncantesimoDTO[] diciottesimoLivello = {
			new LivelloIncantesimoDTO(18, 1, 3, 99),
			new LivelloIncantesimoDTO(18, 2, 2, 99),
			new LivelloIncantesimoDTO(18, 3, 2, 99),
			new LivelloIncantesimoDTO(18, 4, 1, 99)};
	
	LivelloIncantesimoDTO[] diciannovesimoLivello = {
			new LivelloIncantesimoDTO(19, 1, 3, 99),
			new LivelloIncantesimoDTO(19, 2, 3, 99),
			new LivelloIncantesimoDTO(19, 3, 3, 99),
			new LivelloIncantesimoDTO(19, 4, 2, 99)};
	
	LivelloIncantesimoDTO[] ventesimoLivello = {
			new LivelloIncantesimoDTO(20, 1, 3, 99),
			new LivelloIncantesimoDTO(20, 2, 3, 99),
			new LivelloIncantesimoDTO(20, 3, 3, 99),
			new LivelloIncantesimoDTO(20, 4, 3, 99)};
	
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
	
	public Paladino(int liv, Razza razza){
		super.setRazza(razza);
		super.setValori(populateMap());
		super.setLiv(liv);
		super.setTsdto(getStatBase(liv));
		super.setModDadiMO(modDadiMO);
		super.setTipoDadoMO(tipoDadoMO);
		super.setMo(getMoneteOro());
		super.setPtiAbilita(getNumeroAbilita(modAbilita));
		super.setMap(populateCaster());
	}
	
	private HashMap<Integer, LivelloIncantesimoDTO[]> populateCaster(){
		HashMap<Integer, LivelloIncantesimoDTO[]> mappa = new HashMap<Integer, LivelloIncantesimoDTO[]>();
		int pos = 1;
		mappa.put(pos++, null);
		mappa.put(pos++, null);
		mappa.put(pos++, null);
		mappa.put(pos++, quartoLivello);
		mappa.put(pos++, quintoLivello);
		mappa.put(pos++, sestoLivello);
		mappa.put(pos++, settimoLivello);
		mappa.put(pos++, ottavoLivello);
		mappa.put(pos++, nonoLivello);
		mappa.put(pos++, decimoLivello);
		mappa.put(pos++, undicesimoLivello);
		mappa.put(pos++, dodicesimoLivello);
		mappa.put(pos++, tredicesimoLivello);
		mappa.put(pos++, quattordicesimoLivello);
		mappa.put(pos++, quindicesimoLivello);
		mappa.put(pos++, sedicesimoLivello);
		mappa.put(pos++, diciassettesimoLivello);
		mappa.put(pos++, diciottesimoLivello);
		mappa.put(pos++, diciannovesimoLivello);
		mappa.put(pos++, ventesimoLivello);

		return mappa;
	}
	
	public String getDenominazione(){
		return "il "+this.getClass().getSimpleName().toUpperCase();
	}
	
	public String getDV() {
		return "d10";
	}
}
