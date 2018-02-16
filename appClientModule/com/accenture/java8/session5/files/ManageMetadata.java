package com.accenture.java8.session5.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManageMetadata {

	public ManageMetadata() {
	}

	public static void main(String[] args) {
		Path dir  = Paths.get("C:\\CertJava8\\FilesExample");
		Path file  = Paths.get("C:\\CertJava8\\FilesExample\\file1.txt");
		
		try {
			console("isDirectory: " +Files.isDirectory(dir, LinkOption.NOFOLLOW_LINKS));
			console("isExecutable: " + Files.isExecutable(file));
			console("isHidden: " + Files.isHidden(file));
			console("isReadable: " + Files.isReadable(file));
			console("isWritable: " + Files.isWritable(file));
			console("Size: " + Files.size(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void console(Object obj) {
		System.out.println( obj.toString() );
	}
}
