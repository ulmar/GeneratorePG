package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Gnomo extends Razza{
	
	public Gnomo(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz - 2;
		this.des = des;
		this.cos = cos + 2;
		this.inte = inte;
		this.sag = sag;
		this.car = car;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTitoloTratti() {
		return "TRATTI RAZZIALI GNOMESCHI";
	}
	
	public String getTratti() {
		String result = "\n � +2 alla Costituzione, -2 alla Forza: Come i nani, gli gnomi sono robusti, ma sono piccoli e quindi non sono forti come gli umanoidi pi� grandi." +
						"\n � Taglia Piccola : Essendo creature di taglia Piccola gli gnomi guadagnano un bonus di taglia +1 alla Classe Armatura, un bonus di taglia +1 al tiro per colpire e un bonus di taglia +4 alle prove di Nascondersi, ma devono utilizzare armi pi� piccole di quelle usate dagli umani, e la loro capacit� di carico e di sollevamento � tre quarti di quella delle creature di taglia Media." +
						"\n � La velocit� base sul terreno degli gnomi � 6 metri." +
						"\n � Visione crepuscolare : Gli gnomi possono vedere due volte pi� lontano di un umano alla luce della luna, delle stelle, di una torcia e simili. Mantengono la capacit� di distinguere colori e dettagli in queste condizioni di scarsa visibilit�. " +
						"\n � Familiarit� nelle armi : Gli gnomi considerano i martelli picca-gnomeschi come se fossero armi da guerra anzich� armi esotiche." +
						"\n � Bonus razziale di +2 ai tiri salvezza contro illusioni : Gli gnomi hanno una conoscenza innata delle illusioni di ogni tipo." +
						"\n � Aggiungere +1 alla Classe Difficolt� di tutti i tiri salvezza contro gli incantesimi di illusione lanciati dagli gnomi . La loro innata, familiarit� con questi effetti rende pi� difficile vedere aura verso le loro illusioni. Questo modificatore � cumulativo con quelli di altri effetti similari come ad esempio il talento Incantesimi Focalizzati." +
						"\n � Bonus razziale di +1 al tiro per colpire contro coboldi e goblinoidi (goblin, hobgoblin e bugbear): Gli gnomi combattono spesso con queste creature e utilizzano tecniche speciali per affrontarle ." +
						"\n � Bonus di schivare +4 alla Classe Armatura contro mostri giganti (come ogre, troll e giganti delle colline): Questo bonus rappre-senta l'addestramento speciale a cui sono sottoposti gli gnomi, durante il quale imparano trucchi che le precedenti generazioni hanno sviluppato nei loro scontri con i giganti. Ogni volta che un personaggio perde il suo bonus positivo di Destrezza (se presente) alla Classe Armatura, come quando � colto alla sprovvista, perde anche i suoi bonus di schivare." +
						"\n � Bonus razziale di +2 alle prove di Ascoltare : Gli gnomi hanno l'udito fine." +
						"\n � Bonus razziale di +2 alle prove di Artigianato (alchimia): Il naso sensibile di uno gnomo gli permette di determinare un processo alchemico dall'odore." +
						"\n � Linguaggi automatici : Comune e Gnomesco . Linguaggi bonus: Draconico, Nanico, Elfico, Gigante, Goblin e Orchesco . Gli gnomi trattano pi� con gli elfi e i nani che non con gli altri e imparano anche i linguaggi dei loro nemici (coboldi, giganti, goblin e orchi). In pi�, uno gnomo pu� parlare con i mammiferi che vivono nelle tane (tassi, volpi, conigli ecc .). Questa � una capacit� innata per gli gnomi." +
						"\n � Capacit� magiche : 1 volta al giorno : parlare con gli animali (solo mammiferi che vivono nelle tane, durata 1 minuto). Uno gnomo con punteggio di Carisma di almeno 10 possiede inoltre le seguenti capacit� magiche: 1 volta al giorno: luci danzanti ,prestid�gilazione e suono fantasma. 1� livello dell'incantatore tiro salvezza CD 10 + modificatore di Carisma dello gnomo + livello dell'incantesimo." +
						"\n � Classe preferita : Bardo. La classe bardo di uno gnomo multiclasse non conta per determinare se subisce una penalit� ai punti esperienza.";
		return result;
	}

}
