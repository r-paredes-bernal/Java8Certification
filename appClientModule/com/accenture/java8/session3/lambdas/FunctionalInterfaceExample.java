package com.accenture.java8.session3.lambdas;

public class FunctionalInterfaceExample {

	public FunctionalInterfaceExample() {
	}

	public static void main(String[] args) {
		// Traditional way
		FunctionalInterfaceClass fiec = new FunctionalInterfaceClass();
		fiec.fly();
		
		// Lambda - Java 8
		Flying f = () -> { System.out.println("Eagle"); };
		f.fly();
	}

}

