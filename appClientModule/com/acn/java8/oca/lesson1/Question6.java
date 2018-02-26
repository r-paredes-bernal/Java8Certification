package com.acn.java8.oca.lesson1;

public class Question6 {

	// why is not compiling, then fix it and ask what is expected?
	public static void main(String[] args) {
		Double number = null;
		try {
			number = Double.valueOf("120D");
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println(number);
	}
}
