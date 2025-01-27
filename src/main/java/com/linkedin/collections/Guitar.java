package com.linkedin.collections;

public class Guitar {

	private String make;

	private String model;

	private int numStrings;

	public Guitar(String make, String model, int numStrings) {
		super();
		this.make = make;
		this.model = model;
		this.numStrings = numStrings;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	@Override
	public String toString() {
		return "Guitar [make=" + make + ", model=" + model + "]";
	}
	
}
