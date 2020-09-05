package org.composition.laptop.components;

public class GraphicsCard {
	private String brand;
	private int series;
	private String memory;
	
	public GraphicsCard() {
		brand = "nvidia";
		series = 940;
		memory = "2 GB";
	}
	
	public GraphicsCard(String brand, int series, String memory) {
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}
	
	public String toString() {
		return "brand : " + brand + "\n" + "series : " + series + "\n" + "memory : " + memory;
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}
}
