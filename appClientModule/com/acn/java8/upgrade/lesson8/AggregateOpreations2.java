package com.acn.java8.upgrade.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AggregateOpreations2 {
	/**
	 * Streams are lazy; computation on the source data is only performed when the 
	 * terminal operation is initiated, and source elements are consumed only as needed.
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = Arrays.asList( new Person("Ana", Person.Sex.FEMALE, 28), 
							new Person("Peter", Person.Sex.MALE, 35), 
							new Person("Roger", Person.Sex.MALE, 29));
		double average = people
			    .stream() // source
			    .filter(p -> p.getGender() == Person.Sex.MALE) // intermediate
			    .mapToInt(Person::getAge) // intermediate - The mapToInt operation returns a new stream of type IntStream
			    .average() // terminal
			    .getAsDouble();
		
		System.out.println(average);
		

		}
}
