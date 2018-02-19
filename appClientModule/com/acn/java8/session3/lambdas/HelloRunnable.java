package com.acn.java8.session3.lambdas;


public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello Runnable!");
    }

    public static void main(String args[]) {
    	Thread thread1 = new Thread(new HelloRunnable()); 
    	thread1.start();
    }

}