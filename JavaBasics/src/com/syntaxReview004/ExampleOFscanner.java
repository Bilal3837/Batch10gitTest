package com.syntaxReview004;

import java.util.Scanner;

public class ExampleOFscanner {

	public static void main(String[] args) {
		

		

	
	
		Scanner name1=new Scanner(System.in);
		String name=name1.nextLine();
		Scanner mob=new Scanner(System.in);
		String mobile=mob.nextLine();
		Scanner age1=new Scanner(System.in);
		int age=age1.nextInt();

		System.out.println("Your name is " +name+ " your age is " +age+ " and your mobile number is " +mobile);

	
	}

}
