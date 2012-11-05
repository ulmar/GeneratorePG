package it.ulmar.dto;

public class TSndBABDTO {
	
	private int temp;
	private int rifl;
	private int vol;
	private int bab;
	
	public TSndBABDTO( int bab, int temp, int rifl, int vol){
		this.temp = temp;
		this.rifl = rifl;
		this.vol = vol;
		this.bab = bab;
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getRifl() {
		return rifl;
	}
	public void setRifl(int rifl) {
		this.rifl = rifl;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getBab() {
		return bab;
	}

	public void setBab(int bab) {
		this.bab = bab;
	}

	@Override
	public String toString() {
		return "TSndBABDTO [temp=" + temp + ", rifl=" + rifl + ", vol=" + vol
				+ ", bab=" + bab + "]";
	}

}
