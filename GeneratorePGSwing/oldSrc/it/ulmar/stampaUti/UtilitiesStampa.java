package it.ulmar.stampaUti;

import it.ulmar.classi.Chierico;
import it.ulmar.costanti.CostantiPG;
import it.ulmar.dto.LivelloIncantesimoDTO;
import it.ulmar.dto.ModificatoriDTO;
import it.ulmar.dto.StampatoDTO;
import it.ulmar.dto.TSndBABDTO;
import it.ulmar.dto.TalentoDTO;
import it.ulmar.frame.PopUpDialog;
import it.ulmar.main.LogicController;
import it.ulmar.mainClasses.Classe;
import it.ulmar.mainClasses.Personaggio;
import it.ulmar.mainClasses.Razza;
import it.ulmar.razze.Elfo;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class UtilitiesStampa {
	
	private static final Font FONT_TITLE = new Font(FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
	private static final Font FONT_TITLE_TABLE = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.BLACK);
//	private static final Font FONT_TEXT_12 = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.BLACK);
	private static final Font FONT_TEXT_8 = new Font(FontFamily.TIMES_ROMAN, 8, Font.NORMAL, BaseColor.BLACK);
//	private static final Font FONT_TEXT_6 = new Font(FontFamily.TIMES_ROMAN, 6, Font.NORMAL, BaseColor.BLACK);
	
	private static Phrase frase(String s){
		return new Phrase(s, FONT_TEXT_8);
	}
	
	private static Phrase frase(String s, Font f){
		return new Phrase(s, f);
	}
	
	public static void creaStampa(StampatoDTO  stampaDTO, String pathToSave){
		try {
			creaStampaTrue(stampaDTO, pathToSave);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void creaStampaTrue(StampatoDTO  stampaDTO, String pathToSave) throws Exception{
		
		//Aggiungo la tabella delle stats
		Razza r;
		Classe c;
		Personaggio personaggio;
		TalentoDTO t;
		ArrayList<LivelloIncantesimoDTO> i;
		try {
			personaggio = stampaDTO.getPersonaggio();
			c = personaggio.getClasse();
			r = c.getRazza();
			t = stampaDTO.getTalentoDTO();
			i = stampaDTO.getListaIncantesimiDTO();
		} catch (Exception e) {
			r = new Elfo(12, 10, 16, 10, 10, 10);
			c = new Chierico(18, r);
			personaggio = new Personaggio("PLUTO", c);
			t = LogicController.handlerTalenti(personaggio);
			i = LogicController.checkIsACaster(personaggio);
		}
		
		String filename = pathToSave + "/" + personaggio.getNome() +".pdf";
		File file = new File(filename);
//		System.out.println(file.exists());
//		JOptionPane.showMessageDialog(new JPanel(), "Il file è stato salvato in "+file.getAbsolutePath(), "Info Salvataggio", JOptionPane.INFORMATION_MESSAGE);
		
		int result = -1;
		
		if(file.exists()){
			result = JOptionPane.showConfirmDialog(new PopUpDialog(), "Sovrascrivere " + personaggio.getNome() +".pdf", "Info Salvataggio", JOptionPane.YES_NO_OPTION);
		}else{
			JOptionPane.showMessageDialog(new PopUpDialog(), "Il file è stato salvato in "+file.getAbsolutePath(), "Info Salvataggio", JOptionPane.INFORMATION_MESSAGE);
		}
		
//		System.out.println(result);
		
		if(result == 0){
			//Sovrascrivere SI
		}else if(result == 1){
			//Sovrascrivere NO
			String newFilename = JOptionPane.showInputDialog(new PopUpDialog(), "Quale è il nuovo nome da utilizzare?");
			filename = pathToSave + "/" + newFilename +".pdf";
			file = new File(filename);
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		
		Document document = new Document();
		PdfWriter pdf = PdfWriter.getInstance(document,fos);
		document.open();
		pdf.setCompressionLevel(0);
		createHeader(pdf);
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		
		//Creo il titolo della stampa
		String title = "Scheda di " + personaggio.getNome() + " " + c.getDenominazione();
		Paragraph p1 = new Paragraph(title, FONT_TITLE);
		p1.setAlignment(Element.ALIGN_CENTER);
		document.add(p1);
		
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		
		//Tabella del personaggio
		PdfPTable primaTable = new PdfPTable(2);
		primaTable.setWidthPercentage(30);
		CellaPersonale firstCell1Col = new CellaPersonale();
		firstCell1Col.setHorizontalAlignment(Element.ALIGN_RIGHT);
		CellaPersonale firstCell2Col = new CellaPersonale();
		firstCell1Col.setPhrase(frase("NOME: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(personaggio.getNome()));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("RAZZA: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(r.getClass().getSimpleName().toUpperCase()));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("CLASSE: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(c.getClass().getSimpleName().toUpperCase()));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("LIVELLO: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(""+c.getLiv()));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("PTI FERITA: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(""+c.getLiv() + c.getDV()+" + "+(c.getLiv()*r.getModificatoriDTO().getModCos())));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("PTI ABILIT"+CostantiPG.A_ACCENTATA_MAIUSC+": ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(""+c.getPtiAbilita()));
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("TALENTI: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(""+t.getNumeroTalenti()+" talenti"));
		firstCell1Col.setRowspan(2);
		primaTable.addCell(firstCell1Col);
		primaTable.addCell(firstCell2Col);
		firstCell1Col.setPhrase(frase("TALENTI: ", FONT_TITLE_TABLE));
		firstCell2Col.setPhrase(frase(""+t.getNumeroTalentiBonus()+" talenti bonus"));
		primaTable.addCell(firstCell2Col);
		
		document.add(primaTable);
		
		document.add(new Paragraph(" "));
		
		//Creo il paragrafo delle tabelle
		PdfPCell cellVuota = new PdfPCell();
		cellVuota.disableBorderSide(PdfPCell.TOP);
		cellVuota.disableBorderSide(PdfPCell.BOTTOM);
		cellVuota.disableBorderSide(PdfPCell.LEFT);
		cellVuota.disableBorderSide(PdfPCell.RIGHT);
		
		PdfPTable p2 = new PdfPTable(5);
		p2.setTotalWidth(new float[]{5,1,6,1,8});
		p2.setWidthPercentage(90);
		PdfPCell cell = new PdfPCell(tableStat(r));
		p2.addCell(cell);
		p2.addCell(cellVuota);
		PdfPCell cell1 = new PdfPCell(tableTS(c));
//		cell1.setMinimumHeight(10);
		p2.addCell(cell1);
		
		p2.addCell(cellVuota);
		
		PdfPCell cell2 = new PdfPCell(tableCombat(personaggio));
		p2.addCell(cell2);
		
		document.add(p2);
		
		document.add(new Paragraph(" "));
		
		if(c.isACaster()){
			Paragraph par = new Paragraph(frase("LISTA INCANTESIMI", FONT_TITLE));
			par.setAlignment(Element.ALIGN_CENTER);
			
			document.add(par);
			document.add(new Paragraph(" "));
			document.add((listaIncantesimi(i, c)));
		}
		
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		
		document.add(new Paragraph(frase(r.getTitoloTratti(), FONT_TITLE)));
		document.add(new Paragraph(frase(r.getTratti())));
		
		document.addTitle(title);
		document.addAuthor("ULMAR");
        document.addCreator("ULMAR");
        document.close();
        
//		System.out.println("Il file è stato salvato in "+file.getAbsolutePath());
	}
	
	private static PdfPTable listaIncantesimi(ArrayList<LivelloIncantesimoDTO> i, Classe c){
		PdfPTable result = new PdfPTable(new float[]{4,2,2,2,2,2,2,2,2,2,2});
		
		CellaPersonale vuota = new CellaPersonale();
		vuota.disableBorderSide(PdfPCell.TOP);
		vuota.disableBorderSide(PdfPCell.LEFT);
		result.addCell(vuota);
		
		for(int k = 0; k<=9; k++){
			CellaPersonale cella = new CellaPersonale(frase(k +"°"));
			cella.setHorizontalAlignment(Element.ALIGN_CENTER);
			result.addCell(cella);
		}
		CellaPersonale incPreparabili = new CellaPersonale(frase("al giorno"));
		incPreparabili.setHorizontalAlignment(Element.ALIGN_CENTER);
		result.addCell(incPreparabili);
		
		String isCleric = ""; 
		
		int diff = 10 - i.size();
		
		for(int k = diff; k > 0; k--){
			i.add(null);
		}
		
		for(int k = 0; k<=9; k++){
			
			isCleric = c instanceof Chierico && i.get(k) != null && i.get(k).getLivelloMagia() > 0 ? " + 1" : "";
			
			String s = i.get(k) != null ? i.get(k).getNumeroIncantesimiGg() + isCleric : " - ";
			
			CellaPersonale cella = new CellaPersonale(frase(s));
			cella.setHorizontalAlignment(Element.ALIGN_CENTER);
			result.addCell(cella);
		}
		
		CellaPersonale incConosciuti = new CellaPersonale(frase("conosciuti"));
		incConosciuti.setHorizontalAlignment(Element.ALIGN_CENTER);
		result.addCell(incConosciuti);
		
		for(int k = 0; k<=9; k++){
			
			int conosciuti = i.get(k) != null ? i.get(k).getIncantesimiConosciuti() : -1;
			
			String s = conosciuti <= 0 || conosciuti == 99 ? " - " : ""+conosciuti;
			
			CellaPersonale cella = new CellaPersonale(frase(s));
			cella.setHorizontalAlignment(Element.ALIGN_CENTER);
			result.addCell(cella);
		}
		
		return result;
	}
	
	private static PdfPTable tableCombat(Personaggio personaggio) {
		PdfPTable result = new PdfPTable(new float[]{4,2,1,2,1,2,1,2});
		
		Classe c = personaggio.getClasse();
		Razza r = c.getRazza();
		ModificatoriDTO mDTO = r.getModificatoriDTO();
		
		int bab = c.getTsdto().getBab();
		int modFor = mDTO.getModForz();
		int modDes = mDTO.getModDes();
		
		PdfPCell cellUguale = new PdfPCell(new Phrase("=", FONT_TEXT_8));
		cellUguale.setHorizontalAlignment(Element.ALIGN_CENTER);
		PdfPCell cellPiu = new PdfPCell(new Phrase("+", FONT_TEXT_8));
		cellPiu.setHorizontalAlignment(Element.ALIGN_CENTER);
		cellUguale.disableBorderSide(PdfPCell.LEFT);
		cellUguale.disableBorderSide(PdfPCell.RIGHT);
		cellPiu.disableBorderSide(PdfPCell.LEFT);
//		cellUguale.disableBorderSide(PdfPCell.TOP);
//		cellPiu.disableBorderSide(PdfPCell.TOP);
		cellPiu.disableBorderSide(PdfPCell.RIGHT);
		
		PdfPCell cell = new PdfPCell(new Phrase("COMBATTIMENTO", FONT_TITLE_TABLE));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setColspan(8);
		result.addCell(cell);
		
		PdfPCell cellBab = new PdfPCell(frase("BAB :", FONT_TITLE_TABLE));
		cellBab.setHorizontalAlignment(Element.ALIGN_CENTER);
		cellBab.disableBorderSide(PdfPCell.RIGHT);
		result.addCell(cellBab);
		PdfPCell cellBabValue = new PdfPCell(frase(""+bab, FONT_TITLE_TABLE));
		cellBabValue.setHorizontalAlignment(Element.ALIGN_CENTER);
		cellBabValue.setColspan(7);
		cellBabValue.disableBorderSide(PdfPCell.LEFT);
		result.addCell(cellBabValue);
		
		PdfPCell cellText = new PdfPCell();
		cellText.disableBorderSide(PdfPCell.LEFT);
//		cellText.disableBorderSide(PdfPCell.TOP);
//		cellText.disableBorderSide(PdfPCell.BOTTOM);
		cellText.disableBorderSide(PdfPCell.RIGHT);
		cellText.setHorizontalAlignment(Element.ALIGN_CENTER);
//		cellText.setPaddingBottom(5);
		
		//Tiri per colpire Ranged
		cellText.setPhrase(frase("TxC R: ", FONT_TITLE_TABLE));
		result.addCell(cellText);
		
		cellText.setPhrase(frase("" + (bab + modDes)));
		result.addCell(cellText);
		
		result.addCell(cellUguale);
		
		cellText.setPhrase(frase("" + bab));
		result.addCell(cellText);
		
		result.addCell(cellPiu);
		
		cellText.setPhrase(frase("" + modDes));
		result.addCell(cellText);
		
		result.addCell(cellPiu);
		
		cellText.setPhrase(frase(" "));
		result.addCell(cellText);
		
		//Tiri per colpire melee
		cellText.setPhrase(frase("TxC M: ", FONT_TITLE_TABLE));
		cellText.disableBorderSide(PdfPCell.BOTTOM);
		result.addCell(cellText);
		
		cellText.setPhrase(frase("" + (bab + modFor)));
		result.addCell(cellText);
		
		cellUguale.disableBorderSide(PdfPCell.BOTTOM);
		result.addCell(cellUguale);
		
		cellText.setPhrase(frase("" + bab));
		result.addCell(cellText);
		
		cellPiu.disableBorderSide(PdfPCell.BOTTOM);
		result.addCell(cellPiu);
		
		cellText.setPhrase(frase("" + modFor));
		result.addCell(cellText);
		
		result.addCell(cellPiu);
		
		cellText.setPhrase(frase(" "));
		result.addCell(cellText);
		
		//Danni arma a una mano
		cellText.disableBorderSide(PdfPCell.TOP);
		cellText.setPaddingBottom(10);
		cellText.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cellText.setPhrase(frase("danni 1H: ", FONT_TITLE_TABLE));
		result.addCell(cellText);
		CellaPersonale cellDanni1H = new CellaPersonale(frase(CostantiPG.TEXT_DANNO + modFor));
		cellDanni1H.setHorizontalAlignment(Element.ALIGN_CENTER);
		cellDanni1H.setColspan(7);
		cellDanni1H.disableBorderSide(PdfPCell.LEFT);
		cellDanni1H.disableBorderSide(PdfPCell.TOP);
		cellDanni1H.setPaddingBottom(10);
		result.addCell(cellDanni1H);
		
		//Danni arma a due mani
		cellText.disableBorderSide(PdfPCell.TOP);
		cellText.setPhrase(frase("danni 2H: ", FONT_TITLE_TABLE));
		result.addCell(cellText);
		int b = (int) (modFor * 1.5);
		CellaPersonale cellDanni2H = new CellaPersonale(frase(CostantiPG.TEXT_DANNO + b));
		cellDanni2H.setHorizontalAlignment(Element.ALIGN_CENTER);
		cellDanni2H.setColspan(7);
		cellDanni2H.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cellDanni2H.disableBorderSide(PdfPCell.LEFT);
		result.addCell(cellDanni2H);
		
		return result;
	}
	
	private static PdfPTable tableStat(Razza razza) {
		 //Creo la tabella delle stats
		 
		 PdfPTable result = new PdfPTable(new float[]{4,2,2});
		 ModificatoriDTO mDTO = razza.getModificatoriDTO();
		 
		 PdfPCell cell = new PdfPCell(new Phrase("STATS", FONT_TITLE_TABLE));
		 cell.setColspan(3);
		 cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		 result.addCell(cell);
		 
		 result.addCell(new Phrase(CostantiPG.FORZA.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getForz()));
		 result.addCell(frase(mDTO.getModForz()>=0 ? "+"+mDTO.getModForz() : ""+mDTO.getModForz()));
		 result.addCell(new Phrase(CostantiPG.DESTREZZA.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getDes()));
		 result.addCell(frase(mDTO.getModDes()>=0 ? "+"+mDTO.getModDes() : ""+mDTO.getModDes()));
		 result.addCell(new Phrase(CostantiPG.COSTITUZIONE.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getCos()));
		 result.addCell(frase(mDTO.getModCos()>=0 ? "+"+mDTO.getModCos() : ""+mDTO.getModCos()));
		 result.addCell(new Phrase(CostantiPG.INTELLIGENZA.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getInte()));
		 result.addCell(frase(mDTO.getModInte()>=0 ? "+"+mDTO.getModInte() : ""+mDTO.getModInte()));
		 result.addCell(new Phrase(CostantiPG.SAGGEZZA.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getSag()));
		 result.addCell(frase(mDTO.getModSag()>=0 ? "+"+mDTO.getModSag() : ""+mDTO.getModSag()));
		 result.addCell(new Phrase(CostantiPG.CARISMA.toUpperCase(), FONT_TITLE_TABLE));
		 result.addCell(frase(""+razza.getCar()));
		 result.addCell(frase(mDTO.getModCar()>=0 ? "+"+mDTO.getModCar() : ""+mDTO.getModCar()));
		 
		 result.setHorizontalAlignment(Element.ALIGN_LEFT);
		 result.setWidthPercentage(20);
		 
		 return result;
	 }
	 
	private static PdfPTable tableTS(Classe classe) {
		 
		 Razza r = classe.getRazza();
		 TSndBABDTO t = classe.getTsdto();
		 ModificatoriDTO m = r.getModificatoriDTO();
		 
		 PdfPTable result = new PdfPTable(new float[]{2,1,2,1,2,1,2});
		 
		 PdfPCell cellUguale = new PdfPCell(new Phrase("=", FONT_TEXT_8));
		 cellUguale.setHorizontalAlignment(Element.ALIGN_CENTER);
		 PdfPCell cellPiu = new PdfPCell(new Phrase("+", FONT_TEXT_8));
		 cellPiu.setHorizontalAlignment(Element.ALIGN_CENTER);
		 
		 cellUguale.disableBorderSide(PdfPCell.LEFT);
		 cellUguale.disableBorderSide(PdfPCell.RIGHT);
		 cellPiu.disableBorderSide(PdfPCell.LEFT);
		 cellUguale.disableBorderSide(PdfPCell.TOP);
		 cellPiu.disableBorderSide(PdfPCell.TOP);
		 cellPiu.disableBorderSide(PdfPCell.RIGHT);
		 
		 PdfPCell cell = new PdfPCell(new Phrase("TIRI SALV.", FONT_TITLE_TABLE));
		 cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		 cell.setColspan(7);
		 result.addCell(cell);
		 
		 PdfPCell cellSubText = new PdfPCell();
		 cellSubText.setHorizontalAlignment(Element.ALIGN_CENTER);
		 cellSubText.setColspan(7);
		 cellSubText.disableBorderSide(PdfPCell.BOTTOM);
		 
		 PdfPCell cellText = new PdfPCell();
//		 cellText.disableBorderSide(PdfPCell.LEFT);
		 cellText.disableBorderSide(PdfPCell.TOP);
		 cellText.disableBorderSide(PdfPCell.RIGHT);
		 cellText.setHorizontalAlignment(Element.ALIGN_CENTER);
		 cellText.setPaddingBottom(5);
		 //Tempra
		 cellSubText.setPhrase(frase("TEMPRA"));
		 result.addCell(cellSubText);
		 
		 cellText.setPhrase(frase(""+(t.getTemp()+m.getModCos())));
		 result.addCell(cellText);
		 
		 result.addCell(cellUguale);
		 
		 cellText.disableBorderSide(PdfPCell.LEFT);
		 cellText.setPhrase(frase(""+t.getTemp()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.setPhrase(frase(""+m.getModCos()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.enableBorderSide(PdfPCell.RIGHT);
		 cellText.setPhrase(frase(" "));
		 result.addCell(cellText);
		 cellText.disableBorderSide(PdfPCell.RIGHT);
		 
		 //Riflessi
		 cellSubText.setPhrase(frase("RIFLESSI"));
		 result.addCell(cellSubText);
		 
		 cellText.enableBorderSide(PdfPCell.LEFT);
		 cellText.setPhrase(frase(""+(t.getRifl()+m.getModDes())));
		 result.addCell(cellText);
		 cellText.disableBorderSide(PdfPCell.LEFT);
		 
		 result.addCell(cellUguale);
		 
		 cellText.setPhrase(frase(""+t.getRifl()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.setPhrase(frase(""+m.getModDes()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.enableBorderSide(PdfPCell.RIGHT);
		 cellText.setPhrase(frase(" "));
		 result.addCell(cellText);
		 cellText.disableBorderSide(PdfPCell.RIGHT);
		 
		 //Volontà
		 cellSubText.setPhrase(frase("VOLONT" + CostantiPG.A_ACCENTATA_MAIUSC));
		 result.addCell(cellSubText);
		 
		 cellText.enableBorderSide(PdfPCell.LEFT);
		 cellText.setPhrase(frase(""+(t.getVol()+m.getModSag())));
		 result.addCell(cellText);
		 cellText.disableBorderSide(PdfPCell.LEFT);
		 
		 result.addCell(cellUguale);
		 
		 cellText.setPhrase(frase(""+t.getVol()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.setPhrase(frase(""+m.getModSag()));
		 result.addCell(cellText);
		 
		 result.addCell(cellPiu);
		 
		 cellText.enableBorderSide(PdfPCell.RIGHT);
		 cellText.setPhrase(frase(" "));
		 result.addCell(cellText);
		 cellText.disableBorderSide(PdfPCell.RIGHT);
		 
		 result.setHorizontalAlignment(Element.ALIGN_RIGHT);
		 result.setWidthPercentage(20);
		 
		 return result;
	 }
	
	private static void createHeader(PdfWriter pdf) throws Exception {
		URL url = ClassLoader.getSystemResource("it/ulmar/images/dnd_logo.jpg");
    	Image img = Image.getInstance(url);
    	img.scaleToFit(125, 36);
    	img.setAbsolutePosition(10,PageSize.A4.getHeight()-img.getScaledHeight()-10);
    	pdf.getDirectContent().addImage(img);
	}
}
