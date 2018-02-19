package com.acn.java8.session3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question58 {

	public Question58() {
	}

	public static void main(String[] args) {
		List<Integer> initialList = new ArrayList<Integer>();
		for (int i = 1; i<= 100; i++ ) {
			initialList.add(i);
		}
		
		List<Integer> finalList = initialList.stream()
				.filter(i -> i % 2 == 0)
				.filter(i -> i % 3 == 0)
				.filter(i -> i % 5 == 0)
				.filter(i -> i % 7 == 0)
				.collect(Collectors.toList());
		System.out.println(finalList);
	}

}
