package com.chainsys.access;

public class MovieTest2 extends Movie {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.hero = "Simbu";
		movie.name = "VTV";
		movie.rating = 2;
		movie.theatreRelease=true;

		System.out.println(movie.hero + movie.name);
		System.out.println(movie.rating+"\\");
		System.out.println(movie.theatreRelease);
	}

}
