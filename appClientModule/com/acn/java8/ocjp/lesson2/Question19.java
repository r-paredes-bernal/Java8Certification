package com.acn.java8.ocjp.lesson2;

import java.util.HashMap;
import java.util.Map;

public class Question19 {

	public Question19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		countries.put("America", "United States");
		countries.put("Europe", "Germany");
		countries.put("Africa", "Egypt");
		countries.merge("Europe", "France", (i1, i2) -> i1 + ' ' + i2 ); // 1
		countries.merge("Africa", "South Africa", String::concat); // 2
		System.out.println(countries); 
		
	}
}
