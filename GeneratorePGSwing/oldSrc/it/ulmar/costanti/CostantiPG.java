package it.ulmar.costanti;

import it.ulmar.classi.*;

import java.util.ArrayList;

public class CostantiPG {
	
	public final static int DIECI = 10;
	public final static int DUE = 2;
	public final static int UNO = 1;
	public final static int TRE = 3;
	public final static int CINQUE = 5;
	public final static int SEI = 6;
	public final static int SETTE = 7;
	public final static int OTTO = 8;
	public final static int NOVE = 9;
	public final static int QUATTRO = 4;
	public final static int DODICI = 12;
	public final static int VENTI = 20;
	public final static int SEDICI = 16;
	public final static int QUINDICI = 15;
	public final static int DICIOTTO = 18;
	
	public final static String FRASE_NOME_PG = "Inserire il nome dell'eroe: ";
	public final static String FRASE_FORZA_PG = "Inserire il valore della forza: ";
	public final static String FRASE_DESTREZZA_PG = "Inserire il valore della destrezza: ";
	public final static String FRASE_COSTITUZIONE_PG = "Inserire il valore della costituzione: ";
	public final static String FRASE_INTELLIGENZA_PG = "Inserire il valore della intelligenza: ";
	public final static String FRASE_SAGGEZZA_PG = "Inserire il valore della saggezza: ";
	public final static String FRASE_CARISMA_PG = "Inserire il valore della carisma: ";
	public final static String FRASE_LIVELLO_PG = "Inserire il livello dell'eroe: ";
	public final static String FRASE_RAZZA_PG = "Scegli la razza del tuo eroe: ";
	public final static String FRASE_CLASSE_PG = "Scegli la classe del tuo eroe: ";
	
	public final static String FORZA = "for";
	public final static String DESTREZZA = "des";
	public final static String COSTITUZIONE = "cos";
	public final static String INTELLIGENZA = "int";
	public final static String SAGGEZZA = "sag";
	public final static String CARISMA = "car";
	
	public final static String TEXT_DANNO = "dado dell'arma + ";
	
	public final static char A_ACCENTATA_MAIUSC = (char) 193;
	
	public static ArrayList<String> getListaCar(){
		ArrayList<String> listaCar = new ArrayList<String>();
		listaCar.add(FORZA);
		listaCar.add(DESTREZZA);
		listaCar.add(COSTITUZIONE);
		listaCar.add(INTELLIGENZA);
		listaCar.add(SAGGEZZA);
		listaCar.add(CARISMA);
		
		return listaCar;
	}
	
	@SuppressWarnings("rawtypes")
	public static ArrayList<Class> getListaIncantatori(){
		ArrayList<Class> listaIncantatori = new ArrayList<Class>();
		
		listaIncantatori.add(Bardo.class);
		listaIncantatori.add(Chierico.class);
		listaIncantatori.add(Druido.class);
		listaIncantatori.add(Mago.class);
		listaIncantatori.add(Paladino.class);
		listaIncantatori.add(Ranger.class);
		listaIncantatori.add(Stregone.class);
		
		return listaIncantatori;
	}
}
