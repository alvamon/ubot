package org.ubot.api;

import java.awt.Graphics;


/**
 * 
 * @author Troy
 *
 */
public abstract class Script extends ColourMethods{
	
	/**
	 * Optional on paint method.
	 * 
	 * @param g
	 */
	public void onRepaint(Graphics g){}
	
	/**
	 * On start method.
	 * 
	 * @throws InterruptedException
	 */
	public abstract void onStart() throws InterruptedException;
	
	/**
	 * Your script's main loop.
	 * The script will sleep for the returned amount of time in milliseconds.
	 * 
	 * @return long
	 * @throws InterruptedException
	 */
	public abstract long loop() throws InterruptedException;
	
	/**
	 * On end method.
	 * 
	 * @throws InterruptedException
	 */
	public abstract void onEnd() throws InterruptedException;
	
}
