package com.acn.java8.upgrade.lesson10.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerQuestion {
	
	static AtomicInteger count = new AtomicInteger();
	
	public static void main(String[] args) {
		System.out.println( count.get() );
		int var = count.getAndAdd(1);
		
		System.out.println( "Var: " + var );
		System.out.println( count.get() );

		
		// count++;
		count.set(count.get() + 1) ;
		
		count.getAndSet(1);
		
	}

}
