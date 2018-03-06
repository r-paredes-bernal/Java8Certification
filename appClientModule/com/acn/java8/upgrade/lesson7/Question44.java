package com.acn.java8.upgrade.lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question44 {
	
	static int calculate(List<String> list, Function<List<String>, Integer> func) {
		return func.apply(list);
	}
	
	// Which is the correct option to invoke the calculate method
	// If hesitate go to FunctionExample.java
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		
		System.out.println(calculate(list, s-> s.indexOf("b")));
		System.out.println(calculate(list, list -> list.size()));
		System.out.println(calculate(list, list -> list.isEmpty() ));
		System.out.println(calculate(list, s-> s.add("a") ));
	}

}
