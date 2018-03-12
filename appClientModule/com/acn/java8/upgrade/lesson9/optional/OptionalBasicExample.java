package com.acn.java8.upgrade.lesson9.optional;

import java.util.Optional;

public class OptionalBasicExample {
	public static void main(String[] args) {
		Optional<String> optional = Optional.empty();
		
		isValid(optional);
		
		isValid(Optional.of("Test")); // change to null
		
		// isValid(Optional.ofNullable(null));
	}
	
	/**
	 * The isPresent API is used to check if there is a value inside the Optional object
	 * @param optional
	 */
	private static void isValid(Optional<String> optional) {
		if ( optional.isPresent() ) { // optional != null
			System.out.println("Full");
		} else {
			System.out.println("Empty");			
		}
	}
	

	
}
