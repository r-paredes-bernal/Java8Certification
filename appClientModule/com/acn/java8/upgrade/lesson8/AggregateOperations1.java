package com.acn.java8.upgrade.lesson8;

import java.util.Arrays;
import java.util.List;

public class AggregateOperations1 {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList( new Person("Ana", Person.Sex.FEMALE), 
							new Person("Peter", Person.Sex.MALE), 
							new Person("Roger", Person.Sex.MALE));
		
		// Iterate a list in a traditional way
		for (Person person : people) {
		    if (person.getGender() == Person.Sex.MALE) {
		        System.out.println(person.getName());
		    }
		}
		
		// Iterate with streams Java 8
		people
	    .stream()
	    .filter(e -> e.getGender() == Person.Sex.MALE) // aggregate operation
	    .forEach(e -> System.out.println(e.getName())); 
				
		
	}
}



