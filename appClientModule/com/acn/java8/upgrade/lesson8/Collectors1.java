package com.acn.java8.upgrade.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectors1 {

	public static void main(String[] args) {
		List<String> people = Arrays.asList("Peter", "Ana", "Roger");
		
		//List<String> people = Arrays.asList("Peter", "Ana", "Roger", "Peter");
		
		// ToList collector can be used for collecting all Stream elements into a List instance
		List<String> result1 = people.stream()
				  .collect(Collectors.toList());
		
		System.out.println(result1); 
		
		// ToSet collector can be used for collecting all Stream elements into a Set instance
		Set<String> result2 = people.stream().collect(Collectors.toSet());
	
		System.out.println(result2); 
		
		// ToMap collector can be used to collect Stream elements into a Map instance.
		Map<String, Integer> result3 = people.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println(result3); 
		
		// Joining collector can be used for joining Stream<String> elements.
		String result4 = people.stream()
				  .collect(Collectors.joining()); // Add a custom separator |
		
		System.out.println(result4);
		
		// Counting is a simple collector that allows simply counting of all Stream elements.
		Long result5 = people.stream()
				  .collect(Collectors.counting());
		
		System.out.println(result5);
		
		// Reference: http://www.baeldung.com/java-8-collectors
	}

}
