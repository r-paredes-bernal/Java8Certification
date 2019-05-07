package com.acn.java8.oca.lesson11.concurrency.RentrantLockPkg;

import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockCounter {
	ReentrantLock reentrantLock = new ReentrantLock();

	void increment(int x) {  // add synchronized
		reentrantLock.lock(); // comment 
	    try {
	        System.out.println("Locked: " + reentrantLock.isLocked());
	        System.out.println("Held by me: " + reentrantLock.isHeldByCurrentThread());
			for ( int i=1; i <= 5; i++ ) {
				System.out.println(i*x);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}  
			}
	    } finally {
	    	reentrantLock.unlock(); // comment
	    }
	}
}
