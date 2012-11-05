package it.ulmar.razze;

import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.mainClasses.Razza;

public class Umano extends Razza{
	
	public Umano(int forz, int des, int cos, int inte, int sag, int car){
		this.forz = forz;
		this.des = des;
		this.cos = cos;
		this.inte = inte;
		this.sag = sag;
		this.car = car;
		super.setModificatoriDTO(new ModificatoriDTO(this.forz, this.des, this.cos, this.inte, this.sag, this.car));
	}

	public String getTitoloTratti(){
		return "TRATTI RAZZIALI UMANI";
	}
	
	public String getTratti() {
		String result =   "� Taglia Media: Essendo creature di taglia Media, gli umani non hanno bonus o penalit� derivanti dalla loro taglia." +
						"\n� La velocit� base sul terreno degli umani � 9 metri." +
						"\n� 1 talento extra al 1� livello, poich� gli umani sono veloci nell'eseguire alla perfezione lavori specializzati e differenziati nei loro talenti." +
						"\n� 4 punti abilit� extra al 1� livello e 1 punto abilit� extra ad ogni, livello addizionale, poich� gli umani sono versatili e competenti.(i 4 punti abilit� al 1� livello sono aggiunti come bonus e non devono essere moltiplicati)"+
						"\n� Linguaggio automatico: Comune . Linguaggi bonus :Qualsiasi tranne i linguaggi segreti come il Druidico). Gli umani si uniscono a tutti i generi di persone e di conseguenza possono imparare qualsiasi linguaggio utilizzato in una certa zona." +
						"\n� Classe preferita: Qualsiasi. Quando si determina se un umano multiclasse subisce una penalit� ai punti esperienza, la sua classe del livello pi� alto non conta.";
		return result;
	}

}
