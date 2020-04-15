package com.revature.zach;

import com.revature.day3.Dog;
import com.revature.day3.VideoGame;

public class Driver {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setAge(2);
		d.setBreed("German Shepherd");
		d.setSize("80 lbs");
		System.out.println("Alex the Dog:");
		System.out.println(d);
		
		VideoGame vg = new VideoGame();
		vg.setTitle("Halo");
		vg.setGenre("Sci-fi FPS");
		vg.setRating("T-M");
		System.out.println(vg);
	}
}
