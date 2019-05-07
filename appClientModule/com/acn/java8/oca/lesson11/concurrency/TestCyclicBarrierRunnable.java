package com.acn.java8.oca.lesson11.concurrency;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrierRunnable {
	public static void main(String args[]) {
		
		Runnable thread1 = new Runnable() {
		    public void run() {
		        System.out.println("Thread 1 executed ");
		    }
		};
		
		Runnable thread2 = new Runnable() {
		    public void run() {
		        System.out.println("Thread 2 executed ");
		    }
		};
		
		/*
		new Thread(thread1).start();
		new Thread(thread2).start();
		*/
		
		/*
		 * The constructor for a CyclicBarrier is simple. It takes a single integer 
		 * that denotes the number of threads that need to call the await() method 
		 * on the barrier
		 */
		CyclicBarrier barrier1 = new CyclicBarrier(1, thread1);
		
		CyclicBarrier barrier2 = new CyclicBarrier(2, thread2);
		
		
		CyclicBarrierRunnable cyclicBarrier1 =
		        new CyclicBarrierRunnable(barrier1, barrier2);

		CyclicBarrierRunnable cyclicBarrier2 =
		        new CyclicBarrierRunnable(barrier1, barrier2);

		new Thread(cyclicBarrier1).start();
		new Thread(cyclicBarrier2).start();
	}
}
