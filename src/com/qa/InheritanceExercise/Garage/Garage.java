package com.qa.InheritanceExercise.Garage;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public void addToArray(Vehicle x) {
		this.vehicle.add(x);
	}
	
	public void remove(Vehicle x) {
		this.vehicle.remove(x);
	}
	
	
	
	
	
	
}
