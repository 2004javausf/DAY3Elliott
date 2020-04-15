package com.revature.day3;

public class Driver {

	public static void main(String[] args) {
	
		Dog d=new Dog();
		d.setAge(12);
		d.setBreed("Golden Retriever");
		d.setSize("HUGE");
		
		System.out.println(d.getSize());
		
		VideoGame game = new VideoGame();
		game.setGenre("Shooter");
		game.setRating("M");
		game.setTitle("Apex Legends Obviously");
		
		System.out.println(game.getTitle());
		
	}

}
