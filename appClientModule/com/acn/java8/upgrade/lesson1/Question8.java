package com.acn.java8.upgrade.lesson1;


interface I {
	// If descomment?
	default boolean equals(Object O) {
		return true;
	}
}

class A implements I {
	public boolean equals(Object O ) {
		return false;
	}
}

public class Question8 {
	
	// Output?
	public static void main(String[] args) {
		A a = new A();
		I ia = new A();
		I i = new I(){};
		
		System.out.println(a.equals(ia) + " " + i.equals(ia));
		
	}

}
