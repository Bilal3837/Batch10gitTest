package com.reviewClass006;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		System.out.println("Enter two numbers");
		
		Scanner scan=new Scanner(System.in);
		double number1=scan.nextDouble();
		double number2=scan.nextDouble();
		System.out.println("Enter the operation");
		char operation=scan.next().charAt(0);
		
		if(operation=='+') {
			System.out.println(number1+number2);
		}else if (operation=='+') {
			System.out.println(number1-number2);
		}else if (operation=='+') {
			
		}else if (operation=='+') {
			System.out.println(number1*number2);
		}else if (operation=='+') {
			System.out.println(number1/number2);
		}else {
			System.out.println("Operation not supported");
		}

		switch (operation) {
		case '+':
			System.out.println(number1+number2);
		case'-':
			System.out.println(number1-number2);
		case'*':
			System.out.println(number1*number2);
		break;
		case '/':
			break;
			default:
			System.out.println(number1/number2);
		
		}
		
	}

}
