package com.acn.java8.ocjp.lesson5.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PropertiesFile {

	public PropertiesFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\notes.txt"); // change by \
		System.out.println("1) " + path.getFileName()); 
		System.out.println("2) " + path.getName(0));
		System.out.println("3) " + path.getNameCount()); 
		System.out.println("4) " + path.subpath(0, 2)); 
		System.out.println("5) " + path.getParent()); 
		System.out.println("6) " + path.getRoot());
	}

}
