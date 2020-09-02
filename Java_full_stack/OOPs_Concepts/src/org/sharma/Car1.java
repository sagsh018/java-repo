package org.sharma;

public class Car1 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	// Now first we will create a constructor which will assign some static values to above attributes at the time of object creation for this
	// class.
	
	public Car1() {
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
	
	/*
	 * Now lets create one more constructor with dynamic argument which will be passed as a parameters to this while creating the instance 
	 * notice that here constructor will be overloaded as the name of constructor will ramain same on the name of class
	 * but the argument will be extra which were not there in previous constructor definition
	 */
	
	public Car1(String doors, String engine, String driver, int speed) {
		this.doors = doors.toLowerCase();
		this.engine = engine.toLowerCase();
		this.driver = driver.toLowerCase();
		this.speed = speed;
	}
	
	public String run() {
		System.out.println(doors);
		System.out.println(engine);
		System.out.println(driver);
		System.out.println(speed);
		
		if (doors.equals("closed") && engine.equals("on") && driver.equals("present") && speed > 0) {
			return "running";
		}
		else {
			return "not running";
		}
	}
}
