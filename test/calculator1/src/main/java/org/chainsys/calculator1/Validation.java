package org.chainsys.calculator1;

public class Validation {
	public String nameValidation(String name) {
		if (name.trim().length() > 3)
			return name;
		else
			return "invalid";

	}

}
