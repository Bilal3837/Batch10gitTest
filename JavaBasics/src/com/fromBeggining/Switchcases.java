package com.fromBeggining;

import java.util.Scanner;

public class Switchcases {

	public static void main(String[] args) {
		
		System.out.println("Enter the age of the Child");
		Scanner scan=new Scanner(System.in);
		int age;
		String baby;
		age=scan.nextInt();
		baby=scan.nextLine();
		



		switch (age){
		  case 1:
		  baby="You can Crawl";
		  break;

		  case 2:
		  baby="You can Talk";
		  break;

		  case 3: 
		  baby="You can dance";
		  break;

		  case 4:
		  baby="You can Trouble";
		  break;
		  default:
		  System.out.println("I don't know how old you are");
		break;
		
		
		
		
		}
		

	}

}
