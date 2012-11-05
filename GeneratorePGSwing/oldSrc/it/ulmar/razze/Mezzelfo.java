package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Mezzelfo extends Razza{
	
	public Mezzelfo(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz;
		this.des = des;
		this.cos = cos;
		this.inte = inte;
		this.sag = sag;
		this.car = car;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}
	
	public String getTratti() {
		String result = "\n • Taglia Media : Essendo creature di taglia Media, i mezzelfi non hanno bonus o penalità derivanti dalla loro taglia." +
						"\n • La velocità base sul terreno dei mezzelfi è 9 metri." +
						"\n • Immunità a incantesimi ed effetti magici di sonno e bonus, razziale di +2 ai tiri salvezza contro incantesimi o effetti di ammaliamento." +
						"\n • Visione crepuscolare: I mezzelfi possono vedere due volte più lontano di un umano alla luce della luna, delle stelle, di una torcia e simili . Mantengono la capacità di distinguere colori e dettagli in queste condizioni di scarsa visibilità." +
						"\n • Bonus razziale di +1 alle prove di Ascoltare, Cercare e Osservare: Non hanno come gli elfi la capacità di notare porte segrete semplicemente passandovi accanto. Hanno sensi sviluppati ma non come quelli di un elfo." +
						"\n • Bonus razziale di +2 alle prove di Diplomazia e Raccogliere Informazioni: I mezzelfi hanno un'inclinazione naturale verso le altre persone." +
						"\n • Sangue elfico : Per tutte le capacità e gli effetti speciali un mezzelfo è considerato un elfo. Ad esempio, i mezzelfi sono vulnerabili agli effetti speciali che influenzano gli elfi proprio come lo erano i loro genitori elfici e possono utilizzare oggetti magici che possono essere usati solamente da elfi." +
						"\n • Linguaggi automatici : Comune e Elfico . Linguaggi bonus: Qualsiasi (diversi dai linguaggi segreti come il Druidico). I mezzelfi hanno la versatilità e la vasta (ma superficiale) esperienza degli umani." +
						"\n • Classe preferita : Qualsiasi . Quando si determina se un mezzelfo multiclasse subisce una penalità ai punti esperienza, la sua classe di livello più alto non conta.";
		return result;
	}
	
	public String getTitoloTratti() {
		return "TRATTI RAZZIALI MEZZELFICI";
	}

}
