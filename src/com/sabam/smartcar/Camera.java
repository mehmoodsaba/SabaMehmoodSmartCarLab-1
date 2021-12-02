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
public class Camera implements SelfCheckCapable{
	
	private int shutterspeed;
	private float aperture;
	private int depthoffield;
	private VehicleControls vehiclecontrols;
	
	public Camera(int shutterspeed, float aperture, int depthoffield) {
		this.shutterspeed= shutterspeed;
		this.aperture= aperture;
		this.depthoffield= depthoffield;
		vehiclecontrols= new VehicleControls();
	}
	public void multimediaprocessing() {
	}
	
	public int numberofcameras() {
		return 3;
	}
// indicate multi-media processing that would be used to detect
// traffic pattern and traffic light to ensure the car drives correctly	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Multimedia Processing Camera";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, vehiclecontrols);
	}
}
