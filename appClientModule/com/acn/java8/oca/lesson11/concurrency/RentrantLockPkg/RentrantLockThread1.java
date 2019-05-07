package com.acn.java8.oca.lesson11.concurrency.RentrantLockPkg;

public class RentrantLockThread1 extends Thread{
	RentrantLockCounter rentranLockCounter;
	
	
	RentrantLockThread1(RentrantLockCounter rentranLockCounter){
		this.rentranLockCounter = rentranLockCounter;
	}
	
	@Override
	public void run() {
		rentranLockCounter.increment(5);
	}

}
