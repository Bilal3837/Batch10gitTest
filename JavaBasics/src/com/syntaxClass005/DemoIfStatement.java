package com.syntaxClass005;

import java.util.Scanner;

public class DemoIfStatement {

	public static void main(String[] args) {

	
		Scanner inp=new Scanner(System.in);
		System.out.println("In: ");
		String name=inp.next();
		
		if (name.equals("Chen")) {
			System.out.println("teacher");
		}else {
			System.out.println("invalid input");
			
			
		}
		
	Scanner inp1=new Scanner(System.in);
	String name1=inp1.next();
	System.out.println("In:");
	if (name1.equals("Faa")) {
		System.out.println("student");
	}else {
		System.out.println("you need to work on if Statement");
	}
	
	
	
	}

}
