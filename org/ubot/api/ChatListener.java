package org.ubot.api;

/**
 * 
 * @author Troy
 *
 */
public interface ChatListener {
	public void chatListener(String chatline) throws InterruptedException;
}