package com.acn.java8.oca.lesson1;

public class Question8 {

	public static void main(String[] args) {
		String s = "A";
		
		switch (s) {
			case "a":
				System.out.println("Simple A");
			default:
				System.out.println("default");
			case "A":
				System.out.println("Capital A");
		}
		
	}
}
