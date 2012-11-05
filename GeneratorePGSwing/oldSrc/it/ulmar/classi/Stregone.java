package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Stregone extends Classe{
	
	private final int modAbilita = CostantiPG.DUE;
	private final int modDadiMO = CostantiPG.TRE;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	LivelloIncantesimoDTO[] primoLivello = {
			new LivelloIncantesimoDTO(1, 0, 5, 4),
			new LivelloIncantesimoDTO(1, 1, 3, 2) };

	LivelloIncantesimoDTO[] secondoLivello = {
			new LivelloIncantesimoDTO(2, 0, 6, 5),
			new LivelloIncantesimoDTO(2, 1, 4, 2) };

	LivelloIncantesimoDTO[] terzoLivello = {
			new LivelloIncantesimoDTO(3, 0, 6, 5),
			new LivelloIncantesimoDTO(3, 1, 5, 3) };

	LivelloIncantesimoDTO[] quartoLivello = {
			new LivelloIncantesimoDTO(4, 0, 6, 6),
			new LivelloIncantesimoDTO(4, 1, 6, 3),
			new LivelloIncantesimoDTO(4, 2, 3, 1) };

	LivelloIncantesimoDTO[] quintoLivello = {
			new LivelloIncantesimoDTO(5, 0, 6, 6),
			new LivelloIncantesimoDTO(5, 1, 6, 4),
			new LivelloIncantesimoDTO(5, 2, 4, 2) };

	LivelloIncantesimoDTO[] sestoLivello = {
			new LivelloIncantesimoDTO(6, 0, 6, 7),
			new LivelloIncantesimoDTO(6, 1, 6, 4),
			new LivelloIncantesimoDTO(6, 2, 5, 2),
			new LivelloIncantesimoDTO(6, 3, 3, 1) };

	LivelloIncantesimoDTO[] settimoLivello = {
			new LivelloIncantesimoDTO(7, 0, 6, 7),
			new LivelloIncantesimoDTO(7, 1, 6, 5),
			new LivelloIncantesimoDTO(7, 2, 6, 3),
			new LivelloIncantesimoDTO(7, 3, 4, 2) };

	LivelloIncantesimoDTO[] ottavoLivello = {
			new LivelloIncantesimoDTO(8, 0, 6, 8),
			new LivelloIncantesimoDTO(8, 1, 6, 5),
			new LivelloIncantesimoDTO(8, 2, 6, 3),
			new LivelloIncantesimoDTO(8, 3, 5, 2),
			new LivelloIncantesimoDTO(8, 4, 3, 1) };

	LivelloIncantesimoDTO[] nonoLivello = {
			new LivelloIncantesimoDTO(9, 0, 6, 8),
			new LivelloIncantesimoDTO(9, 1, 6, 5),
			new LivelloIncantesimoDTO(9, 2, 6, 4),
			new LivelloIncantesimoDTO(9, 3, 6, 3),
			new LivelloIncantesimoDTO(9, 4, 4, 2) };

	LivelloIncantesimoDTO[] decimoLivello = {
			new LivelloIncantesimoDTO(10, 0, 6, 9),
			new LivelloIncantesimoDTO(10, 1, 6, 5),
			new LivelloIncantesimoDTO(10, 2, 6, 4),
			new LivelloIncantesimoDTO(10, 3, 6, 3),
			new LivelloIncantesimoDTO(10, 4, 5, 2),
			new LivelloIncantesimoDTO(10, 5, 3, 1) };

	LivelloIncantesimoDTO[] undicesimoLivello = {
			new LivelloIncantesimoDTO(11, 0, 6, 9),
			new LivelloIncantesimoDTO(11, 1, 6, 5),
			new LivelloIncantesimoDTO(11, 2, 6, 5),
			new LivelloIncantesimoDTO(11, 3, 6, 4),
			new LivelloIncantesimoDTO(11, 4, 6, 3),
			new LivelloIncantesimoDTO(11, 5, 4, 2) };

	LivelloIncantesimoDTO[] dodicesimoLivello = {
			new LivelloIncantesimoDTO(12, 0, 6, 9),
			new LivelloIncantesimoDTO(12, 1, 6, 5),
			new LivelloIncantesimoDTO(12, 2, 6, 5),
			new LivelloIncantesimoDTO(12, 3, 6, 4),
			new LivelloIncantesimoDTO(12, 4, 6, 3),
			new LivelloIncantesimoDTO(12, 5, 5, 2),
			new LivelloIncantesimoDTO(12, 6, 3, 1) };

	LivelloIncantesimoDTO[] tredicesimoLivello = {
			new LivelloIncantesimoDTO(13, 0, 6, 9),
			new LivelloIncantesimoDTO(13, 1, 6, 5),
			new LivelloIncantesimoDTO(13, 2, 6, 5),
			new LivelloIncantesimoDTO(13, 3, 6, 4),
			new LivelloIncantesimoDTO(13, 4, 6, 4),
			new LivelloIncantesimoDTO(13, 5, 6, 3),
			new LivelloIncantesimoDTO(13, 6, 4, 2) };

	LivelloIncantesimoDTO[] quattordicesimoLivello = {
			new LivelloIncantesimoDTO(14, 0, 6, 9),
			new LivelloIncantesimoDTO(14, 1, 6, 5),
			new LivelloIncantesimoDTO(14, 2, 6, 5),
			new LivelloIncantesimoDTO(14, 3, 6, 4),
			new LivelloIncantesimoDTO(14, 4, 6, 4),
			new LivelloIncantesimoDTO(14, 5, 6, 3),
			new LivelloIncantesimoDTO(14, 6, 5, 2),
			new LivelloIncantesimoDTO(14, 7, 3, 1) };

	LivelloIncantesimoDTO[] quindicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 6, 9),
			new LivelloIncantesimoDTO(15, 1, 6, 5),
			new LivelloIncantesimoDTO(15, 2, 6, 5),
			new LivelloIncantesimoDTO(15, 3, 6, 4),
			new LivelloIncantesimoDTO(15, 4, 6, 4),
			new LivelloIncantesimoDTO(15, 5, 6, 4),
			new LivelloIncantesimoDTO(15, 6, 6, 3),
			new LivelloIncantesimoDTO(15, 7, 4, 2) };

	LivelloIncantesimoDTO[] sedicesimoLivello = {
			new LivelloIncantesimoDTO(16, 0, 6, 9),
			new LivelloIncantesimoDTO(16, 1, 6, 5),
			new LivelloIncantesimoDTO(16, 2, 6, 5),
			new LivelloIncantesimoDTO(16, 3, 6, 4),
			new LivelloIncantesimoDTO(16, 4, 6, 4),
			new LivelloIncantesimoDTO(16, 5, 6, 4),
			new LivelloIncantesimoDTO(16, 6, 6, 3),
			new LivelloIncantesimoDTO(16, 7, 5, 2),
			new LivelloIncantesimoDTO(16, 8, 3, 1) };

	LivelloIncantesimoDTO[] diciassettesimoLivello = {
			new LivelloIncantesimoDTO(17, 0, 6, 9),
			new LivelloIncantesimoDTO(17, 1, 6, 5),
			new LivelloIncantesimoDTO(17, 2, 6, 5),
			new LivelloIncantesimoDTO(17, 3, 6, 4),
			new LivelloIncantesimoDTO(17, 4, 6, 4),
			new LivelloIncantesimoDTO(17, 5, 6, 4),
			new LivelloIncantesimoDTO(17, 6, 6, 3),
			new LivelloIncantesimoDTO(17, 7, 6, 3),
			new LivelloIncantesimoDTO(17, 8, 4, 2) };

	LivelloIncantesimoDTO[] diciottesimoLivello = {
			new LivelloIncantesimoDTO(18, 0, 6, 9),
			new LivelloIncantesimoDTO(18, 1, 6, 5),
			new LivelloIncantesimoDTO(18, 2, 6, 5),
			new LivelloIncantesimoDTO(18, 3, 6, 4),
			new LivelloIncantesimoDTO(18, 4, 6, 4),
			new LivelloIncantesimoDTO(18, 5, 6, 4),
			new LivelloIncantesimoDTO(18, 6, 6, 3),
			new LivelloIncantesimoDTO(18, 7, 6, 3),
			new LivelloIncantesimoDTO(18, 8, 5, 2),
			new LivelloIncantesimoDTO(18, 9, 3, 1) };

	LivelloIncantesimoDTO[] diciannovesimoLivello = {
			new LivelloIncantesimoDTO(19, 0, 6, 9),
			new LivelloIncantesimoDTO(19, 1, 6, 5),
			new LivelloIncantesimoDTO(19, 2, 6, 5),
			new LivelloIncantesimoDTO(19, 3, 6, 4),
			new LivelloIncantesimoDTO(19, 4, 6, 4),
			new LivelloIncantesimoDTO(19, 5, 6, 4),
			new LivelloIncantesimoDTO(19, 6, 6, 3),
			new LivelloIncantesimoDTO(19, 7, 6, 3),
			new LivelloIncantesimoDTO(19, 8, 6, 3),
			new LivelloIncantesimoDTO(19, 9, 4, 2) };

	LivelloIncantesimoDTO[] ventesimoLivello = {
			new LivelloIncantesimoDTO(20, 0, 6, 9),
			new LivelloIncantesimoDTO(20, 1, 6, 5),
			new LivelloIncantesimoDTO(20, 2, 6, 5),
			new LivelloIncantesimoDTO(20, 3, 6, 4),
			new LivelloIncantesimoDTO(20, 4, 6, 4),
			new LivelloIncantesimoDTO(20, 5, 6, 4),
			new LivelloIncantesimoDTO(20, 6, 6, 3),
			new LivelloIncantesimoDTO(20, 7, 6, 3),
			new LivelloIncantesimoDTO(20, 8, 6, 3),
			new LivelloIncantesimoDTO(20, 9, 6, 3) };
	
	private HashMap<Integer, TSndBABDTO> populateMap(){
		int i = 1;
		HashMap<Integer, TSndBABDTO> valori = new HashMap<Integer, TSndBABDTO>();
		valori.put(i++, new TSndBABDTO	(0, 0, 0, 2));
		valori.put(i++, new TSndBABDTO	(1, 0, 0, 3));
		valori.put(i++, new TSndBABDTO	(1, 1, 1, 3));
		valori.put(i++, new TSndBABDTO	(2, 1, 1, 4));
		valori.put(i++, new TSndBABDTO	(2, 1, 1, 4));
		valori.put(i++, new TSndBABDTO	(3, 2, 2, 5));
		valori.put(i++, new TSndBABDTO	(3, 2, 2, 5));
		valori.put(i++, new TSndBABDTO	(4, 2, 2, 6));
		valori.put(i++, new TSndBABDTO	(4, 3, 3, 6));
		valori.put(i++, new TSndBABDTO	(5, 3, 3, 7));
		valori.put(i++, new TSndBABDTO	(5, 3, 3, 7));
		valori.put(i++, new TSndBABDTO	(6, 4, 4, 8));
		valori.put(i++, new TSndBABDTO	(6, 4, 4, 8));
		valori.put(i++, new TSndBABDTO	(7, 4, 4, 9));
		valori.put(i++, new TSndBABDTO	(7, 5, 5, 9));
		valori.put(i++, new TSndBABDTO	(8, 5, 5, 10));
		valori.put(i++, new TSndBABDTO	(8, 5, 5, 10));
		valori.put(i++, new TSndBABDTO	(9, 6, 6, 11));
		valori.put(i++, new TSndBABDTO	(9, 6, 6, 11));
		valori.put(i++, new TSndBABDTO	(10, 6, 6, 12));
		
		return valori;
	}
	
	public Stregone(int liv, Razza razza){
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
		mappa.put(pos++, primoLivello);
		mappa.put(pos++, secondoLivello);
		mappa.put(pos++, terzoLivello);
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
		return "lo "+this.getClass().getSimpleName().toUpperCase();
	}
	
	public String getDV() {
		return "d4";
	}
}
