package com.qa.InheritanceExercise.Garage;

public class Quadbike extends Vehicle {

	public Quadbike(boolean usedForTransport, int numberOfWheels, String levelOfProtection) {
		super(usedForTransport, numberOfWheels, levelOfProtection);
	}
	
	public Quadbike(double doorReplacement, double engineFix, double seatReplacement, int id) {
		super(doorReplacement, engineFix, seatReplacement, id);
	}
	
	private boolean roadLegal;

	public boolean isRoadLegal() {
		return roadLegal;
	}

	public void setRoadLegal(boolean roadLegal) {
		this.roadLegal = roadLegal;
	}
	
	
	

}
