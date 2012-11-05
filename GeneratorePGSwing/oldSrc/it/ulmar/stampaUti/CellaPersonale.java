package it.ulmar.stampaUti;

import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class CellaPersonale extends PdfPCell{

	public CellaPersonale(){
		super();
		this.setVerticalAlignment(Element.ALIGN_MIDDLE);
	}
	
	public CellaPersonale(Phrase p){
		super(p);
		this.setVerticalAlignment(Element.ALIGN_MIDDLE);
	}
	
	public CellaPersonale(PdfPTable p){
		super(p);
		this.setVerticalAlignment(Element.ALIGN_MIDDLE);
	}
			
}
