package org.ubot.api;

import java.awt.event.MouseEvent;

/**
 * 
 * @author Troy
 *
 */
public interface HumanMouseListener {
	public void mouseClicked(MouseEvent e);
	public void mouseMoved(MouseEvent e);
	public void mousePressed(MouseEvent e);
	public void mouseReleased(MouseEvent e);
	public void mouseDragged(MouseEvent e);
}