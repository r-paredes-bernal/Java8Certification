package com.acn.java8.session6.lambdas;

public class TestRunnable {

	public TestRunnable() {
	}
	
	public static void main(String[] args) {
		Runnable cat = () -> { return true; };
		System.out.println( cat.run() );
	}
}
