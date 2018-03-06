package com.acn.java8.upgrade.lesson7.functions;

import java.util.function.Function;

/**
 * java.util.Function
 * A Function is a functional interface whose sole purpose
 * is to return any result by working on a single input argument.
 * It accepts an argument of type T and returns a result of type R, 
 * by applying specified logic on the input via the apply method.
 * 
 	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T t);
	}
 * @author r.paredes.bernal
 *
 */
public class FunctionExample {
	
	public static void main(String[] args) {
		// convert centigrade to fahrenheit
		Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x*9/5)+32);

		// String to an integer
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);

		// tests
		System.out.println("Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(2));
		System.out.println(" String to Int: " + stringToInt.apply("4"));
	}

}
