package com.acn.java8.session6.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class TestRunner {

	public TestRunner() {
	}

	public static void main(String[] args) {
		List<Animal> runnerList = Arrays.asList(new Dog("Max"), new Horse("Brave"), new Dolphin("Flipper"));
		
		console("1) Iterate a list: ");
		runnerList.stream()
		  .forEach( (Runnable animal) -> System.out.println(animal) );
		
		console("2) Filter a list: ");
		runnerList.stream()
				  .filter( b -> b.run() == true )
				  .forEach(System.out::println);
		
		console("3) Order a list: ");
		runnerList.stream()
					.sorted( (a1, a2) -> a1.getName().compareTo(a2.getName()))
					.forEach(System.out::println);
		
		console("4) Order by explicit comparator: "); 
	    Comparator<Animal> byName = (a1, a2) -> a1.getName().compareTo(a2.getName());
		runnerList.stream()
					.sorted( byName )
					.forEach(System.out::println);
		
	}
	
	public static void console(String str) {
		System.out.println(str);
	}

}
