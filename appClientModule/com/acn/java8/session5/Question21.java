package com.acn.java8.session5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question21 {

	public Question21() {
	}
	
	// Question 21 Diagnostic Test
	public static void main(String[] args) throws IOException {
		
		// Which always open a files and writes new content on it
		
		Path source  = Paths.get("C:\\CertJava8\\FilesExample\\file4.txt");
		
		/*
		BufferedWriter writer1 = Files.newBufferedWriter(source, 
				new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING});
		*/
		BufferedWriter writer2 = Files.newBufferedWriter(source, 
				new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE });
		
		
		/*
		BufferedWriter writer3 = Files.newBufferedWriter(source, 
				new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE_NEW });
		
		/*
		BufferedWriter writer4 = Files.newBufferedWriter(source, 
				new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE });
	
		BufferedWriter writer5 = Files.newBufferedWriter(source, 
				new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.APPEND });
		 */
	
		writer2.write("Writing test 3");
		System.out.println("File created");
		
		writer2.flush();
		System.out.println("File writed");
	}
}
