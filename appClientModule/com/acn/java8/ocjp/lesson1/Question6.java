package com.acn.java8.ocjp.lesson1;

import java.text.DateFormat;
import java.util.Date;

public class Question6 {

	public Question6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat dateFormat = 
		// new DateFormat();
		// new DateFormat(DateFormat.DEFAULT);
		// DateFormat.getInstance();
		// DateFormat.getInstance(DateFormat.DEFAULT);
		// DateFormat.getDateInstance(); 
		 DateFormat.getDateInstance(DateFormat.DEFAULT);
				
		String formatDate = dateFormat.format(date);
		System.out.println(formatDate);

	}

}
