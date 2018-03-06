package com.acn.java8.upgrade.lesson2;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Question20 {

	public Question20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Stream<String> stream = Arrays.stream(new String[] {"a","b","c"} );
		String output = stream.filter( s -> {
			if ( s.compareTo("abc") > 0 ) // a vs abc, b vs abc and c vs abc
				return true;
			else 
				return false; 
		})
		//.peek(System.out::print) // comment this
		.collect(Collectors.joining());
		System.out.print(output);
	}

}
