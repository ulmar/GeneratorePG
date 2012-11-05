package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Halfling extends Razza{
	
	public Halfling(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz - 2;
		this.des = des + 2;
		this.cos = cos;
		this.inte = inte;
		this.sag = sag;
		this.car = car;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTratti() {
		String result = "\n • +2 alla Destrezza, -2 alla Forza : Gli halfling sono veloci, agili ed esperti con le armi a distanza, ma sono piccoli e quindi meno forti degli altri umanoidi." +
						"\n • Taglia Piccola : Essendo creature di taglia Piccola gli halfling guadagnano un bonus di taglia +1 alla Classe Armatura, un bonus di taglia +1 al tiro per colpire e un bonus di taglia +4 alle prove di Nascondersi, ma devono utilizzare armi più piccole di quelle usate dagli umani, e la loro capacità di carico e di sollevamento è tre quarti di quella delle creature di taglia Media." +
						"\n • La velocità base sul terreno degli halfling è 6 metri." +
						"\n • Bonus razziale di +2 alle prove di Muoversi Silenziosamente, Saltare e Scalare : Gli halfling sono agili, sicuri e atletici." +
						"\n • Bonus razziale di +1 a tutti i tiri salvezza: Gli halfling sono sorprendentemente bravi nell'evitare gli infortuni." +
						"\n • Bonus morale di +2 ai tiri salvezza contro paura: Questo bonus si somma al bonus di +1 degli halfling ai tiri salvezza in generale." +
						"\n • Bonus razziale di +t all'attacco con armi da lancio e fionde: Lanciare pietre a mano e con la fionda è una disciplina universale tra gli  halfling, i quali sviluppano soprattutto una buona mira." +
						"\n • Bonus razziale di +2 alle prove di Ascoltare: Gli halfling hanno l'orecchio fine." +
						"\n • Linguaggi automatici : Comune e Halfling . Linguaggi bonus: Elfico, Gnomesco, Goblin, Nanico e Orchesco. Gli halfling intelligenti imparano i linguaggi dei loro amici e nemici." +
						"\n • Classe preferita: Ladro. La classe ladro di un halfling multiclasse non conta quando si determina se subisce una penalità ai punti esperienza.";
		return result;
	}
	
	public String getTitoloTratti() {
		return "TRATTI RAZZIALI HALFLING";
	}

}
