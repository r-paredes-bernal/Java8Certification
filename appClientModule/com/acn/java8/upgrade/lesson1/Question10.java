package com.acn.java8.upgrade.lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class Question10 {
	int val = 10;
	int x;
	
	Question10(int i){
		val = i;
	}
	
	private AtomicInteger value = new AtomicInteger(val);
	
	// What is the output?
	public static void main(String[] args) {
		Question10 q = new Question10(5);
		System.out.println(q.value.decrementAndGet());
		System.out.println(q.val); // descomment
	}
}
