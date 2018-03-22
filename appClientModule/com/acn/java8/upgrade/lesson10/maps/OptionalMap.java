package com.acn.java8.upgrade.lesson10.maps;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMap {

	public static void main(String[] args) {
		List<Optional<String>> students = Arrays.asList(
				  Optional.empty(), Optional.of("Ana"), Optional.empty(), Optional.of("Richard"));
		
		List<String> filteredList = students.stream()
		  .filter(Optional::isPresent)
		  .map(Optional::get)
		  .collect(Collectors.toList());
    	    
    	System.out.println(filteredList);
	}
}
