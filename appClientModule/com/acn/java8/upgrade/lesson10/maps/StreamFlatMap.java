package com.acn.java8.upgrade.lesson10.maps;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * Reference: https://www.mkyong.com/java8/java-8-flatmap-example/
 * @author r.paredes.bernal
 *
 */
public class StreamFlatMap {
	
	public static void main(String[] args) {
		System.out.println("Filter ");
		m1();
		System.out.println("Flat Map: ");
		m2();
	}
	
	
	private static void m1() {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);		
	}
	
	/**
	 * { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
	 * { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
	 */
	private static void m2() {
	       String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

	        //Stream<String[]>
	        Stream<String[]> temp = Arrays.stream(data);

	        //Stream<String>, GOOD!
	        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

	        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

	        stream.forEach(System.out::println);	
	        
	        /*
	         * 	        
	         temp.flatMap(x -> Arrays.stream(x))
	        .filter(x -> "a".equals(x.toString()))
	        .forEach(System.out::println);		
	         */
	}
}
