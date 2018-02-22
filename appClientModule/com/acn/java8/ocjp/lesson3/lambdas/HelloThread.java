package com.acn.java8.ocjp.lesson3.lambdas;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello Thread!");
    }

    public static void main(String args[]) {
    	HelloThread thread1 = new HelloThread();
    	thread1.start();
    }
}
