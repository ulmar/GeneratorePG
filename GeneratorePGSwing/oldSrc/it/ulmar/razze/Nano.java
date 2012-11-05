package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Nano extends Razza{
	
	public Nano(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz;
		this.des = des;
		this.cos = cos + 2;
		this.inte = inte;
		this.sag = sag;
		this.car = car - 2;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTratti() {
		String result = "\n� +2 alla Costituzione e -2 al Carisma : I nani sono muscolosi e robusti, ma tendono ad essere burberi e riservati." +
						"\n� Taglia Media : Essendo creature di taglia Media, i nani non hanno bonus o penalit� derivanti dalla loro taglia . " +
						"\n� La velocit� base sul terreno dei nani � 6 metri . Tuttavia i nani possono muoversi a questa velocit� anche quando indossano armature medie o pesanti oppure quando trasportano un carico medio o pesante (a differenza delle altre creature, la cui velocit� � ridotta in situazioni di questo tipo)." +
						"\n� Scurovisione : I nani possono vedere nell'oscurit� fino a 18 metri. La scurovisione � solo in bianco e nero, ma per il resto � come una vista normale e i nani possono muoversi perfettamente in assenza di luce." +
						"\n� Esperto minatore : Ottengono un bonus razziale di +2 alle prove di Cercare per individuare strane opere in muratura, come pareti mobili, trappole di pietra, nuove costruzioni (anche quando costruite per completare le vecchie), pendenze di pietra, soffitti di roccia precari e simili. Ci� che non � pietra ma che simula la pietra � considerato un'inusuale opera di muratura. Un nano che semplicemente arriva a meno di 3 metri dall'opera in muratura pu� effettuare una prova di Cercare come se la stesse cercando attivamente e un nano pu� utilizzare 1'abilit� Cercare per trovare trappole di pietra allo stesso modo dei ladri. Un nano pu� anche intuire la sua profondit� approssimativa sottoterra allo stesso modo in cui un umano ha la percezione di quale sia la direzione verso l'alto. I nani hanno un 'sesto senso' per i lavori in muratura, una capacit� innata che hanno molte opportunit� di esercitare e sviluppare nelle loro dimore sotterranee." +
						"\n� Familiarit� nelle armi : i nani considerano le asce da guerra naniche e gli urgrosh nanici come se fossero armi da guerra anzich� armi esotiche." +
						"\n� Stabilit� : I nani sono straordinariamente stabili sui loro piedi. Un nano ottiene un bonus di +4 alle prove di caratteristica effettuate per resistere alle spinte o agli sbilanciamenti quando si trovano sul terreno (ma non quando stanno arrampicandosi ,volando, cavalcando o comunque non si trovano in posizione stabile sul terreno)." +
						"\n� Bonus razziale di +2 ai tiri salvezza contro veleni : I nani sono robusti e resistenti alle tossine." +
						"\n� Bonus razziale di +2 ai tiri salvezza contro incantesimi ed effetti magici: I nani possiedono un'innata resistenza agli effetti magici." +
						"\n� Bonus razziale di +1 al tiro per colpire contro orchi (inclusi i mezzorchi) e goblinoidi (goblin, hobgoblin e bugbear): I nani sono addestrati in speciali tecniche di combattimento che permettono loro di lottare con i nemici pi� comuni in modo pi� efficace." +
						"\n� Bonus di schivare +4 alla Classe Armatura contro mostri giganti (come ogre, troll e giganti delle colline): Questo bonus rappresenta l'addestramento speciale a cui sono sottoposti i nani, durante il quale imparano trucchi che le precedenti generazioni hanno sviluppato nei loro scontri con i giganti. Ogni volta che un personaggio perde il suo bonus positivo di Destrezza (se presente) alla Classe Armatura, come quando � colto alla sprovvista, perde anche i suoi bonus di schivare." +
						"\n� Bonus razziale di +2 alle prove di Valutare inerenti ad oggetti in pietra o in metallo: I nani sono esperti di oggetti di valore di ogni tipo (specialmente a quelli in pietra o in metallo)." +
						"\n� Bonus razziale di +2 alle prove di Artigianato inerenti ad oggetti in pietra o in metallo : I nani sono particolarmente esperti nelle opere in metallo e in pietra ." +
						"\n� Linguaggi automatici: Comune e Nanico . Linguaggi bonus :Gigante, Gnomesco, Goblin, Orchesco,Terran e Sottocomune . I nani conoscono i linguaggi dei loro nemici e dei loro alleati sotterranei ." +
						"\n� Classe preferita: Guerriero. La classe guerriero di un nano multiclasse non conta per determinare se subisce una penalit� ai punti esperienza. La cultura nanica esalta le virt� del combaente, che loro possiedono innate.";
		return result;
	}

	public String getTitoloTratti() {
		return "TRATTI RAZZIALI NANICI";
	}

}
