package com.syntax.Class007;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		/*
		 *we have a secret number (any number from 1 to 20)  
		 * ask user to guess your secret number
		 *continue guessing a number UNTILL user enter your secret number
		 */
		
		// while and do while loop repeat check of code as long as the condition is true!
		// while first checks and condition and only then check the condition.
		// Do loop executes code at least ONCE even when condition is FALSE
		// while and do while loops are used WHEN WE DO NOT KNOW IN ADVANCE HOW MANY TIME WE -->
		// WANT TO REPAT block of code
		// for loop is used when we know in advance how many times we want to repeat same block of code
		Scanner scan;
		int secretNumber, userNumber;
		secretNumber=15;
		scan=new Scanner(System.in);
		do {
		System.out.println("please guess my secret number");
userNumber=scan.nextInt();

		}while (userNumber!=secretNumber);
		
	System.out.println("Congratulations");
	
	
	
	
	
	}

}
