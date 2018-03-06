package com.acn.java8.upgrade.lesson7.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * The Predicate functional interface is a specialization of a Function that 
 * receives a generified value and returns a boolean. A typical use case of 
 * the Predicate lambda is to filter a collection of values.
 * 
 * 
 * @FunctionalInterface
	public interface Predicate<T> {
	  boolean test(T t);
	}
	
 * @author r.paredes.bernal
 *
 */
public class PredicateExample {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
		
		Predicate<String> predicate = name -> name.startsWith("A");
		
		System.out.println(predicate.test("Beto")); // Beto
		
		// Iterate
		List<String> namesWithA = names.stream()
				.filter(predicate)
				.collect(Collectors.toList());	
		
		System.out.println(namesWithA);
	}
}
