package com.acn.java8.session6.lambdas;

/*
Functional interface is an interface which contains only one abstract method. 

Interfaces have the following properties:
- An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
- Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
- Methods in an interface are implicitly public. 

 */
@FunctionalInterface
public interface Runnable {
	boolean run(); // public abstract boolean run();
	// public String getName(); // uncomment
}
