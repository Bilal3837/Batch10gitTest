package com.syntaxClass008;

import java.util.Scanner;

public class BreakWork {

	public static void main(String[] args) {
	
		
		/*
		 * 1: Print numbers from 1 to 50 except those that are divisible by 3
		 * 2: Create a program that will keep asking user to apply for a credit card
		 * As soon you get “yes” from a user program should stop asking
		 */
		
		for (int i=1; i<=50; i++) {
		
			if (i % 3==0) {
				continue;
				
			}
			System.out.print(i+" ");
		}
		
		
		
		
		while (true) {
			System.out.println("Would you like to apply for CridetCard");
		String cridet;
		Scanner scan=new Scanner(System.in);
		cridet=scan.nextLine();
		
		
		System.out.println("i am good to apply");
		
			
		}

	}

}
