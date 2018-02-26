package com.acn.java8.ocp.lesson1;

import java.time.LocalDate;

public class Question18 {
	//Output?
	public static void main(String[] args) {
		// Año biciesto
		LocalDate ld1 = LocalDate.of(2016, 12, 31); // change to 2018 
		LocalDate ld2 = LocalDate.ofYearDay(2016, 366); //
		System.out.println( ld1.equals(ld2) );
	}
}
