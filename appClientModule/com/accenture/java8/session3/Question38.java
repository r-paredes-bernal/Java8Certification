package com.accenture.java8.session3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question38 {

	public Question38() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("yy-mm-dd").format(new Date()));
		System.out.println(new SimpleDateFormat("yy-mm-DD").format(new Date()));
		System.out.println(new SimpleDateFormat("yy-MM-dd").format(new Date()));
		System.out.println(new SimpleDateFormat("YY-mm-dd").format(new Date()));
		System.out.println(new SimpleDateFormat("YY-MM-dd").format(new Date()));
		System.out.println(new SimpleDateFormat("YY-MM-DD").format(new Date()));
		System.out.println(new SimpleDateFormat("yy-mm-dd").format(new Date())); // *
		System.out.println(new SimpleDateFormat("YY-mm-dd").format(new Date()));
	}

}
