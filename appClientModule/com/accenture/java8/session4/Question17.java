package com.accenture.java8.session4;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.FileTime;
import java.util.List;

public class Question17 {

	public Question17() {
	}
	public static void main(String[] args) {
		try {
			WatchService watchService = FileSystems.getDefault().newWatchService();
			Files.setLastModifiedTime( Paths.get("C:\\CertJava8\\FilesExample", "file1.txt"),
										FileTime.fromMillis(System.currentTimeMillis()));
			
			Paths.get("C:\\CertJava8\\FilesExample").register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
			WatchKey key = watchService.take();
			
			List<WatchEvent<?>>  list = key.pollEvents();
			System.out.println(list.size());
		
		}  catch (InterruptedException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// Go to WatchServiceExample.java
	}
}
