package com.acn.java8.upgrade.lesson7;

interface GrandParent {
	default void grandMethod() {}
}

interface Parent extends GrandParent {
	static void parentMethod() {}
}

interface Me extends Parent {
	void method();
	void grandMethod();
}

interface Child extends Me {
	void childMehod();
}

@FunctionalInterface
interface GrandChild extends Child {
	default void grandMethod() {}
	default void parentMethod() {}
	default void method() {}
}

public class Question41 {
	// Which interface is a lambda? Set @FunctionalInterface on it
	public static void main(String[] args) {
		
		GrandChild grandChild = () ->  System.out.println("Is Lambda" );
		
		grandChild.childMehod();
	}
}
