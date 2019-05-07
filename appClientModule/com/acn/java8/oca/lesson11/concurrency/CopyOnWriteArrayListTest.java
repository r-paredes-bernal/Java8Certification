package com.acn.java8.oca.lesson11.concurrency;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> numbers 
		  = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
		
		/*
		 * Keep in mind that, when we create an iterator for the 
		 * CopyOnWriteArrayList, we get an immutable snapshot 
		 * of the data in the list at the time iterator() was called.
		 */
		Iterator<Integer> iterator = numbers.iterator();
		
		numbers.add(10);
		
		List<Integer> result = new LinkedList<>();
		iterator.forEachRemaining(result::add);
		
		System.out.println(result);
		
		// create a second iterator
		Iterator<Integer> iterator2 = numbers.iterator();
		List<Integer> result2 = new LinkedList<>();
		iterator2.forEachRemaining(result2::add);
		
		System.out.println(result2);
		
	}
}
