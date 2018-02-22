package com.acn.java8.ocjp.lesson3.lambdas;

public class FunctionalInterfaceClass implements Flying {

	public FunctionalInterfaceClass() {
	}

	@Override
	public void fly() {
		System.out.println("Bird");
	}
}
