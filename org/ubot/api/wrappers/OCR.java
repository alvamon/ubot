package org.ubot.api.wrappers;

import java.awt.Rectangle;

import org.ubot.api.ColourMethods;
import org.ubot.api.enums.OCRFont;
import org.ubot.ocr.TextReader;

/**
 * 
 * @author Troy
 *
 */
public class OCR {
	private ColourMethods cm;
	
	/**
	 * Constructor.
	 * 
	 * @param cm
	 */
	public OCR(ColourMethods cm){
		this.cm = cm;
	}
	
	/**
	 * Clean up.
	 */
	public void cleanUp(){
		this.cm = null;
	}
	
	/**
	 * Check the letters within a certain rectangle.
	 * Default tolerance is 30.
	 * 
	 * @param r
	 * @throws InterruptedException
	 */
	public String getText(Rectangle r, OCRFont fontName, int tolerance) throws InterruptedException{
		return TextReader.getText(cm, r, fontName, tolerance);
	}

}
