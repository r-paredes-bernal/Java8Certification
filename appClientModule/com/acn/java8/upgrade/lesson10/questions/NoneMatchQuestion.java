package com.acn.java8.upgrade.lesson10.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NoneMatchQuestion {
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(2,4);
		boolean result = list.stream().noneMatch(i -> i % 2 == 1);
		System.out.println( result );
	}
}
