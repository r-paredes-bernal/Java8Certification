package com.accenture.java8.session5.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveExample {

	public ResolveExample() {
	}
	
	public static void main(String[] args) {
		// Joining two paths
		Path basePath = Paths.get("C:\\CertJava8");
		Path path =  basePath.resolve("FilesExample\\notes.txt"); 
		System.out.println( path.toString() );
		
	}
}