package com.accenture.java8.session4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindFile {

	public FindFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		try {
			// findFile();
			findFileTryWithResources();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void findFile() throws IOException{
		Stream<Path> stream = Files.find( 
				Paths.get("C:\\cigna\\git"), // path start
				3, // depth
				(path, attr) -> String.valueOf(path).endsWith(".js") // predicate
			); 
						
		stream.map(String::valueOf).forEach(System.out::println);
		
		stream.close();
	}
	
	private static void findFileTryWithResources() throws IOException{
		try ( Stream<Path> stream = Files.find( 
				Paths.get("C:\\cigna\\git"), // path start
				3, // depth
				(path, attr) -> String.valueOf(path).endsWith(".js") // predicate
			)) { 
						
			stream.map(String::valueOf).forEach(System.out::println);
		}
	}

}
