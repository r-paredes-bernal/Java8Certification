package com.acn.java8.upgrade.lesson10.maps;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalFlatMap {
	public static void main(String[] args) {
		List<Optional<String>> students = Arrays.asList(
				  Optional.empty(), Optional.of("Cindy"), Optional.empty(), Optional.of("Peter"));
		
		List<String> filteredList = students.stream()
				  .flatMap(s -> s.isPresent() ? Stream.of(s.get()) : Stream.empty())
				  .collect(Collectors.toList());
		
		System.out.println(filteredList);
	}
}
