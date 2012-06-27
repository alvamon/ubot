package org.ubot.api.methods.tabs;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import org.ubot.api.ColourMethods;
import org.ubot.api.Constants;

/**
 * 
 * @author Troy
 *
 */
public class Equipment {
	private ColourMethods cm;
	
	public Equipment(ColourMethods cm){
		this.cm = cm;
	}
	
	/**
	 * Clean up.
	 */
	public void cleanUp(){
		cm = null;
	}
	
	/**
	 * Check if the equipment tab is selected.
	 * 
	 * @return boolean
	 * @throws InterruptedException
	 */
	public boolean isSelected() throws InterruptedException{
		return (cm.checkColour(Constants.getScreenArea(), new Color(230,157,57), new Point(747,203),20));
	}
	
	/**
	 * Click the equipment tab.
	 * 
	 * @throws InterruptedException
	 */
	public void click() throws InterruptedException{
		Rectangle r = new Rectangle(674,171,28,33);
		int x = (int) ((r.getCenterX() - 5) + Constants.getRandom().nextInt(11));
		int y = (int) ((r.getCenterY() - 5) + Constants.getRandom().nextInt(11));

		cm.theMouse.click(x,y,cm.theMouse.LEFT_CLICK);
	}

}