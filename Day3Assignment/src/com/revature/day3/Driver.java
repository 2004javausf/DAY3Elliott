package com.revature.day3;
import com.revature.day3.Dog;
import com.revature.day3.VideoGame;
public class Driver {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog);
		dog.setBreed("German Sheppard");
		dog.setAge(36);
		dog.setSize("Big");
		System.out.println(dog.getBreed()+" "+dog.getAge()+" "+dog.getSize());
		
		VideoGame player = new VideoGame();
		System.out.println(player);
		player.setTitle("Player");
		player.setRating("JKL");
		player.setGenre("FPS");
		System.out.println(player.getTitle()+" "+player.getRating()+" "+player.getGenre());
	}
}
