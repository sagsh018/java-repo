package org.devops.vehicles;

import org.devops.parent.*;

public class Bike extends Vehicle {
	private String handle;
	
	// Notice here in default constructor of Bike class, default constructor of Vehicle class will be called
	public Bike() {
		super();
		handle = "straight";
	}
	
	public Bike(String handle, String engine, int wheels, int seats, int fueltank, String lights) {
		super(engine, wheels, seats, fueltank, lights); // this will call parameterized constructor of parent class
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}
	
	// toString() method always return string value.
	public String toString() {
		return "Bike handle is " + getHandle() + "\n" + "Bike engin is " + getEngine() + "\n" + "Bike wheels are " + getWheels() + "\n" +
					"Bike seats are " + getSeats() + "Bike fueltank is " + getFuelTank() + "L\n" + "Bike lights are " + getLights();
	}
	
	// overriding the parent class method run()
		public void run() {
			System.out.println("========================================");
			System.out.println("running bike");
			System.out.println(toString());
		}
}
