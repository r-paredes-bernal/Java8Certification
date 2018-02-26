package com.acn.java8.oca.lesson1;

interface Question12 {
	String type = "A";
	void fly();
	
	/*
	 * default
	 * static
	 */
    static String getType() {
		return type;
	}
}
