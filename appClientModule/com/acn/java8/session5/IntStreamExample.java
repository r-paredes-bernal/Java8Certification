package com.acn.java8.session5;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExample {
	public static void main(String[] args) {
		IntStream intStream1 = IntStream.range(1, 6);
		IntStream intStream2 = IntStream.range(1, 6);
		
		// 1)
		// return the accumulative result of the predicate
		OptionalInt sum = intStream1.reduce ( (a,b) -> a + b);
		System.out.println("reduce: " + sum.orElse(0));
		
		// 2)
		// the same but the above failed due compilation error
		System.out.println("reduce: " + IntStream.range(1, 6).reduce((a, b) -> a + b).orElse(0));
		
		// 3)
		// Return an optional double
		System.out.println("average: " + IntStream.range(1, 6).average().orElse(0) );
		
		// 4)
		// returns a double
		System.out.println("average: " + intStream2.average().orElse(0) );
	}
}
