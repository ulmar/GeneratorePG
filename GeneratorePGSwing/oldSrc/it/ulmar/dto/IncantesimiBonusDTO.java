package it.ulmar.dto;

public class IncantesimiBonusDTO {
	
	private int modCaratteristica;
	private int primoLiv;
	private int secondoLiv;
	private int terzoLiv;
	private int quartoLiv;
	private int quintoLiv;
	private int sestoLiv;
	private int settimoLiv;
	private int ottavoLiv;
	private int nonoLiv;
	
	public IncantesimiBonusDTO(int modCaratteristica, int primoLiv, int secondoLiv, int terzoLiv, int quartoLiv, int quintoLiv, int sestoLiv, int settimoLiv, int ottavoLiv, int nonoLiv){
		this.modCaratteristica = modCaratteristica;
		this.primoLiv = primoLiv;
		this.secondoLiv = secondoLiv;
		this.terzoLiv = terzoLiv;
		this.quartoLiv = quartoLiv;
		this.quintoLiv = quintoLiv;
		this.sestoLiv = sestoLiv;
		this.settimoLiv = settimoLiv;
		this.ottavoLiv = ottavoLiv;
		this.nonoLiv = nonoLiv;
	}
	
	public int getModCaratteristica() {
		return modCaratteristica;
	}
	public void setModCaratteristica(int modCaratteristica) {
		this.modCaratteristica = modCaratteristica;
	}
	public int getPrimoLiv() {
		return primoLiv;
	}
	public void setPrimoLiv(int primoLiv) {
		this.primoLiv = primoLiv;
	}
	public int getSecondoLiv() {
		return secondoLiv;
	}
	public void setSecondoLiv(int secondoLiv) {
		this.secondoLiv = secondoLiv;
	}
	public int getTerzoLiv() {
		return terzoLiv;
	}
	public void setTerzoLiv(int terzoLiv) {
		this.terzoLiv = terzoLiv;
	}
	public int getQuartoLiv() {
		return quartoLiv;
	}
	public void setQuartoLiv(int quartoLiv) {
		this.quartoLiv = quartoLiv;
	}
	public int getQuintoLiv() {
		return quintoLiv;
	}
	public void setQuintoLiv(int quintoLiv) {
		this.quintoLiv = quintoLiv;
	}
	public int getSestoLiv() {
		return sestoLiv;
	}
	public void setSestoLiv(int sestoLiv) {
		this.sestoLiv = sestoLiv;
	}
	public int getSettimoLiv() {
		return settimoLiv;
	}
	public void setSettimoLiv(int settimoLiv) {
		this.settimoLiv = settimoLiv;
	}
	public int getOttavoLiv() {
		return ottavoLiv;
	}
	public void setOttavoLiv(int ottavoLiv) {
		this.ottavoLiv = ottavoLiv;
	}
	public int getNonoLiv() {
		return nonoLiv;
	}
	public void setNonoLiv(int nonoLiv) {
		this.nonoLiv = nonoLiv;
	}

}
