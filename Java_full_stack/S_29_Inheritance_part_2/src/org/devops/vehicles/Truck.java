package org.devops.vehicles;

import org.devops.parent.*;

public class Truck extends Vehicle {
	private String steering;
	private String musicsystem;
	private String airconditioner;
	private int container;
	
	public Truck() {
		super();
		steering = "large";
		musicsystem = "boss";
		airconditioner = "voltas";
		container = 2;
	}

	public Truck(String steering, String musicsystem, String airconditioner, int container, String engine, int wheels, int seats, int fueltank, String lights) {
		super(engine, wheels, seats, fueltank, lights);
		this.steering = steering;
		this.musicsystem = musicsystem;
		this.airconditioner = airconditioner;
		this.container = container;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicsystem() {
		return musicsystem;
	}

	public String getAirconditioner() {
		return airconditioner;
	}

	public int getContainer() {
		return container;
	}

	// setting up toString()
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicsystem()=" + getMusicsystem()
				+ ", getAirconditioner()=" + getAirconditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}
	
}
