package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Mezzorco extends Razza{
	
	public Mezzorco(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz + 2;
		this.des = des;
		this.cos = cos;
		this.inte = inte - 2;
		this.sag = sag;
		this.car = car - 2;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTratti() {
		String result = "\n • +2 alla Forza, -2 all'Intelligenza, -2 al Carisma: I mezzorchi sono forti, ma la loro eredità orchesca li rende ottusi e brutali." +
						"\n • Taglia Media : Essendo creature di taglia Media, i mezzorchi non hanno bonus o penalità derivanti dalla loro taglia." +
						"\n • La velocità base sul terreno dei mezzorchi è 9 metri." +
						"\n • Scurovisione : I mezzorchi (e gli orchi) possono vedere nell'oscurità fino a 18 metri. La scurovisione è solo in bianco e nero, ma per il resto è come una vista normale e i mezzorchi possono muoversi perfettamente in assenza di luce." +
						"\n • Sangue orchesco : Per tutti gli effetti correlati alla razza, un mezzorco è considerato un orco . Ad esempio, i mezzorchi sono vulnerabili agli effetti speciali che influenzano gli orchi proprio come lo erano i loro genitori orchi e possono utilizzare oggetti magici che possono essere usati solamente da orchi." +
						"\n • Linguaggi automatici : Comune e Orchesco. Linguaggi bonus: Draconico, Gigante, Gnoll, Goblin e Abissale . I mezzorchi più intelligenti (che sono rari) possono conoscere i linguaggi dei loro alleati o rivali." +
						"\n • Classe preferita: Barbaro. La classe barbaro di un mezzorco multiclasse non conta per determinare se subisce una penalità ai punti esperienza.";
		return result;
	}
	
	public String getTitoloTratti() {
		return "TRATTI RAZZIALI MEZZORCHESCHI";
	}

}
