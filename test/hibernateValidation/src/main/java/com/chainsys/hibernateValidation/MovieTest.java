package com.chainsys.hibernateValidation;

import javax.validation.ValidationException;

public class MovieTest {

	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setName("ggg");
		
		
		try {
			if (movie.getName()==null)
				throw new ValidationException("Name cannot be empty");
			else if (movie.getPrice()<0)
				throw new ValidationException("price must be greater than zero");
			
			System.out.println("Validation Passed");
			System.out.println("Save Movie");
		} catch (ValidationException e) {
			System.err.println("Error" + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
