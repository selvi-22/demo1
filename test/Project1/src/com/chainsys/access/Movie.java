package com.chainsys.access;

public class Movie {
	// public - can be accessed from any class
	public String hero;
	// can be accessed by subclass(extends)
	protected String name;
//default - visible to package
	boolean theatreRelease;
	int rating;
	//private accessible only within class
	private String review;

}
