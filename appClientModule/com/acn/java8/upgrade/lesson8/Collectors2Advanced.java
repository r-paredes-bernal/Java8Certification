package com.acn.java8.upgrade.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectors2Advanced {

	public static void main(String[] args) {
		List<String> people = Arrays.asList("Peter", "Ana", "Roger");
		
		// GroupingBy collector is used for grouping objects by some property and storing results in a Map instance.
		Map<Integer, Set<String>> result1 = people.stream()
				  .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
	
		System.out.println(result1);
		
		/*
		 * PartitioningBy is a specialized case of groupingBy that accepts a Predicate instance and collects Stream 
		 * elements into a Map instance that stores Boolean values as keys and collections as value
		 */
		
		Map<Boolean, List<String>> result2 = people.stream()
				  .collect(Collectors.partitioningBy(s -> s.length() > 3));
		
		System.out.println(result2);
	}

}
