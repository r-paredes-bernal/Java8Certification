package com.accenture.java8.session2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question13 {

	public Question13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1970, 1, 1);
		System.out.println(d1);
		LocalDate d2 = LocalDate.parse("1970-01-01", DateTimeFormatter.ISO_DATE); // Change date by 1970-01-01
		System.out.println(d2);
		LocalDate d3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(1970);
		System.out.println(d3);
		System.out.println(d1.toString().equals(d2.toString()) && d2.toString().equals(d3.toString()));
		
	}
	
}
