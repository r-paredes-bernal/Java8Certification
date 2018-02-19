package com.acn.java8.session1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {

	public Question10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("a","b","cd","ef","ghi","jk");
		Map<Integer, String> data = names.stream()
			.collect(Collectors.groupingBy(String::length, Collectors.joining()));
		System.out.println(data.values());
	}

}
