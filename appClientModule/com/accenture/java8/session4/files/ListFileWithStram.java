package com.accenture.java8.session4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFileWithStram {

	public ListFileWithStram() {
	}
	
	public static void main(String[] args) throws IOException {
	
		try (Stream<Path> stream = Files.list(Paths.get("C:\\CertJava8\\FilesExample"))) {
		    stream.map(String::valueOf)
		        .filter(path -> path.endsWith(".js")) // comment this 
		        .forEach(System.out::println);
		}
	}

}
