package com.acn.java8.upgrade.lesson9.optional;

import java.util.Optional;

public class OptionalLambdaExample {
	public static void main(String[] args) {
		Optional<String> optional = Optional.empty();
		
		isValidLambda(optional);
		
		isValidLambda(Optional.of("Test")); // change to null
		
		// isValid(Optional.ofNullable(null));
	}
	
	/**
	 * The isPresent API is used to check if there is a value inside the Optional object
	 * @param optional
	 */
	private static void isValidLambda(Optional<String> optional) {
		optional.ifPresent(value -> System.out.println(value));
	}
	

	
}
