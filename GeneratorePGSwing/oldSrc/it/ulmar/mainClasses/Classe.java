package it.ulmar.mainClasses;

import it.ulmar.classi.Bardo;
import it.ulmar.classi.Chierico;
import it.ulmar.classi.Druido;
import it.ulmar.classi.Mago;
import it.ulmar.classi.Paladino;
import it.ulmar.classi.Ranger;
import it.ulmar.classi.Stregone;
import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.razze.Halfling;
import it.ulmar.razze.Umano;
import it.ulmar.utilities.LancioDado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Classe {
	
	private TSndBABDTO tsdto;
	private int ptiAbilita;
	private int mo;
	private Razza razza;
	private int liv;
	private HashMap<Integer, TSndBABDTO> valori;
	private HashMap<Integer, LivelloIncantesimoDTO[]> map;
	private int modDadiMO;
	private int tipoDadoMO;
	
//	public abstract ArrayList<LivelloIncantesimoDTO> getListaIncatesimi(int livello);
	
	protected Classe(){
		
	}
	
	public abstract String getDenominazione();
	
	public TSndBABDTO getTsdto() {
		return tsdto;
	}

	public void setTsdto(TSndBABDTO tsdto) {
		this.tsdto = tsdto;
	}

	public int getPtiAbilita() {
		return ptiAbilita;
	}

	public void setPtiAbilita(int ptiAbilita) {
		this.ptiAbilita = ptiAbilita;
	}

	public int getMo() {
		return mo;
	}

	public void setMo(int mo) {
		this.mo = mo;
	}

	public Razza getRazza() {
		return razza;
	}

	public void setRazza(Razza razza) {
		this.razza = razza;
	}

	public int getLiv() {
		return liv;
	}

	public void setLiv(int liv) {
		this.liv = liv;
	}
	
	protected int getNumeroAbilita(int modClasse) {
		int nAbilita;
		int nAbilitaPrimo = 0;
		int abilitaLivello;
		
		if(this.getRazza() instanceof Umano){
			nAbilitaPrimo = 4;
		}
		
		abilitaLivello = this.getRazza().getModificatoriDTO().getModInte() + modClasse;
		
		nAbilitaPrimo = nAbilitaPrimo + (abilitaLivello * CostantiPG.QUATTRO);
		
		if(this.getRazza() instanceof Umano){
			nAbilita = nAbilitaPrimo + ((this.getLiv() - 1) * (abilitaLivello + 1));
		} else {
			nAbilita = nAbilitaPrimo + ((this.getLiv() - 1) * abilitaLivello);
		}
		
		return nAbilita;
	}
	
	protected TSndBABDTO getStatBase(int liv) {
		TSndBABDTO result = null;
		result = this.valori.get(new Integer(liv));
		
		if(this.getRazza() instanceof Halfling){
			result.setRifl(result.getRifl() + CostantiPG.UNO);
			result.setTemp(result.getTemp() + CostantiPG.UNO);
			result.setVol(result.getVol() + CostantiPG.UNO);
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Classe [tsdto=" + tsdto + ", ptiAbilita=" + ptiAbilita
				+ ", mo=" + mo + ", razza=" + razza + ", liv=" + liv + "]";
	}

	public HashMap<Integer, TSndBABDTO> getValori() {
		return valori;
	}

	public void setValori(HashMap<Integer, TSndBABDTO> valori) {
		this.valori = valori;
	}
	
	protected int getMoneteOro() {
		return (LancioDado.numeroLanciDado(tipoDadoMO, modDadiMO)) * CostantiPG.DIECI;
	}

	public int getModDadiMO() {
		return modDadiMO;
	}

	public int getTipoDadoMO() {
		return tipoDadoMO;
	}

	public void setModDadiMO(int modDadiMO) {
		this.modDadiMO = modDadiMO;
	}

	public void setTipoDadoMO(int tipoDadoMO) {
		this.tipoDadoMO = tipoDadoMO;
	}
	
	public boolean isACaster(){
		
		if(this instanceof Chierico || this instanceof Mago || 
		   this instanceof Druido || this instanceof Stregone ||
		   this instanceof Bardo || this instanceof Paladino ||
		   this instanceof Ranger){
			return true;
		}else{
			return false;
		}
		
	}
	
	public ArrayList<LivelloIncantesimoDTO> getListaIncatesimi(int livello) {
		
		ArrayList<LivelloIncantesimoDTO> result = null;
		
		result = new ArrayList<LivelloIncantesimoDTO>(Arrays.asList(this.map.get(livello)));
		
		return result;
	}

	public HashMap<Integer, LivelloIncantesimoDTO[]> getMap() {
		return map;
	}

	public void setMap(HashMap<Integer, LivelloIncantesimoDTO[]> map) {
		this.map = map;
	}
	
	public abstract String getDV();

}
