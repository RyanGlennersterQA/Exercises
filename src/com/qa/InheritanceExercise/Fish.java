package com.qa.InheritanceExercise;

public class Fish extends Animal {
	
	public Fish(boolean canIFly, int numberOfLegs, String commonlyFound) {
		super(canIFly, numberOfLegs, commonlyFound);
	}

	private int numberOfGills;
	private String typeOfFish;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//number of gills getters and setters
	public int getNumberOfGills() {
		return numberOfGills;
	}
	public void setNumberOfGills(int numberOfGills) {
		this.numberOfGills = numberOfGills;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//type of fish getters and setters
	public String getTypeOfFish() {
		return typeOfFish;
	}
	public void setTypeOfFish(String typeOfFish) {
		this.typeOfFish = typeOfFish;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Fish methods
	public void fishSound() {
		System.out.println("I make noises underwater so other fish can understand me!");
	}
	
	public void fishFriends() {
		System.out.println("Fish are friends, not food!");
	}
	

}
