package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Elfo extends Razza{
	
	public Elfo(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz;
		this.des = des + 2;
		this.cos = cos - 2;
		this.inte = inte;
		this.sag = sag;
		this.car = car;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTratti() {
		String result = "\n• +2 alla Destrezza e -2 alla Costituzione : Gli elfi sono aggraziati ma deboli. La grazia di un elio lo rende per natura migliore nella furtività e nel tiro con l'arco." +
						"\n• Taglia Media: Essendo creature di taglia Media, gli elfi non hanno bonus o penalità derivanti dalla loro taglia." +
						"\n• La velocità base sul terreno degli elfi è 9 metri." +
						"\n• Immunità agli incantesimi ed effetti magici di sonno e un bonus razziale di +2 ai tiri salvezza contro incantesimi o effetti di ammaliamento." +
						"\n• Visione crepuscolare: Gli elfi possono vedere due volte più lontano di un umano alla luce della luna, delle stelle, di una torcia e simili . Inoltre, mantengono la capacità di distinguere colori e dettagli in queste condizioni di scarsa visibilità." +
						"\n• Competenza nelle armi : Gli elfi ricevono i talenti Competenza nelle Armi da Guerra per spada lunga, stocco, arco lungo (incluso arco lungo composito) e arco corto (incluso arco corto composito), come talenti bonus. Gli elfi stimano molto le arti di maneggiare la spada e l'arco e per questo tutti gli elfi sono in grado di utilizzare queste armi." +
						"\n•Bonus razziale di +2 alle prove di Ascoltare, Cercare e Osservare; Un elfo che passa semplicemente in un raggio di 1,5 metri da una porta segreta o nascosta ha il diritto di effettuare una prova di Cercare per notarla come se la stesse espressamente cercando. I sensi di un elfo sono così acuti da concedergli praticamente un 'sesto senso' per i portali nascosti. Linguaggi automatici: Comune e Elfico. Linguaggi bonus: Draconico, Gnoll, Gnomesco, Goblin, Orchesco e Silvano. Gli elfi generalmente conoscono i linguaggi dei loro nemici e amici, così come il Draconico, il linguaggio comunemente trovato negli antichi torni della conoscenza segreta." +
						"\n• Classe preferita : Mago .La classe mago di un elfo multiclasse non conta per determinare se subisce una penalità ai punti esperienza. La magia viene spontaneamente agli elfi (talvolta dichiarano di averla inventata) e i guerrieri/maghi sono particolarment e diffusi tra di loro.";
		return result;
	}

	public String getTitoloTratti() {
		return "TRATTI RAZZIALI ELFICI";
	}

}
