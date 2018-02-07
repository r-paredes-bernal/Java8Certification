package com.accenture.java8.session1;

public class Question12 {

	public Question12() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String text = new String("Hello!");
		switch (text) {
			case "Hello!":
				System.out.println("The text string is \"Hello\"");
				break;
			default:
				System.out.println("The text string is NOT \"Hello\"");
				break;
		}
		if (text.equals("Hello!")) {
			System.out.println("The text string is \"Hello\"");
		} else {
			System.out.println("The text string is NOT \"Hello\"");
		}
	}
}
