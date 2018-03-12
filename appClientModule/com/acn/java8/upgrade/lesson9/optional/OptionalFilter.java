package com.acn.java8.upgrade.lesson9.optional;

import java.util.Optional;

public class OptionalFilter {
	
	/*
	 * The filter API is used to run an inline test on the wrapped value. 
	 * It takes a predicate as an argument and returns an Optional object. 
	 * If the wrapped value passes testing by the predicate, then the Optional is returned as is.
	 */
	public static void main(String[] args) {
	    Integer year = 2016;
	    Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(x -> x == 2016).isPresent();
	    System.out.println(is2016);
	    boolean is2017 = yearOptional.filter(x -> x == 2017).isPresent();
	    System.out.println(is2017);
	}

}
