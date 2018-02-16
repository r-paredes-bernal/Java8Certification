package com.accenture.java8.session4.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceExample {

	public WatchServiceExample() {
	}
	
	/*
	 * A watch service that watches registered objects for changes and events. 
	 * For example a file manager may use a watch service to monitor a directory 
	 * for changes so that it can update its display of the list of files when 
	 * files are created or deleted
	 */
	public static void main(String[] args) throws IOException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("C:\\CertJava8\\FilesExample");
        path.register(watchService, 
                		StandardWatchEventKinds.ENTRY_CREATE, 
                		StandardWatchEventKinds.ENTRY_DELETE, 
                		StandardWatchEventKinds.ENTRY_MODIFY);
        WatchKey key;
        
        try {
			while ((key = watchService.take()) != null) {
			    for (WatchEvent<?> event : key.pollEvents()) {
			        System.out.println(
			          "Event kind:" + event.kind() 
			            + ". File affected: " + event.context() + ".");
			    }
			    key.reset();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // See Question17
	}	
}
