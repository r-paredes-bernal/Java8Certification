package com.acn.java8.upgrade.lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamMatchers {

	public static void main(String[] args) {
		Predicate<String> p1 = e -> e.startsWith("A");
		Predicate<Integer> p2 = e -> e < 10000; // example no used 
	    
	    List<String> list1 = Arrays.asList("Ana", "Roger", "Cindy", "Petter");
	    List<String> list2 = Arrays.asList("Ana", "Arthur", "Alex");
	    List<String> list3 = Arrays.asList("Roger", "Cindy", "Petter");
	    
	    
	    //using allMatch
	    boolean b1 = list1.stream().allMatch(p1);
	    System.out.println(b1); // false (OK)
	    
	    boolean b2 = list2.stream().allMatch(p1);
	    System.out.println(b2); // true (OK)
	    
	    //using anyMatch
	    boolean b3 = list1.stream().anyMatch(p1);
	    System.out.println(b3); // true (OK)
	    
	    //using noneMatch
	    boolean b5 = list1.stream().noneMatch(p1);
	    System.out.println(b5); // false (OK)
	    
	    boolean b6 = list3.stream().noneMatch(p1);
	    System.out.println(b6); // true (OK)
	    
	}

}
