package com.syntaxClass005;

import java.util.Scanner;

public class InitializeVariable {

	public static void main(String[] args) {
	
	Scanner scan;
	int num1, num2, num3, Largest;
	
	
	scan=new Scanner(System.in);
	System.out.println("Please Enter 3 numbers");
	num1=scan.nextInt();
num2=scan.nextInt();
num3=scan.nextInt();
if (num1>num2 && num1>num3) {
	System.out.println(num1+"is the largest number");
}else if (num2>num1 && num2>num3) {
	System.out.println(num2+" is the largest Number");
}else if (num3>num1&& num3>num2) {
	System.out.println(num3+" is the largest number");

}else if (num1==num2 && num2==num3) {
	System.out.println("numbers are equal");
	
	
	
}
	
	
	
	
	
	}

}
