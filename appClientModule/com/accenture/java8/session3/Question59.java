package com.accenture.java8.session3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question59 {

	public Question59() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("d MMM ''yy"); // ' 
		System.out.println(dateFormat.format(new Date(0)));
	}
}
