package org.composition.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private int generations;
	private int cores;
	private int threads;
	private String cachememory;
	private String frequency;
	private String minfrequency;
	private String maxfrequency;
	
	public Processor() {
		brand = "intel";
		series = "i 7";
		generations = 10;
		cores = 8;
		threads = 4;
		cachememory = "100 GB";
		frequency = "5 GHz";
		minfrequency = "1 GHz";
		maxfrequency = "10 GHz";
	}
	
	public Processor(String brand, String series, int generations, int cores, int threads, String cachememory,
			String frequency, String minfrequency, String maxfrequency) {
		this.brand = brand;
		this.series = series;
		this.generations = generations;
		this.cores = cores;
		this.threads = threads;
		this.cachememory = cachememory;
		this.frequency = frequency;
		this.minfrequency = minfrequency;
		this.maxfrequency = maxfrequency;
	}
	
	public String toString() {
		return "brand : " + brand + "\n" + "series : " + series + "\n" + "generations : " + generations + "\n" + "cores : " + cores + "\n" +
				"threads : " + threads +  "\n" + "cachememory : " + cachememory + "\n" + "frequency : " + frequency + "\n"
				+ "minfrequency : " + minfrequency + "\n" + "maxfrequency : " + maxfrequency;
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGenerations() {
		return generations;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCachememory() {
		return cachememory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinfrequency() {
		return minfrequency;
	}

	public String getMaxfrequency() {
		return maxfrequency;
	}
	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
}
