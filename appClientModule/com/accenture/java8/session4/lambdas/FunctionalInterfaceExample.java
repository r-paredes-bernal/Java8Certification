package com.accenture.java8.session4.lambdas;

public class FunctionalInterfaceExample {

	public FunctionalInterfaceExample() {
	}

	public static void main(String[] args) {
		// Traditional way
		FunctionalInterfaceClass fiec = new FunctionalInterfaceClass();
		fiec.fly();
		
		// Lambda
		FunctionalInterface fi = () -> { System.out.println("Eagle"); };
		fi.fly();
	}

}

