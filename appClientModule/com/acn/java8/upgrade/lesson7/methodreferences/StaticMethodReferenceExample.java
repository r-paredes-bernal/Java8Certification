package com.acn.java8.upgrade.lesson7.methodreferences;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceExample {
	
	public static void isValid(String s) {
		System.out.println(s != null ? true : false);
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", null, "b");
		
		// static call in a lambda expressions
		list.stream().forEach( s -> StaticMethodReferenceExample.isValid(s)); // consumer
		
		System.out.println("For each");
		// static method reference
		list.stream().forEach(StaticMethodReferenceExample::isValid); // Java 8
		
	}

}
