package com.qa.InheritanceExercise;

public class Bird extends Animal {
	
	public Bird(boolean canIFly, int numberOfLegs, String commonlyFound) {
		super(canIFly, numberOfLegs, commonlyFound);
	}
	
	

	private int wingSpan;
	private String nameOfBird;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// wing span getters and setters
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Name of bird getters and setters.
	public String getNameOfBird() {
		return nameOfBird;
	}
	public void setNameOfBird(String nameOfBird) {
		this.nameOfBird = nameOfBird;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Bird methods
	public void imABird() {
		System.out.println("I'm a bird and I like flying");
	}
	
	public void birdsBeak() {
		System.out.println("I'm a bird I have a beak");
	}

}
