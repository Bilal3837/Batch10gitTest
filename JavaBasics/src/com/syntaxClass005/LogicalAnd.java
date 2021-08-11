package com.syntaxClass005;

public class LogicalAnd {

	public static void main(String[] args) {

		/*
		 * Logical Operators Logical And &&
		 * 
		 * when two conditions is true && true --> true && false --> false
		 * 
		 */

		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("that's awesome");

		} else {
			System.out.println("Please try to spend more time with Java");
		}

//declare a number
		// * if number is larger then 1 AND smaller then 10 --> SMALL
		// *if number is larger then 10 but smaller then 100 --> MEDIUM
		// if number is larger then 100 but Smaller then 1000 --> Large
		// otherwise numbers is huge
		int num = 0;
		if (num>0) {

		if (num > 1 && num < 10) {
			System.out.println("Number is small");

		} else if (num > 10 && num < 100) {
			System.out.println("Number is Medium");

		} else if (num > 100 && num < 1000) {
			System.out.println("Number is Large");
		} else {
			System.out.println("Number is huge");
		
		}
		}

	}

}
