package org.composition.laptop;

import org.composition.laptop.components.*;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String harddrive;
	private GraphicsCard graphicscard;
	private String opticaldrive;
	private String keyboard;
	
	public Laptop() {
		screen = 15.7f;
		processor = new Processor();
		ram = "16 GB";
		harddrive = "2 TB";
		graphicscard = new GraphicsCard();
		opticaldrive = "MLT layer";
		keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String harddrive, GraphicsCard graphicscard,
			String opticaldrive, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.harddrive = harddrive;
		this.graphicscard = graphicscard;
		this.opticaldrive = opticaldrive;
		this.keyboard = keyboard;
	}
	
	public String toString() {
		return "screen : " + screen + "\n" + "Processor specification : " + processor + "\n" + "ram : " + ram + "\n" + "harddrive : " + harddrive
				+ "\n" + "graphicscard : " + graphicscard + "\n" + "opticaldrive : " + opticaldrive + "\n" +  "keyboard : " + keyboard;
	}
	
	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHarddrive() {
		return harddrive;
	}

	public GraphicsCard getGraphicscard() {
		return graphicscard;
	}

	public String getOpticaldrive() {
		return opticaldrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
	public String convertGaming() {
		processor.setFrequency(processor.getMaxfrequency());
		return "Success";
	}
}
