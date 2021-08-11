package com.syntax.Class007;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * 
		 * 
		 * Print numbers from 100 to 1
		 * 
		 * 
		 * Print even numbers from 20 to 1 (2 ways)
		 * 
		 * 
		 * Print odd numbers between 20 and 50 (2 ways)
		 * 
		 */
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" want to print number from 100 to 1");

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
		}
		System.out.println(" Print even numbers from 20 and 50");

		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i + "");
		}
			for (int i = 1; i <= 20; i += 2) {
				System.out.print(i + "");
		}

		for (int i=20; i <= 50; i+=1 ) {
			System.out.print(i+" ");
		}
		for (int i=20; i <= 50; i+=1 ) {
			System.out.println(i+" ");
		}	
	}

}
