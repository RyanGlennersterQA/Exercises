package com.qa.InheritanceExercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird seagull = new Bird(true, 2, "In the sky");
		System.out.println("---------------------------Bird-----------------------------------");
		//setting the variables
		seagull.setNameOfBird("Seagull");
		seagull.setWingSpan(64);
		//getting and printing the variables
		System.out.println("Can I Fly? " + seagull.isCanIFly());
		System.out.println("I am commonly found " + seagull.getCommonlyFound());
		System.out.println("I have a " + seagull.getWingSpan() + "cm wingspan!");
		System.out.println("I am a " + seagull.getNameOfBird());
		System.out.println("I have " + seagull.getNumberOfLegs() + " Legs");
		//showing the methods from the animal class and the ones specific to the bird class.
		seagull.animal();
		seagull.animalClass();
		seagull.imABird();
		seagull.birdsBeak();
		
		Dog buster = new Dog(false, 4, "In my hoomans house!");
		System.out.println("---------------------------Dog-----------------------------------");
		//setting the variables
		buster.setHowLoudIBark(10);
		buster.setTypeOfDog("Staffordshire Bull Terrier");
		//Getting and printing the variables
		System.out.println("Can I Fly? " + buster.isCanIFly());
		System.out.println("I am commonly found " + buster.getCommonlyFound());
		System.out.println("I bark " + buster.getHowLoudIBark() + "/10, it's really loud!");
		System.out.println("I have " + buster.getNumberOfLegs() + " Legs");
		System.out.println("I am a " + buster.getTypeOfDog());
		//showing the methods from the animal class and the specific ones to the dog class.
		buster.animal();
		buster.animalClass();
		buster.dog();
		buster.dogOne();
		
		
		Fish neemo = new Fish(false, 0, "In the ocean!");
		System.out.println("---------------------------Fish-----------------------------------");
		//Setting the variables
		neemo.setNumberOfGills(7);
		neemo.setTypeOfFish("Clown Fish");
		//getting and printing the variables
		System.out.println("Can I Fly? " + neemo.isCanIFly());
		System.out.println("I am commonly found " + neemo.getCommonlyFound());
		System.out.println("I have " + neemo.getNumberOfGills() + " Gills");
		System.out.println("I have " + neemo.getNumberOfLegs() + " Legs");
		System.out.println("I am a " + neemo.getTypeOfFish());
		//showing the methods from the animal class and the ones specific to the fish class.
		neemo.animal();
		neemo.animalClass();
		neemo.fishSound();
		neemo.fishFriends();

	}

}

