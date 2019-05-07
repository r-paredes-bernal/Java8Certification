package com.acn.java8.oca.lesson11.concurrency.forkJoin;

import java.util.concurrent.RecursiveAction;

/**
 * 
 *Suppose that we need to do a transformation on a very large array of numbers. 
 *For the sake of simplicity, the transformation is simply multiply every element in the array 
 *by a specified number. The following code is for the transformation task.
 *
 * @author r.paredes.bernal
 *
 *Reference: http://www.codejava.net/java-core/concurrency/understanding-java-fork-join-framework-with-examples
 */
public class ArrayTransform extends RecursiveAction {
    int[] array;
    int number;
    int threshold = 100_000;
    int start;
    int end;
 
    public ArrayTransform(int[] array, int number, int start, int end) {
        this.array = array;
        this.number = number;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected void compute() {
        if (end - start < threshold) {
            computeDirectly();
        } else {
        	System.out.println("Divide and conquer!!");
            int middle = (end + start) / 2;

            ArrayTransform subTask1 = new ArrayTransform(array, number, start, middle);
            System.out.println("Subtask1: " + array.length + "|" + number + "|" + start + "|" + middle);
            ArrayTransform subTask2 = new ArrayTransform(array, number, middle, end);
            System.out.println("Subtask2: " + array.length + "|" + number + "|" + start + "|" + middle);
            invokeAll(subTask1, subTask2);
        }
    }
 
    protected void computeDirectly() {
    	System.out.println("Compute Directly");
        for (int i = start; i < end; i++) {
            array[i] = array[i] * number;
        }
    }
}