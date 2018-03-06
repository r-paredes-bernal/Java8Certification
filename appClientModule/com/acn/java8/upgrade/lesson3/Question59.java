package com.acn.java8.upgrade.lesson3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question59 {

	public Question59() {
	}
	
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("d MMM ''yy"); // ' 8 Feb '18
		System.out.println(dateFormat.format(new Date(0)));
	}
}
