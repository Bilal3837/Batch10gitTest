package com.syntaxClass005;

import java.util.Scanner;

public class AnotherIfstatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();

		if (age == 18) {
			System.out.println("You are eligible to vote " + age);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age ");
		int teenage = input.nextInt();
		
		if (teenage==16) {
		System.out.println("You are not eligible to vote " + teenage);

		}
	}

}
