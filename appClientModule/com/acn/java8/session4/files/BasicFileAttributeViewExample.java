package com.acn.java8.session4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;

public class BasicFileAttributeViewExample {

	public BasicFileAttributeViewExample() {
	}
	/*
	 * A file attribute view that provides a view of a basic set of 
	 * file attributes common to many file systems.
	 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\CertJava8\\FilesExample\\notes.txt");
        try {
          // BasicFileAttributeView bv = Files.getFileAttributeView(path, BasicFileAttributeView.class);
          // BasicFileAttributeView bv = Files.getFileAttributeView(path, DosFileAttributeView.class);
           BasicFileAttributeView bv = Files.getFileAttributeView(path, PosixFileAttributeView.class);
          
          BasicFileAttributes ba = bv.readAttributes();
          
          console("lastModifiedTime: " + ba.lastModifiedTime());
          console("lastAccessTime: " + ba.lastAccessTime());
          console("creationTime: " + ba.creationTime());
          console("size: " + ba.size());
          console("isRegularFile: " + ba.isRegularFile());
          console("isDirectory: " + ba.isDirectory());
          console("isSymbolicLink: " + ba.isSymbolicLink());
          console("isOther: " + ba.isOther());
          console("fileKey: " + ba.fileKey());
          
        } catch (IOException e) {
            System.err.println(e);
        }		
	}
	
	public static void console(Object obj) {
		System.out.println( obj.toString() );
	}
}
