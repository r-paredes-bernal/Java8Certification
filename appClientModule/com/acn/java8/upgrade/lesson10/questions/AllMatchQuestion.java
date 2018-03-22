package com.acn.java8.upgrade.lesson10.questions;

import java.util.Arrays;
import java.util.List;

public class AllMatchQuestion {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,6,7,8);
		
		boolean allEven = list.stream().allMatch(i -> {
			System.out.print(i); 
			return i % 2 == 0;
		});
		
		System.out.println(allEven); // false
	}
}
