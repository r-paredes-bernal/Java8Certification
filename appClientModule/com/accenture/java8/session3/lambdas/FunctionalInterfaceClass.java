package com.accenture.java8.session3.lambdas;

public class FunctionalInterfaceClass implements Flying {

	public FunctionalInterfaceClass() {
	}

	@Override
	public void fly() {
		System.out.println("Bird");
	}
}
