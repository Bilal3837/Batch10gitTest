package com.syntax.Class007;

public class WhileLoopDemo {

	public static void main(String[] args) {
	
		
		// I want to print How are you 10 times

		int i=0;
		
		while (i<10) {
			System.out.println("How are you?");
		i++;
		
		}
		System.out.println("I want to print number from 1 to 20");
		int a=1;
		while(a<20) {
			System.out.println(a);
		a++;
		
		}
	System.out.println("i want to print number from 100 to 150");
	
	int b=100;
	
	while (b<=150) {
		System.out.print(b+" "); //with the spaces
	b++;
	
	}
	int c=10;
	while(c>=1) {
		System.out.println(c);
	c--;
	
	}
	
	System.out.println("i want to print number from 1 to 20");
	int num=1;
	while(num<21) {
		System.out.println(num);
		num+=2;
		
	}
	
	num=1;
	while (num<21) {
		if ( num %2 !=0) {
			System.out.println(num);
		
		}
		num++;
	}
	
	System.out.println("End of code");
	}

}
