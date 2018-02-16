package com.accenture.java8.session3.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LessVerbose {

	public LessVerbose() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); // change to String
		
		System.out.println("Java  5");
		for (int number : numbers) {
		    System.out.println(number);
		}
		
		System.out.println("Java  8");
		numbers.forEach(new Consumer<Integer>() {
		    public void accept(Integer value) {
		        System.out.println(value);
		    }
		});
		
		System.out.println("Java  8 + Lambdas");
		numbers.forEach((Integer value) -> System.out.println(value));
		
		System.out.println("Java  8 + Lambdas + method reference");
		numbers.forEach(System.out::println);
	}
}
