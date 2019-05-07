package com.acn.java8.oca.lesson11.concurrency.RentrantLockPkg;

public class RentrantLockThread2 extends Thread{
	RentrantLockCounter rentranLockCounter;
	
	
	RentrantLockThread2(RentrantLockCounter rentranLockCounter){
		this.rentranLockCounter = rentranLockCounter;
	}
	
	@Override
	public void run() {
		rentranLockCounter.increment(100);
	}

}

