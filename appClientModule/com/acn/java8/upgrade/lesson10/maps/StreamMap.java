package com.acn.java8.upgrade.lesson10.maps;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	// In Java 8, stream().map() lets you convert an object to something else
	public static void main(String[] args) {
	    List<Integer> scores = Arrays.asList(10, 20, 30);
	    
	    // Before Java 8
	    List<Integer> result = new ArrayList<>();
	    
	    for (Integer i : scores) {
	        result.add(i);
	    }
	    System.out.println(result); 
	    
	    //Java 8
	    List<Integer> collect = scores.stream().map(i -> i).collect(Collectors.toList());
	    
	    System.out.println(collect); 
	}
}
