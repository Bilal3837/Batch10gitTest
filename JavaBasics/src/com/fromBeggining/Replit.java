package com.fromBeggining;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		
				
			    Scanner scan=new Scanner(System.in);
			boolean loan;
			System.out.println("Do you need a loan?");
			loan=scan.nextBoolean();

			if (loan){
			  System.out.println("What is your credit score?");
			  int score;
			  score= scan.nextInt();
			  if (score < 600){
			    System.out.println("Not eligible");

			  }else if (score>=600 && score<=700 ) {
			    System.out.println("Maybe eligible");
			  }else if (score>=701 && score <=800){
			    System.out.println("Eligible");
			  }else if (score>801){
			    System.out.println("Definitely eligible");

			  }
			  }else{
			    System.out.println("Unknown");

			  }
		

	}

}
