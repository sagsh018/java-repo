package org.sharma;

public class Car {
	// so lets define a attribute for a car, lets say its speed first
	
	private int speed;
	// notice this attribute here is defined as a provate variable. so if someone tries to access this variable and set the speed of car,
	// or get the current speed of car, they won't be able to do so.
	
	/*
	 * So but we need to have a method/function/functionality to set the speed and get the speed which can be used by outside world.
	 * that work will be done by below method
	 */
	
	/*
	 * Now introduce more properties for this car
	 */
	private String doors;
	private String engine;
	private String driver;
	
	
	
	// method to set the speed of car
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// notice the use of "this" keyword here, so that we can differentiate between the local variable speed to this method which passed as an
	// argument and the class variable "speed", which we are trying to set.
	// we can use different variable names as well, and in that case we won't require "this" keyword
	
	
	// method to get the speed of car
	public int getSpeed() {
		return speed;
	}
	
	/*
	 * Now let create the getters and setters for rest of the properties of this class
	 */
	public void setDoors(String doors) {
		this.doors = doors.toLowerCase();
	}
	public String getDoors() {
		return doors;
	}
	
	public void setEngine(String engine) {
		this.engine = engine.toLowerCase();
	}
	public String getEngine() {
		return engine;
	}
	
	public void setDriver(String driver) {
		this.driver = driver.toLowerCase();
	}
	public String getDriver() {
		return driver;
	}
	
	
	// Now we will add another functinality which is going to run the car if above all conditions will met
	public boolean setrun() {
		boolean flag = false;
		if (doors.equals("closed") && engine.equals("started") && driver.equals("boarded"))
			flag = true;
		return flag;
	}
	
	public String getRun() {
		if (speed > 0) {
			return "running";
		}
		else {
			return "not running";
		}
	}
	// Now go to your main mehtod class and try to create the object of this class and access it.
	
}
