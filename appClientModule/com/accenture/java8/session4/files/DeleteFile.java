package com.accenture.java8.session4.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public DeleteFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\file3.txt"); // change name
		
		try {
			Files.delete(path);
			System.out.println("File Deleted");
		} catch ( NoSuchFileException nfe ) {
			System.out.println("File not found");
			nfe.printStackTrace();
		} catch (DirectoryNotEmptyException dne) {
			System.out.println("Directory not empty");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
