package it.ulmar.dto;

import java.util.ArrayList;
import java.util.HashMap;

public class LivelloIncantesimoDTO {
	
	private int livello;
	private int livelloMagia;
	private int numeroIncantesimiGg;
	private int incantesimiConosciuti;
	
	public LivelloIncantesimoDTO(){
	}
	
	public LivelloIncantesimoDTO(int livello, int livMagia, int numeroIncantesimiGg, int incantesimiConosciuti) {
		this.livello = livello;
		this.livelloMagia = livMagia;
		this.numeroIncantesimiGg = numeroIncantesimiGg;
		this.incantesimiConosciuti = incantesimiConosciuti;
	}
	
	private static HashMap<Integer, int[]> populateMapIncantesimiBonus(){
		HashMap<Integer, int[]> incantesimiBonus = new HashMap<Integer, int[]>();
		int pos = 1;
		incantesimiBonus.put(pos++, new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 1, 1, 1, 1, 0, 0, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 2, 1, 1, 1, 1, 0, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 2, 2, 1, 1, 1, 1, 0, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 2, 2, 2, 1, 1, 1, 1, 0, 0});
		incantesimiBonus.put(pos++, new int[]{0, 2, 2, 2, 2, 1, 1, 1, 1, 0});
		incantesimiBonus.put(pos++, new int[]{0, 3, 2, 2, 2, 2, 1, 1, 1, 1});
		incantesimiBonus.put(pos++, new int[]{0, 3, 3, 2, 2, 2, 2, 1, 1, 1});
		return incantesimiBonus;
	}
	
	public int getLivelloMagia() {
		return livelloMagia;
	}
	public void setLivelloMagia(int livelloMagia) {
		this.livelloMagia = livelloMagia;
	}
	public int getNumeroIncantesimiGg() {
		return numeroIncantesimiGg;
	}
	public void setNumeroIncantesimiGg(int numeroIncantesimiGg) {
		this.numeroIncantesimiGg = numeroIncantesimiGg;
	}
	public int getIncantesimiConosciuti() {
		return incantesimiConosciuti;
	}
	public void setIncantesimiConosciuti(int incantesimiConosciuti) {
		this.incantesimiConosciuti = incantesimiConosciuti;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}
	
	public static void addIncantesimiBonus(int modCaratt, ArrayList<LivelloIncantesimoDTO> to){
		
		if(modCaratt == 0){
			return;
		}
		
		int[] inc = populateMapIncantesimiBonus().get(modCaratt);
		
		for(int i = 0; i<to.size(); i++){
			LivelloIncantesimoDTO incantesimo = to.get(i);
			incantesimo.setNumeroIncantesimiGg(incantesimo.getNumeroIncantesimiGg() + inc[i]);
		}
	}
}
