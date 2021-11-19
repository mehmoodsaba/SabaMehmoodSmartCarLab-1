/**
 * 
 */
package com.sabam.smartcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Saba
 *
 */
public class Car implements SelfCheckCapable {
	
	private String make;
	private String model;
	private int RegNumber;
	private Camera picture;
	
	
	public Car() {
		make = "Nissan";
		model = "Sentra";
		RegNumber = 0;
		int shutterspeed=10; 
		float aperture=(float) 9.5;
		int depthoffield=17;
		picture= new Camera(shutterspeed,aperture,depthoffield);
	
	}
	
	public void goforward() { }
	public void gobackward() {}
	public void stop() {}
	public void goleft() {}
	public void goright(){}
	
	{

	}
	
	// The methods indicate various functions a car can do
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Car myCar = new Car();
		 myCar.runSelfCheck();
		// TODO Auto-generated method stub

	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Smart Car Design" ;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
