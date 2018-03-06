package com.acn.java8.upgrade.lesson1;

public class Question4 {
	Integer I = null;
	
	// Output? Hola 
	public static void main (String args[]) {
		String s;
		try {
			s = new Question4().I.toString(); // Add catch
		} catch (NullPointerException np) {
			System.out.println("Null");
		} finally {
			try {
				int i = Integer.parseInt(args[0]);
			} catch(NumberFormatException E) {
				System.out.println("NumberFormat");
			} finally {
				System.out.println("Fin2");
			}
			System.out.println("Fin1");
		}
	}
}
