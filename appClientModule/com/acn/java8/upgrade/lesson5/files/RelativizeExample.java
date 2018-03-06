package com.acn.java8.upgrade.lesson5.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeExample {

	public RelativizeExample() {
	}
	
	/*
	 * Constructs a relative path between this path and a given path.
	 */
	public static void main(String[] args) {
		// Creating a Path Between to Pats
		Path path1 = Paths.get("C:\\CertJava8\\FilesExample\\relative-path\\a\\b");
		Path path2 = Paths.get("C:\\CertJava8\\FilesExample\\relative-path\\a\\b\\c\\d"); // remove root
		Path path3 = path1.relativize(path2);
		
		System.out.println(path3);
		
	}

}
