package com.qa.InheritanceExercise;

public class Animal {
	
	private boolean canIFly;
	private int numberOfLegs;
	private String commonlyFound;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// can I fly getters and setters
	public boolean isCanIFly() {
		return canIFly;
	}
	public void setCanIFly(boolean canIFly) {
		this.canIFly = canIFly;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// number of legs getters and setters
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numnberOfLegs) {
		this.numberOfLegs = numnberOfLegs;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//CommonlyFound getters and setters.
	public String getCommonlyFound() {
		return commonlyFound;
	}
	public void setCommonlyFound(String commonlyFound) {
		this.commonlyFound = commonlyFound;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//animal methods
	public void animal() {
		System.out.println("I'm an animal!");
	}
	
	public void animalClass() {
		System.out.println("I get this output from the animal class");
	}
	
	public Animal(boolean canIFly, int numberOfLegs, String commonlyFound) {
		this.canIFly = canIFly;
		this.numberOfLegs = numberOfLegs;
		this.commonlyFound = commonlyFound;
	}

}
