package com.accenture.java8.session5.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkFile {

	public WalkFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		try (Stream<Path> stream = Files.walk(Paths.get("C:\\cigna\\git"), 3)) {
		    stream.map(String::valueOf).
		          filter(path -> path.endsWith(".js")).
		          forEach(System.out::println);
		}
	}
}
