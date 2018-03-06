package com.acn.java8.upgrade.lesson4.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public DeleteFile() {
	}

	public static void main(String[] args) {
		// Path path = Paths.get("C:\\CertJava8\\FilesExample\\copiedfiles"); // change name
		
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\copiedfiles", "file2.txt"); // change name
		
		/*
		 Path base1 = Paths.get("..", "..", "temp", "delete", "dictionary.txt"); 
		 */
		try {
			Files.delete(path);
			System.out.println("File Deleted");
		} catch ( NoSuchFileException nfe ) {
			System.out.println("File not found");
			nfe.printStackTrace();
		} catch (DirectoryNotEmptyException dne) {
			System.out.println("Directory not empty");
			dne.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
