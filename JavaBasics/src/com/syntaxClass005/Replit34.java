package com.syntaxClass005;

import java.util.Scanner;

public class Replit34 {

	public static void main(String[] args) {
	
	System.out.println("Please enter a number");
	Scanner scan=new Scanner(System.in);
	int odd=scan.nextInt();
	
	if (odd>1000|| (odd>333)) {
	System.out.println("Even is large");
	}else if (odd>1100 || (odd>500)) {
		System.out.println("Even is just right");
	}else if(odd>1100||(odd>1100)) {
		System.out.println("Value is even");
		
	}
	
	
	
	}
	
}
