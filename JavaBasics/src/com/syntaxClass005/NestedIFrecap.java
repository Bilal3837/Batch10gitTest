package com.syntaxClass005;

import java.util.Scanner;

public class NestedIFrecap {

	public static void main(String[] args) {
		// if use got a visa?
		// if user got a visa let's ask how long is the visa for
		// if visa is less or more then 1 year--> cool
		// if less --> you will have to go back in 1 year and to apply 
		
Scanner scan;
 String visa;
 int years;
 
 scan=new Scanner(System.in);
 System.out.println("Hey did you get your visa?");
 
 visa=scan.next();
 
 if (visa.equals("yes")) {
	 
	 System.out.println("Congratulation How long is your visa for");
 years=scan.nextInt();
 
 if (years>1) {
	 System.out.println("that's awesome");
 }else {
	 System.out.println("you will have to go back in 1 year and to apply ");
	 
 }
 }
 
 
 
	
	
	
	}

}
