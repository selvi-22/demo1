package com.chainsys.hibernateValidation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Movie {
	@NotNull
	private String name;

	@Min(value = 1)
	private int price;
	
	
	public Movie(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Movie() {

	}

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}

}
