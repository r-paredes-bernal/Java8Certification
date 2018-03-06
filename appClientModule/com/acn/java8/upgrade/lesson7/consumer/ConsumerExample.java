package com.acn.java8.upgrade.lesson7.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Consumer accepts a single argument but does not return any result
 	
 	@FunctionalInterface
	public interface Consumer<T> {
  		void accept(T t);
	}
	
 * @author r.paredes.bernal
 *
 */
public class ConsumerExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		
		Consumer<String> consumer = s -> System.out.println(s.toLowerCase());
		
		consumer.accept("Ana");
		
		names.forEach(consumer);
		
	}

}
