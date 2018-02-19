package com.acn.java8.session3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question38 {

	public Question38() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// mm min y MM month
		System.out.println(new SimpleDateFormat("yy-mm-dd").format(new Date())); // 18-02-08
		System.out.println(new SimpleDateFormat("yy-mm-DD").format(new Date())); // 18-26-39
		System.out.println(new SimpleDateFormat("yy-MMM-dd").format(new Date())); // 18-Feb-08 
		System.out.println(new SimpleDateFormat("yy-MM-dd").format(new Date())); // 18-02-08
		System.out.println(new SimpleDateFormat("YY-mm-dd").format(new Date())); // 18-32-08
		System.out.println(new SimpleDateFormat("YYYY-mm-dd").format(new Date())); // 2018-02-08
		System.out.println(new SimpleDateFormat("YY-MM-dd").format(new Date())); // 2018-Feb-08
		System.out.println(new SimpleDateFormat("YY-MM-DD").format(new Date()));
		System.out.println(new SimpleDateFormat("yy-mm-dd").format(new Date())); // *
		System.out.println(new SimpleDateFormat("YY-mm-dd").format(new Date()));
		
		// Ir a la pregunta 59
	}

}
