package com.acn.java8.ocp.lesson1;

import java.time.LocalTime;

public class Question19 {
	
	public static void main(String[] args) {
		LocalTime val =
		LocalTime.ofSecondOfDay(3600);
		// LocalTime.ofSecond(3600);
		// LocalTime.ofDay(3600);
		// LocalTime.ofSeconds(3600);
		System.out.println( val );
	}
}
