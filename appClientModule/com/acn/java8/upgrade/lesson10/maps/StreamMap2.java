package com.acn.java8.upgrade.lesson10.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ana", "Roger", "Petter");
		
		List<String> upperCaseNames = new ArrayList<>();
		
		// before Java8 
		for (String n : names) {
			upperCaseNames.add(n.toUpperCase());
		}
		System.out.println(upperCaseNames);
		
		// Java8
		upperCaseNames = names.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);
	}
}
