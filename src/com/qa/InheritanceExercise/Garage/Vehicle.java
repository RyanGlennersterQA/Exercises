package com.qa.InheritanceExercise.Garage;

public class Vehicle {
	
	private boolean usedForTransport = true;
	private int numberOfWheels;
	private String levelOfProtection;
	
	private double doorReplacement;
	private double engineFix;
	private double seatReplacement;
	private int id;

	public Vehicle(boolean usedForTransport, int numberOfWheels, String levelOfProtection) {
		this.usedForTransport = usedForTransport;
		this.numberOfWheels = numberOfWheels;
		this.levelOfProtection = levelOfProtection;
	}
	
	public Vehicle(double doorReplacement, double engineFix, double seatReplacement, int id) {
		this.doorReplacement = doorReplacement;
		this.engineFix = engineFix;
		this.seatReplacement = seatReplacement;
		this.id = id;
	}

	public boolean isUsedForTransport() {
		return usedForTransport;
	}

	public void setUsedForTransport(boolean usedForTransport) {
		this.usedForTransport = usedForTransport;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getLevelOfProtection() {
		return levelOfProtection;
	}

	public void setLevelOfProtection(String levelOfProtection) {
		this.levelOfProtection = levelOfProtection;
	}

	public int getDoorReplacement() {
		return doorReplacement;
	}

	public void setDoorReplacement(int doorReplacement) {
		this.doorReplacement = doorReplacement;
	}

	public int getEngineFix() {
		return engineFix;
	}

	public void setEngineFix(int engineFix) {
		this.engineFix = engineFix;
	}

	public int getSeatReplacement() {
		return seatReplacement;
	}

	public void setSeatReplacement(int seatReplacement) {
		this.seatReplacement = seatReplacement;
	}
	
	
	
	
}
