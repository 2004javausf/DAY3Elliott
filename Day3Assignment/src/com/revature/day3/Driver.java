package com.revature.day3;

public class Driver {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setBreed("Labradour");
		myDog.setAge(1);
		myDog.setSize("Large");
		System.out.println(myDog);
		
		VideoGame newGame = new VideoGame();
		newGame.setGenre("MMORPG");
		newGame.setRating("M");
		newGame.setTitle("Bauldurs Return");
		System.out.println(newGame);

	}

}
