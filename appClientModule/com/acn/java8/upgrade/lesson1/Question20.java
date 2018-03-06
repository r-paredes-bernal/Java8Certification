package com.acn.java8.upgrade.lesson1;

import java.time.LocalDate;
import java.time.Period;

public class Question20 {
	
	// What is the output
	public static void main(String[] args) {
		LocalDate today = LocalDate.parse("2016-01-26");
		Period days = Period.ofDays(7);
		LocalDate today2 = today.plus(days);
		System.out.println(today2);
		System.out.println(today.plus(days)); // Descomment
	}

}
