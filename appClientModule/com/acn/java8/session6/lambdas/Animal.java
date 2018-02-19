package com.acn.java8.session6.lambdas;

public class Animal implements Runnable {
	private String name;
	
	public Animal(){};
	
	public Animal(String name) {
		this.name = name;
	}

	@Override
	public boolean run() {
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
}
