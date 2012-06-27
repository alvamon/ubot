package org.ubot.api.wrappers;

import org.ubot.input.Keyboard;

/**
 * 
 * @author Troy
 *
 */
public class TheKeyboard {
	private Keyboard k;
	
	public TheKeyboard(Keyboard k){
		this.k = k;
	}
	
	/**
	 * Clean up.
	 */
	public void cleanUp(){
		k = null;
	}
	
	/**
	 * Send your string with the option of pressing enter.
	 * 
	 * @param string
	 * @param pressEnter
	 * @throws InterruptedException
	 */
	public void sendKeys(String string, boolean pressEnter) throws InterruptedException{
		k.sendKeys(string, pressEnter);
	}
	
	/**
	 * Send a single character.
	 * 
	 * @param c
	 * @throws InterruptedException
	 */
	public void sendChar(char c) throws InterruptedException{
		k.sendChar(c);
	}
	
	/**
	 * Press enter.
	 * 
	 * @throws InterruptedException
	 */
	public void sendEnter() throws InterruptedException{
		k.sendEnter();
	}
	
	/**
	 * Press a key by keycode.
	 * 
	 * @param keyCode
	 * @throws InterruptedException
	 */
	public void keyPress(int keyCode) throws InterruptedException{
		k.keyPress(keyCode);
	}
	
	/**
	 * Release a key by keycode.
	 * 
	 * @param keyCode
	 * @throws InterruptedException
	 */
	public void keyRelease(int keyCode) throws InterruptedException{
		k.keyRelease(keyCode);
	}
}
