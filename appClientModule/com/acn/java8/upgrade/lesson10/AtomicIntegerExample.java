package com.acn.java8.upgrade.lesson10;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	
	// TOD-DO Review API AtomicInteger/ Atomic...
	public static void main(String[] args) {
		// Atomic counter that is accesed by several threads
		AtomicInteger atomicInteger = new AtomicInteger(1);
		
		// Increment in 1
		int i2 = atomicInteger.incrementAndGet();
		System.out.println(i2);
		
		// Increment in n delta
		int i3 = atomicInteger.addAndGet(10);
		System.out.println(i3);
	}
}
