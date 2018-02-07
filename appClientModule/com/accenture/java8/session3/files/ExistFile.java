package com.accenture.java8.session3.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistFile {

	public ExistFile() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\notes.txt"); // change name
		
		if ( Files.exists(path) ) {
			System.out.println("File exists");
		} else {
			System.out.println("File NOT exists");
		}
	}
}
