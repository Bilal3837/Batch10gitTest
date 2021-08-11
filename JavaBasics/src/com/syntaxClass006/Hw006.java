package com.syntaxClass006;

import java.util.Scanner;

public class Hw006 {

	public static void main(String[] args) {
		
		Scanner s;
		
		int num1, num2, num3, largest;
		
		s=new Scanner(System.in);
		System.out.println("Please enter three distinct Numbers");
		num1 = s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		
		if (num1>num2) {
			largest=num3;
			
		}else { // num2 is larger then num1 num2>num1
		
			if (num2>num3) {
				largest=num3;
				
			}else {
				largest=num2;
				
			}
		}
System.out.println("the largest number is "+largest);
	}

}
