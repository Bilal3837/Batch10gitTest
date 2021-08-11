package com.syntax.Class007;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name;
		int age;
		scan=new Scanner(System.in);
		int i=1;
		while (i <= 3 ) {
			
		System.out.println("please enter your name");
		
		name=scan.next();
		
		System.out.println(name+ " Please enter your age");
age=scan.nextInt();
System.out.println(name+ "is "+age+" years old");
		i++;
		}

	}

}
