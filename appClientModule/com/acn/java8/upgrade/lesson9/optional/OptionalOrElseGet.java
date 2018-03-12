package com.acn.java8.upgrade.lesson9.optional;

import java.util.Optional;

public class OptionalOrElseGet {
	public static void main(String[] args) {
	    String nullName = "Richard";
	    
	    String name1 = Optional.ofNullable(nullName).orElseGet(() -> "Jhon");
	    System.out.println(name1);
	    
	    String name2 = Optional.ofNullable(nullName).orElseGet(() -> {
	    	System.out.println("Empty");
	    	return "Ana";
	    });
	    System.out.println(name2);
	}
}

