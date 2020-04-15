package com.revature.day3;

public class Driver {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.setBreed("Cat");
		a.setAge(25);
		a.setSize("Smallish");
		
		VideoGame v = new VideoGame();
		v.setGenre("Simulation");
		v.setRating("Dumb");
		v.setTitle("Dog Rodeo");
		
		
		System.out.println(v.getTitle());
		System.out.println("Now in stores");
		System.out.println("pre-order bonus characters -" + a.getSize() + " " + a.getBreed() + "-");
	}

}
