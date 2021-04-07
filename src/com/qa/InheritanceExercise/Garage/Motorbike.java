package com.qa.InheritanceExercise.Garage;

public class Motorbike extends Vehicle {

	public Motorbike(boolean usedForTransport, int numberOfWheels, String levelOfProtection) {
		super(usedForTransport, numberOfWheels, levelOfProtection);
	}
	
	public Motorbike(double doorReplacement, double engineFix, double seatReplacement, int id) {
		super(doorReplacement, engineFix, seatReplacement, id);
	}
	
	private boolean wearAHelmet;

	public boolean isWearAHelmet() {
		return wearAHelmet;
	}

	public void setWearAHelmet(boolean wearAHelmet) {
		this.wearAHelmet = wearAHelmet;
	}
	
	

}
