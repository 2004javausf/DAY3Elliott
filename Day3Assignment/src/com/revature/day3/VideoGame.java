package com.revature.day3;

public class VideoGame {
	
	private String title;
	private String rating;
	private String genre;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "VideoGame [title=" + title + ", rating=" + rating + ", genre=" + genre + "]";
	}

}
