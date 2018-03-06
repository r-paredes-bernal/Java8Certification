package com.acn.java8.upgrade.lesson7;

import java.util.Arrays;
import java.util.List;

public class Question43 {

	// Output?
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c"); // ABC
		list.stream()
		.peek( s -> System.out.println(s)) 
		.forEach(s -> {
			s = s.toUpperCase();
			System.out.println(s);
		});
		list.stream().forEach(System.out::print);
	}

}
