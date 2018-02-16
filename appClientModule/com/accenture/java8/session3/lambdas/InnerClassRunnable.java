package com.accenture.java8.session3.lambdas;

public class InnerClassRunnable {

	public InnerClassRunnable() {
	}
	
	public static void main(String args[]) {
		Runnable task1 = new Runnable(){
		    @Override
		    public void run(){
		        System.out.println("Task #1 is running");
		    }
		};
		 
		 
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		// Pass the anonymous class into the Thread’s constructor:
		Thread thread2 = new Thread(new Runnable() {
		    @Override
		    public void run(){
		        System.out.println("Task #2 is running");
		    }
		});
		 
		thread2.start();
	}
}
