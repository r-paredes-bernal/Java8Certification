package com.acn.java8.oca.lesson11.concurrency.RentrantLockPkg;

public class RentrantLockTest {
	// run several times 
	public static void main(String args[]) {
		RentrantLockCounter counter = new RentrantLockCounter();
		
		RentrantLockThread1 thread1 = new RentrantLockThread1(counter);
		RentrantLockThread2 thread2 = new RentrantLockThread2(counter);
		
		thread1.start();
		thread2.start();
	}
}
