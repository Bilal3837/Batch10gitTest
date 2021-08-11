package com.syntaxClass006;

import java.util.Scanner;

public class VariableIntialization {

	public static void main(String[] args) {
		
		
		/*ask user to enter name and age
		 * 
		 * based on age define who is a user
		 * if age is from 0-3--> baby
		 * if age is from 3-5 --> toddler
		 *if age is from 5-12 --> kid
		 *if age is from 12-19 -->teenager
		 *if age is from 19-65 --> adult
		 *if age 65+ --> senior
		 */

	Scanner in=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=in.nextLine();
	
	System.out.println("please enter your age");
	int age=in.nextInt();
	
	String whoAreyou;
	
	if (age>=0 && age<3) {
		whoAreyou="baby";
		
	}else if (age>=3 && age<6) {
		whoAreyou="toddler";
		
	}else if (age>=6 && age<13) {
		whoAreyou="kid";
	}else if (age>13 && age<20) {
		whoAreyou="teenage";
		
	}else if (age>19 && age<65) {
		whoAreyou="adult";
		
	}else if (age>65){
		whoAreyou="senior";
	}else {
		whoAreyou="Bond";
		
		System.out.println(name+ " you are " +whoAreyou);
	}
	
	
	}

}
