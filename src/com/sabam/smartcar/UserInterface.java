/**
 * 
 */
package com.sabam.smartcar;

/**
 * @author Saba
 *
 */
public class UserInterface {
	private float gps;
	private float odometer;
	private String collisioncontrol;
	
	public float speed() { return odometer;}
	public float position() {return gps;}
	public void display () {}
	
	// gps is float since it calculates the longitude and latitude
	// to give position
	//user interface communicates with the driver and gives info
	//regarding car
	
	
	
	

}
