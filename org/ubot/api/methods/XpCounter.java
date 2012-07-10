package org.ubot.api.methods;

import java.awt.Rectangle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.ubot.api.ColourMethods;
import org.ubot.api.enums.OCRFont;

/**
 * 
 * @author Troy
 * 
 * Based on the concept by Kyle.
 *
 */
public class XpCounter {
	private ColourMethods cm;
	private final String XP_PLUS_PATTERN = "(.*?)xp";
	private String[] disallowedCharacters = new String[]{",","+","x","p"};
	private Rectangle xpArea = new Rectangle(367,4,123,25);
	
	public XpCounter(ColourMethods cm){
		this.cm = cm;
	}
	
	/**
	 * Get the current XP.
	 * 
	 * @return Integer
	 * @throws InterruptedException
	 */
	public int getXp() throws InterruptedException{
		try{
			String xp = cm.textReader.getText(xpArea, OCRFont.TOP_TEXT, 30);

			if(!xp.contains("No text found.")){
				String plus = getXpPlus(xp);
				xp = xp.replace(plus, "");
				
				for(String s : disallowedCharacters)
					xp = xp.replace(s, "");
				
				return Integer.parseInt(xp);
			}
		}catch(NumberFormatException e){return -1;};
		
		return -1;
	}
	
	/**
	 * Get the XP increase
	 * 
	 * @return Integer
	 * @throws InterruptedException
	 */
	public int getXpIncrease() throws InterruptedException{
		try{
			String xp = cm.textReader.getText(xpArea, OCRFont.TOP_TEXT, 30);

			if(!xp.contains("No text found.")){
				String plus = getXpPlus(xp);
	
				for(String s : disallowedCharacters)
					plus = plus.replace(s, "");
					
				return Integer.parseInt(plus);
			}
		}catch(NumberFormatException e){return -1;}
		
		return -1;
	}
	
	/**
	 * Get the plus XP.
	 * 
	 * @param xp
	 * @return String
	 * @throws InterruptedException
	 */
	private String getXpPlus(String xp) throws InterruptedException{
		Pattern p = Pattern.compile(XP_PLUS_PATTERN);
		Matcher regexMatcher = p.matcher(xp);
		if(regexMatcher.find())
			return regexMatcher.group().replace("+", "");
		else
			return "";	
	}

}
