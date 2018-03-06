package com.acn.java8.upgrade.lesson4.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistFile {

	public ExistFile() {
	}
	
	public static void main(String[] args) {
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\notes1.txt"); // change name
		
		if ( Files.exists(path) ) {
			System.out.println("File exists");
		} else {
			System.out.println("File NOT exists");
		}
	}
}
