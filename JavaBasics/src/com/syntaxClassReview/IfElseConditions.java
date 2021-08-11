package com.syntaxClassReview;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class IfElseConditions {

	public static void main(String[] args) {
		
		
		String storeduserName="Bilal";
		String storedpassword="pass123";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your userName");
		String userName=scan.nextLine();
System.out.println("Please Enter your Password");
String password=scan.nextLine();
// == operator only works with primitive data type
// for non primitive data type we should use equal methods.
if(storeduserName.equals(password)) {
	System.out.println("Correct username");
	if (storedpassword.equals(password)) {
System.out.println("password is also correct");
	
	}else {
		
	}

	System.out.println("Username is not correct");

}

	}

}
