package com.acn.java8.oca.lesson1;

import java.time.LocalDate;
import java.time.Period;

public class Question21 {
	// Which is the output
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018,2,22);
		Period p = Period.ofDays(10);
		System.out.println(date.plus(p));
	}
}
