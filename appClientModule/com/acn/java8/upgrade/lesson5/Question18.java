package com.acn.java8.upgrade.lesson5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question18 {

	public Question18() {
	}
	
	// HomeWork - Go to RelativizeExample.java and ResolveExample.java
	public static void main(String[] args) {
		Path path1 = Paths.get("a"); // add // c
		Path path2 = Paths.get("b");
		
		System.out.println(path1.resolve(path2));
		System.out.println(path1.relativize(path2));
	}
}
