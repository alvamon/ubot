package org.ubot.api.wrappers;

import java.awt.Point;

import org.ubot.input.Mouse;


/**
 * 
 * @author Troy
 *
 */
public class TheMouse {
	private Mouse m;
	public int LEFT_CLICK = 16;
	public int MIDDLE_CLICK = 8;
	public int RIGHT_CLICK = 4;
	
	/**
	 * Construct a new mouse.
	 * 
	 * @param m
	 */
	public TheMouse(Mouse m){
		this.m = m;
	}
	
	/**
	 * Clean up.
	 */
	public void cleanUp(){
		m = null;
	}
	
	/**
	 * Mouse the mouse to your destination.
	 * 
	 * @param destination
	 * @throws InterruptedException
	 */
	public void move(Point destination) throws InterruptedException{
		m.move(destination);
	}
	
	/**
	 * Click the mouse at the selected point, specify the button mask to use.
	 * 
	 * for eg: theMouse.click(20,20,1); or theMouse.click(20,20,theMouse.LEFT_CLICK);
	 * 
	 * LEFT_CLICK = 16
	 * MIDDLE_CLICK = 8
	 * RIGHT_CLICK = 4
	 * 
	 * Or you can use 1,2,3 we will allow for this.
	 * 
	 * @param destination
	 * @param button_mask
	 * @throws InterruptedException
	 */
	public void click(Point destination, int button_mask) throws InterruptedException{
		m.click(destination,button_mask);
	}
	
	/**
	 * Mouse the mouse to your destination.
	 * 
	 * @param destination
	 * @throws InterruptedException
	 */
	public void move(int x, int y) throws InterruptedException{
		m.move(new Point(x,y));
	}
	
	/**
	 * Click the mouse at the selected point, specify the button mask to use.
	 * 
	 * for eg: theMouse.click(20,20,1); or theMouse.click(20,20,theMouse.LEFT_CLICK);
	 * 
	 * LEFT_CLICK = 16
	 * MIDDLE_CLICK = 8
	 * RIGHT_CLICK = 4
	 * 
	 * Or you can use 1,2,3 we will allow for this.
	 * 
	 * @param destination
	 * @param button_mask
	 * @throws InterruptedException
	 */
	public void click(int x, int y, int button_mask) throws InterruptedException{
		m.click(new Point(x,y),button_mask);
	}
	
	/**
	 * This will click the left mouse at the current position.
	 * 
	 * @throws InterruptedException
	 */
	public void click() throws InterruptedException{
		m.click(getMousePosition(), LEFT_CLICK);
	}
	
	/**
	 * Returns the mouses current position.
	 * 
	 * @return Point
	 * @throws InterruptedException
	 */
	public Point getMousePosition() throws InterruptedException{
		return m.getMousePosition();
	}
	
	/**
	 * Set the mouse position.
	 * 
	 * @param position
	 * @throws InterruptedException
	 */
	public void setMousePosition(Point position) throws InterruptedException{
		m.setMousePosition(position);
	}
	
	/**
	 * Return if the mouse is currently moving.
	 * 
	 * @return
	 */
	public boolean isMouseMoving(){
		return m.isMouseMoving();
	}
	
	/**
	 * Set the mouse moving true/false.
	 * 
	 * @param moving
	 */
	public void setMouseMoving(boolean moving){
		m.setMouseMoving(moving);
	}
	
	/**
	 * Scroll the mouse wheel.
	 * 
	 * @param scrollamount
	 * @throws InterruptedException
	 */
	public void scrollWheel(int scrollamount) throws InterruptedException{
		m.scrollWheel(scrollamount);
	}
	
	/**
	 * Set the mouse Spline.
	 * 
	 * @param ex
	 * @param ey
	 * @param ctrlSpacing
	 * @param ctrlVariance
	 */
	public void setSpline(int ex, int ey, int ctrlSpacing, int ctrlVariance){
		m.setSpline(ex,ey,ctrlSpacing,ctrlVariance);
	}

}
