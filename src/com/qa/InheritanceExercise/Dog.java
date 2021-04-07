package com.qa.InheritanceExercise;

public class Dog extends Animal {
	
	public Dog(boolean canIFly, int numberOfLegs, String commonlyFound) {
		super(canIFly, numberOfLegs, commonlyFound);
	}

	private int howLoudIBark;
	private String typeOfDog;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//How loud I bark getters and setters
	public int getHowLoudIBark() {
		return howLoudIBark;
	}
	public void setHowLoudIBark(int howLoudIBark) {
		this.howLoudIBark = howLoudIBark;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//type of dog getters and setters
	public String getTypeOfDog() {
		return typeOfDog;
	}
	public void setTypeOfDog(String typeOfDog) {
		this.typeOfDog = typeOfDog;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Dog methods
	public void dog() {
		System.out.println("I love my hoooooman!");
	}
	
	public void dogOne() {
		System.out.println("I like to bark at anything that moves and annoy my hooman!");
	}
	

}
