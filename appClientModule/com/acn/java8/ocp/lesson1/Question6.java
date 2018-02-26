package com.acn.java8.ocp.lesson1;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question6 {

	// 0..9 expected? Inclusive
	public static void main (String args[]) {
		ArrayList<Integer> ints = new ArrayList<>();
		
		// IntStream.range(0,9).forEach(ints::add);
		// IntStream.rangeClosed(0,10).forEach(ints::add);
		// Stream.range(0,10).forEach(ints::addAll);
		// Stream.range(0,10).forEach(ints::add);
		 IntStream.rangeClosed(0, 9).forEach(ints::add);
		
		System.out.println(ints);
	}
}
