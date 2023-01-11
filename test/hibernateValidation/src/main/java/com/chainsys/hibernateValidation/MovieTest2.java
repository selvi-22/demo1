package com.chainsys.hibernateValidation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;

public class MovieTest2 {

	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setName("ggg");

		try {
			Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
			
			
			Set<ConstraintViolation<Movie>> violations = validator.validate(movie);

			if (!violations.isEmpty()) {
				for (ConstraintViolation<Movie> constraintViolation : violations) {
					String message = constraintViolation.getMessage();
					System.out.println(message);
				}

			} else {

				System.out.println("Validation Passed");
				System.out.println("Save Movie");

			}
		} catch (ValidationException e) {
			System.err.println("Error" + e.getMessage());
			e.printStackTrace();
		}

	}

}
