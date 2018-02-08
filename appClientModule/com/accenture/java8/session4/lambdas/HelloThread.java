package com.accenture.java8.session4.lambdas;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello Thread!");
    }

    public static void main(String args[]) {
    	HelloThread thread1 = new HelloThread();
    	thread1.start();
    }
}
