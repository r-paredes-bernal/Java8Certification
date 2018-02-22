package com.acn.java8.ocjp.lesson4.files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFile {

	public MoveFile() {
	}
	
	public static void main(String[] args) {
		moveFile();
	}

	private static void moveFile(){
		Path source  = Paths.get("C:\\CertJava8\\FilesExample\\file2.txt");
		Path target = Paths.get("C:\\CertJava8\\FilesExample\\copiedfiles\\file2-moved.txt");

		try {
			Path path = Files.move(source, target);
		    System.out.println("File Moved: " + path );
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
			Path path = Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File overwrited: " + path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
