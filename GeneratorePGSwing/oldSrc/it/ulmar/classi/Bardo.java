package it.ulmar.classi;

import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Razza;

import java.util.HashMap;

public class Bardo extends Classe{
	
	private final int modAbilita = CostantiPG.SEI;
	private final int modDadiMO = CostantiPG.QUATTRO;
	private final int tipoDadoMO = CostantiPG.QUATTRO;
	
	LivelloIncantesimoDTO[] primoLivello = { new LivelloIncantesimoDTO(1, 0, 2,
			4) };

	LivelloIncantesimoDTO[] secondoLivello = {
			new LivelloIncantesimoDTO(2, 0, 3, 5),
			new LivelloIncantesimoDTO(2, 1, 0, 2) };

	LivelloIncantesimoDTO[] terzoLivello = {
			new LivelloIncantesimoDTO(2, 0, 3, 6),
			new LivelloIncantesimoDTO(2, 1, 1, 3) };

	LivelloIncantesimoDTO[] quartoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 2, 3),
			new LivelloIncantesimoDTO(15, 2, 0, 3) };

	LivelloIncantesimoDTO[] quintoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 1, 3) };

	LivelloIncantesimoDTO[] sestoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 2, 3) };

	LivelloIncantesimoDTO[] settimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 2, 4),
			new LivelloIncantesimoDTO(15, 3, 0, 2) };

	LivelloIncantesimoDTO[] ottavoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 1, 3) };

	LivelloIncantesimoDTO[] nonoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 2, 3) };

	LivelloIncantesimoDTO[] decimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 2, 4),
			new LivelloIncantesimoDTO(15, 4, 0, 2) };

	LivelloIncantesimoDTO[] undicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 3, 4),
			new LivelloIncantesimoDTO(15, 4, 1, 3) };

	LivelloIncantesimoDTO[] dodicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 3, 4),
			new LivelloIncantesimoDTO(15, 4, 2, 3) };

	LivelloIncantesimoDTO[] tredicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 3, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 3, 4),
			new LivelloIncantesimoDTO(15, 4, 2, 4),
			new LivelloIncantesimoDTO(15, 5, 0, 2) };

	LivelloIncantesimoDTO[] quattordicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 4, 6),
			new LivelloIncantesimoDTO(15, 1, 3, 4),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 3, 4),
			new LivelloIncantesimoDTO(15, 4, 3, 4),
			new LivelloIncantesimoDTO(15, 5, 1, 3) };

	LivelloIncantesimoDTO[] quindicesimoLivello = {
			new LivelloIncantesimoDTO(15, 0, 4, 6),
			new LivelloIncantesimoDTO(15, 1, 4, 5),
			new LivelloIncantesimoDTO(15, 2, 3, 4),
			new LivelloIncantesimoDTO(15, 3, 3, 4),
			new LivelloIncantesimoDTO(15, 4, 3, 4),
			new LivelloIncantesimoDTO(15, 5, 2, 3) };

	LivelloIncantesimoDTO[] sedicesimoLivello = {
			new LivelloIncantesimoDTO(16, 0, 4, 6),
			new LivelloIncantesimoDTO(16, 1, 4, 5),
			new LivelloIncantesimoDTO(16, 2, 4, 4),
			new LivelloIncantesimoDTO(16, 3, 3, 4),
			new LivelloIncantesimoDTO(16, 4, 3, 4),
			new LivelloIncantesimoDTO(16, 5, 2, 4),
			new LivelloIncantesimoDTO(16, 6, 0, 2) };

	LivelloIncantesimoDTO[] diciassettesimoLivello = {
			new LivelloIncantesimoDTO(17, 0, 4, 6),
			new LivelloIncantesimoDTO(17, 1, 4, 5),
			new LivelloIncantesimoDTO(17, 2, 4, 5),
			new LivelloIncantesimoDTO(17, 3, 4, 5),
			new LivelloIncantesimoDTO(17, 4, 3, 4),
			new LivelloIncantesimoDTO(17, 5, 3, 4),
			new LivelloIncantesimoDTO(17, 6, 1, 3) };
	LivelloIncantesimoDTO[] diciottesimoLivello = {
			new LivelloIncantesimoDTO(18, 0, 4, 6),
			new LivelloIncantesimoDTO(18, 1, 4, 5),
			new LivelloIncantesimoDTO(18, 2, 4, 5),
			new LivelloIncantesimoDTO(18, 3, 4, 5),
			new LivelloIncantesimoDTO(18, 4, 4, 4),
			new LivelloIncantesimoDTO(18, 5, 3, 4),
			new LivelloIncantesimoDTO(18, 6, 2, 3) };
	LivelloIncantesimoDTO[] diciannovesimoLivello = {
			new LivelloIncantesimoDTO(19, 0, 4, 6),
			new LivelloIncantesimoDTO(19, 1, 4, 5),
			new LivelloIncantesimoDTO(19, 2, 4, 5),
			new LivelloIncantesimoDTO(19, 3, 4, 5),
			new LivelloIncantesimoDTO(19, 4, 4, 5),
			new LivelloIncantesimoDTO(19, 5, 4, 4),
			new LivelloIncantesimoDTO(19, 6, 3, 4) };
	LivelloIncantesimoDTO[] ventesimoLivello = {
			new LivelloIncantesimoDTO(20, 0, 4, 6),
			new LivelloIncantesimoDTO(20, 1, 4, 5),
			new LivelloIncantesimoDTO(20, 2, 4, 5),
			new LivelloIncantesimoDTO(20, 3, 4, 5),
			new LivelloIncantesimoDTO(20, 4, 4, 5),
			new LivelloIncantesimoDTO(20, 5, 4, 5),
			new LivelloIncantesimoDTO(20, 6, 4, 4) };
	
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
	
	private HashMap<Integer, TSndBABDTO> populateMap(){
		int i = 1;
		HashMap<Integer, TSndBABDTO> valori = new HashMap<Integer, TSndBABDTO>();
		valori.put(i++, new TSndBABDTO	(0,  0,  2, 2));
		valori.put(i++, new TSndBABDTO	(1,  0,  3, 3));
		valori.put(i++, new TSndBABDTO	(2,  1,  3, 3));
		valori.put(i++, new TSndBABDTO	(3,  1,  4, 4));
		valori.put(i++, new TSndBABDTO	(3,  1,  4, 4));
		valori.put(i++, new TSndBABDTO	(4,  2,  5, 5));
		valori.put(i++, new TSndBABDTO	(5,  2,  5, 6));
		valori.put(i++, new TSndBABDTO	(6,  2,  6, 6));
		valori.put(i++, new TSndBABDTO	(6,  3,  6, 6));
		valori.put(i++, new TSndBABDTO	(7,  3,  7, 7));
		valori.put(i++, new TSndBABDTO	(8, 3,  7, 7));
		valori.put(i++, new TSndBABDTO	(9, 4,  8, 8));
		valori.put(i++, new TSndBABDTO	(9, 4,  8, 8));
		valori.put(i++, new TSndBABDTO	(10, 4,  9, 9));
		valori.put(i++, new TSndBABDTO	(11, 5,  9, 9));
		valori.put(i++, new TSndBABDTO	(12, 5, 10, 10));
		valori.put(i++, new TSndBABDTO	(12, 5, 10, 10));
		valori.put(i++, new TSndBABDTO	(13, 6, 11, 11));
		valori.put(i++, new TSndBABDTO	(14, 6, 11, 11));
		valori.put(i++, new TSndBABDTO	(15, 6, 12, 12));
		
		return valori;
	}
	
	public Bardo(int liv, Razza razza){
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
	
	public String getDenominazione(){
		return "il "+this.getClass().getSimpleName().toUpperCase();
	}
	
	public String getDV() {
		return "d6";
	}
}
