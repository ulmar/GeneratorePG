package it.ulmar.test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class Test {
	
	/*
	 * This class is part of the book "iText in Action - 2nd Edition"
	 * written by Bruno Lowagie (ISBN: 9781935182610)
	 * For more info, go to: http://itextpdf.com/examples/
	 * This example only works with the AGPL version of iText.
	 */
	 
	
	 
	    /** Path to the resulting PDF file. */
	    public static final String RESULT
	        = "/hello.pdf";
	 
	    /**
	     * Creates a PDF file: hello.pdf
	     * @param    args    no arguments needed
	     */
	    public static void main(String[] args)
	    	throws DocumentException, IOException {
	    	new Test().createPdf(RESULT);
	    }
	 
	    /**
	     * Creates a PDF document.
	     * @param filename the path to the new PDF document
	     * @throws    DocumentException 
	     * @throws    IOException 
	     */
	    public void createPdf(String filename)
		throws DocumentException, IOException {
	        // step 1
	        Document document = new Document();
	        // step 2
	        PdfWriter pdf = PdfWriter.getInstance(document, new FileOutputStream(filename));
	        pdf.setCompressionLevel(0);
	        // step 3
	        document.open();
	        // step 4
	        document.add(new Paragraph("Hello World!"));
	    	//Codice aggiunta immagine - INIZIO
	    	URL url = ClassLoader.getSystemResource("it/ulmar/img/dnd_logo.jpg");
	    	Image img = Image.getInstance(url);
	    	img.scaleToFit(125, 36);
//	    	img.setAbsolutePosition((PageSize.A4.getWidth() - img.getScaledWidth()) / 2,(PageSize.A4.getHeight() - img.getScaledHeight()) / 2);
	    	img.setAbsolutePosition(10,PageSize.A4.getHeight()-img.getScaledHeight()-10);
	        pdf.getDirectContent().addImage(img);
	      //Codice aggiunta immagine - FINE
	        // step 5
	        document.addAuthor("ULMAR");
	        document.addCreator("ULMAR");
	        document.close();
	    }
	}

