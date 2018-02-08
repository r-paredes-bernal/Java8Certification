package com.accenture.java8.session4.files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

	public CopyFile() {
	}
	
	public static void main(String[] args) {
		copyFile();
	}
	
	private static void copyFile(){
		Path source  = Paths.get("C:\\CertJava8\\FilesExample\\file1.txt");
		Path target = Paths.get("C:\\CertJava8\\FilesExample\\copiedfiles\\file1.txt");

		try {
			Path path = Files.copy(source, target);
		    System.out.println("File Copied: " + path );
		} catch(FileAlreadyExistsException fae) {
			System.out.println("File already exists");
			overwriteExistingFile(source, target);
		    //fae.printStackTrace();
		} catch (IOException e) {
		    // something else went wrong
		    e.printStackTrace();
		}		
	}
	
	private static void overwriteExistingFile(Path source, Path target) {
		try {
			Path path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File overwrited: " + path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
