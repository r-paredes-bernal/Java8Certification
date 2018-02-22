package com.acn.java8.ocjp.lesson5.files;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class AtomicOperations {

	public AtomicOperations() {
	}
	
	/*
	 * An atomic file operation is an operation that cannot be interrupted or 
	 * "partially" performed. Either the entire operation is performed or 
	 * the operation fails. This is important when you have multiple processes operating
	 * on the same area of the file system, and you need to guarantee that each process 
	 * accesses a complete file.
	 */
	public static void main(String[] args) {
		Path source  = Paths.get("C:\\CertJava8\\FilesExample\\file4.txt");
		Path target = Paths.get("C:\\CertJava8\\FilesExample\\copiedfiles\\file4-atomic.txt");
		try {
			Path path = Files.move(source, target, StandardCopyOption.ATOMIC_MOVE ); // Move the file as an atomic file system operation.
			System.out.println("Atomic move succeded");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
