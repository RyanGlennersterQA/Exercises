package com.qa.InheritanceExercise.Garage;

public class Car extends Vehicle {

	public Car(boolean usedForTransport, int numberOfWheels, String levelOfProtection) {
		super(usedForTransport, numberOfWheels, levelOfProtection);
	}
	
	public Car(double doorReplacement, double engineFix, double seatReplacement, int id) {
		super(doorReplacement, engineFix, seatReplacement, id);
	}
	
	private int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	

}
