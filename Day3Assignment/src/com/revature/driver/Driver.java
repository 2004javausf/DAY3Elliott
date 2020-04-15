package com.revature.driver;

import com.revature.day3.Dog;
import com.revature.day3.VideoGame;

public class Driver {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(10000);
		dog.setBreed("Cerberus");
		dog.setSize("really really big");
		System.out.println(dog);
		
		VideoGame game = new VideoGame();
		game.setGenre("Fighting");
		game.setRating("no one");
		game.setTitle("Shaq Fu");
		System.out.println(game);
	}
}
