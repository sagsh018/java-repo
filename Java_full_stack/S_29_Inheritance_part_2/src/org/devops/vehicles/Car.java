package org.devops.vehicles;

import org.devops.parent.*;

public class Car extends Vehicle {
	private String steering;
	private String musicsystem;
	private String airconditioner;
	private String fridge;
	private String entertainmentsystem;
	
	// This is default constructor, assigning some default values to the attributes of this class
	public Car() {
		super();
		steering = "round";
		musicsystem = "JBL";
		airconditioner = "hitachi";
		fridge = "gedrej";
		entertainmentsystem = "sony";
	}
	
	
	// This is parameterized constructor with super() method call so that it can call parent class constructor as well.
	public Car(String steering, String musicsystem, String airconditioner, String fridge, String entertainmentsystem, String engine, int wheels, int seats, int fueltank, String lights) {
		super(engine, wheels, seats, fueltank, lights);
		this.steering = steering;
		this.musicsystem = musicsystem;
		this.airconditioner = airconditioner;
		this.fridge = fridge;
		this.entertainmentsystem = entertainmentsystem;
	}
	
	public String getSteering() {
		return steering;
	}
	
	public String getMusicSystem() {
		return musicsystem;
	}
	
	public String getAirconditioner() {
		return airconditioner;
	}
	
	public String getFridge() {
		return fridge;
	}
	
	public String getEntertainmentSystem() {
		return entertainmentsystem;
	}

	// setting up toString() method
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirconditioner()=" + getAirconditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
}
