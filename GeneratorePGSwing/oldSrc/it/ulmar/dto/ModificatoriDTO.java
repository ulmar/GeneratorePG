package it.ulmar.dto;

import it.ulmar.costanti.CostantiPG;

public class ModificatoriDTO {
	
	private int modForz;
	private int modDes; 
	private int modCos;
	private int modInte;
	private int modSag;
	private int modCar;
	
	public ModificatoriDTO(int forz, int des, int cos, int inte, int sag, int car) {
		this.modForz = (forz - CostantiPG.DIECI) / CostantiPG.DUE;
		this.modDes = (des - CostantiPG.DIECI) / CostantiPG.DUE;
		this.modCos = (cos - CostantiPG.DIECI) / CostantiPG.DUE;
		this.modInte = (inte - CostantiPG.DIECI) / CostantiPG.DUE;
		this.modSag = (sag - CostantiPG.DIECI) / CostantiPG.DUE;
		this.modCar = (car - CostantiPG.DIECI) / CostantiPG.DUE;
	}

	public int getModForz() {
		return modForz;
	}

	public void setModForz(int modForz) {
		this.modForz = modForz;
	}

	public int getModDes() {
		return modDes;
	}

	public void setModDes(int modDes) {
		this.modDes = modDes;
	}

	public int getModCos() {
		return modCos;
	}

	public void setModCos(int modCos) {
		this.modCos = modCos;
	}

	public int getModInte() {
		return modInte;
	}

	public void setModInte(int modInte) {
		this.modInte = modInte;
	}

	public int getModSag() {
		return modSag;
	}

	public void setModSag(int modSag) {
		this.modSag = modSag;
	}

	public int getModCar() {
		return modCar;
	}

	public void setModCar(int modCar) {
		this.modCar = modCar;
	}

	@Override
	public String toString() {
		return "ModificatoriDTO [modForz=" + modForz + ", modDes=" + modDes
				+ ", modCos=" + modCos + ", modInte=" + modInte + ", modSag="
				+ modSag + ", modCar=" + modCar + "]";
	}

}
