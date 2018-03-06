package com.acn.java8.upgrade.lesson1;

import java.util.Map;
import java.util.TreeMap;

public class Question5 {
	//Output?
	public static void main (String args[]) {
		Map<Integer,String> map = new TreeMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		map.replace(1, "One", null); //modify by letters instead of number
		map.replace(3, null);
		
		System.out.println(map.values()); 
		// Null, Two, Null 
		// One Two Null
	}
}
