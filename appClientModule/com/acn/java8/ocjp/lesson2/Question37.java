package com.acn.java8.ocjp.lesson2;

import java.util.Arrays;
import java.util.List;

public class Question37 {

	public Question37() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		list.parallelStream()
			.peek(System.out::print) // remove this
			.forEachOrdered(System.out::print);
	}

}
