package org.sharma.phone;

public class Phones {
	private String model;
	
	public Phones(String model) {
		this.model = model;
	}
	
	public void features() {
		System.out.println("Feature phone");
	}
	
	public String getModel() {
		return model;
	}
}
