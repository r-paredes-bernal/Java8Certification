package com.acn.java8.upgrade.lesson7.methodreferences;

import java.util.function.Consumer;

/**
 * In a lambda expression, when we are calling an already 
 * existing method of an existing class or super class,
 * method and class references come in handy. These are new utility 
 * features introduced in Java 8 in order to represent lambdas 
 * even more concisely and succinctly. Method references are 
 * shortcuts for calling existing methods
 * @author r.paredes.bernal
 *
 */
public class MethodReferenceExample {
	
	public static void main(String[] args) {
		
		// Call to some method
		Consumer<String> c = s -> System.out.println(s);
		
		// Method reference
		Consumer<String> c1 = System.out::println;
		
	}

}
