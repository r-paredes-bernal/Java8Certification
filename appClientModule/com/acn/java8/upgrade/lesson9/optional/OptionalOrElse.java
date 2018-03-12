package com.acn.java8.upgrade.lesson9.optional;

import java.util.Optional;

public class OptionalOrElse {
	
	/**
	 * The orElse API is used to retrieve the value wrapped inside an Optional instance
	 * @param args
	 */
	public static void main(String[] args) {
	    Double price = null; // change to 10, 10.0, null
	    Double validPrice = Optional.ofNullable(price).orElse(0.0);
	    System.out.println(validPrice);
	}
}
