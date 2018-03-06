package com.acn.java8.upgrade.lesson1;

public class Question7 {
	void run() { // 3) change the visibility
		System.out.print("A");
	}
	
	// 2) What happens if descomment?
	public static void main (String args[]) {
		new B().run();
	}
}

class B extends Question7 {
	// 1) How to override the method run? Is it possible?
	// Study protected! Modificadores de acceso
}