package it.ulmar.mainClasses;

import it.ulmar.dto.ModificatoriDTO;

public abstract class Razza {
	
	protected int forz;
	protected int des; 
	protected int cos;
	protected int inte;
	protected int sag;
	protected int car;
	protected ModificatoriDTO modificatoriDTO;
	
	protected Razza(){
		
	}
	
	public int getForz() {
		return forz;
	}

	public void setForz(int forz) {
		this.forz = forz;
	}

	public int getDes() {
		return des;
	}

	public void setDes(int des) {
		this.des = des;
	}

	public int getCos() {
		return cos;
	}

	public void setCos(int cos) {
		this.cos = cos;
	}

	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public int getSag() {
		return sag;
	}

	public void setSag(int sag) {
		this.sag = sag;
	}

	public int getCar() {
		return car;
	}

	public void setCar(int car) {
		this.car = car;
	}

	public ModificatoriDTO getModificatoriDTO() {
		return modificatoriDTO;
	}

	public void setModificatoriDTO(ModificatoriDTO modificatoriDTO) {
		this.modificatoriDTO = modificatoriDTO;
	}
	
	public abstract String getTratti();
	
	public abstract String getTitoloTratti();
	
	@Override
	public String toString() {
		return "Razza [forz=" + forz + ", des=" + des + ", cos=" + cos
				+ ", inte=" + inte + ", sag=" + sag + ", car=" + car
				+ ", modificatoriDTO=" + modificatoriDTO + "]";
	}
	
}
